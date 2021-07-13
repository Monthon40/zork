package io.muzoo.ssc.zork;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class World {

    public enum Direction{
        NORTH, SOUTH , EAST , WEST
    }

    //Keep track of all maps.
    private final HashMap<Class<? extends Map<?, D>>, Map<?, D>> map;

    public World(){
        this.map = new HashMap<>();
    }

    pubic World addMap(final Class<? extends Map<?, D>> mapName, final Map<?, D> newMap){
        this.map.put(mapName, newMap);
        return this;
    }

    public World addMap(final Class<? extends Map<?, D>> mapName){
        try{
            return this.addMap(mapName, mapName.getConstructor(World.class).newInstance(this));
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public < T extends Map<?, D>> T getMap(final Map<?, D> thisMap){
        return (T) this.map.get(thisMap);
    }

    public Map<?, D> getMap(Class<?> crass){
        return this.map.get(crass);
    }
}

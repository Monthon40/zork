package io.muzoo.ssc.zork;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Map<S extends Serializable> {

    private String description = "Description";
    private String name = "Default room name";
    private final World world;
    private final List<Item> items = new ArrayList<>();
    public S level = null;

    public Map(final World containWorld){
        this.world = containWorld;
    }

    public World getWorld(){
        return this.world;
    }

    public S level(){
        return this.level;
    }

    public Map<S> level(final S newLevel){
        this.level = newLevel;
        return this;
    }

    public List<Item> items(){
        return this.items;
    }

    public Map<S> addItem(final Item item){
        this.items.add(item);
        return this;
    }

    public Map<S> removeItem(final Item item){
        this.items.remove(item);
        return this;
    }

    public String description(){
        return this.description;
    }

    public Map<S> description(final String newDescription){
        this.description = newDescription;
        return this;
    }

    public void enter(final Player player){
        System.out.println(player.currentDescription);
    }
}

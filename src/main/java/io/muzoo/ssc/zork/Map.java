package io.muzoo.ssc.zork;

import java.awt.event.ItemEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Map {

    private String description = "Description";
    private String name = "Default room name";
    private final World world;
    private final List<Item> items = new ArrayList<>();
    public T level = null;

    public Map(final World containWorld){
        this.world = containWorld;
    }

    public World getWorld(){
        return this.world;
    }

    public T level(){
        return this.level;
    }

    public Map<T> level(final T newLevel){
        this.level = newLevel;
        return this;
    }

    public List<Item> items(){
        return this.items;
    }

    public Map<T> addItem(final Item item){
        this.items.add(item);
        return this;
    }

    public Map<T> removeItem(final Item item){
        this.items.remove(item);
        return this;
    }

    public String description(){
        return this.description;
    }

    public Map<T> description(final String newDescription){
        this.description = newDescription;
        return this;
    }

    public void enter(final Player player){
        System.out.println(player.currentDescription);
    }
}

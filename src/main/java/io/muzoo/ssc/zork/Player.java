package io.muzoo.ssc.zork;

import io.muzoo.ssc.zork.Main;

import java.util.ArrayList;
import java.util.List;

public class Player {


    public String currentDescription;
    private Main.Status death;
    private Map<?> currentPlace;
    private String name;
    private int hp;
    private int maxHp;
    private final List<Item> inventory;


    public Player(final int hp, final String name){
        this.hp = hp;
        this.maxHp = hp;
        this.death = Main.Status.PLAYING;
        this.inventory = new ArrayList<>();
        this.name = name;
    }

    public String currentDescription(){
        final StringBuilder desc = new StringBuilder();
        final Map<?> currentPlace = this.getCurrentPlace();
        desc.append(currentPlace.description());
        final List<Item> items = currentPlace.items();
        desc.append(this.name);
        desc.append('\n');
        desc.append("You have").append(this.hp).append(hp);
        desc.append('\n');
        desc.append("Your max Hp is").append(this.maxHp).append(maxHp);
        List<Item> inventory = this.getInventory();
        if(inventory.size() > 0){
            desc.append("Your items are:");
            for(final Item item: inventory){
                desc.append('\n');
                desc.append(item.getNameItem());   //.name()
            }
        }
        desc.append('\n');
        if(items.size() > 0){
            desc.append("This area have: ");
            for(final Item item: items){
                desc.append('\n');
                desc.append(item.getNameItem());   //.name()
            }
        }
        return desc.toString();
    }

    public Map<?> getCurrentPlace() {
        return this.currentPlace;
    }

    public void setCurrentPlace(final Map<?> area){
        this.currentPlace = area;
    }

    public List<Item> getInventory() {
        return inventory;
    }



    public Main.Status getDeath(){
        return this.death;
    }

    public void removeItem(final Item item){
        this.inventory.remove(item);
    }

    public boolean hasItem(final String name){
        for(final Item item: this.getInventory()){
            if(item.getNameItem().equals(name)){      //.name()
                return true;
            }
        }
        return false;
    }
//--------------------------------- unused ------------------
    public void setDeath(Main.Status death){
        death = Main.Status.DIE;
        this.death = death;
    }

    public void rename(final String newName){
        this.name = newName;
    }
    public void addItem(final Item item){
        this.inventory.add(item);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(final int ttt) {
        this.hp = ttt;
    }

    public void addHp(final int ttt){
        this.hp += ttt;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

}

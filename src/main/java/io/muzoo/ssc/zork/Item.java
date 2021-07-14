package io.muzoo.ssc.zork;

public class Item {

    private String nameItem = "Item name";

    private int damage = 0;

    public Item(){

    }



    public String getNameItem() {
        return nameItem;
    }

    public Item name(final String newName){
        this.nameItem = newName;
        return this;
    }


    public Item attack(final int power){
        this.damage = power;
        return this;
    }


}

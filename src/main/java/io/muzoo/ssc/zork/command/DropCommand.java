package io.muzoo.ssc.zork.command;

import io.muzoo.ssc.zork.Item;
import io.muzoo.ssc.zork.Main;
import io.muzoo.ssc.zork.Player;
import io.muzoo.ssc.zork.World;

public class DropCommand implements Command{
    @Override
    public void execute(String[] args, Main.Status level, Player player, World world) {
        if(level.equals(Main.Status.PLAYING)){
            Item item = new Item().nameItem(args[2]);
            if(item != null){
                player.removeItem(item);
                world.getMap(player)
            }
        }
    }
}

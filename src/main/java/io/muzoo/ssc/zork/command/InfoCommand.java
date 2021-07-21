package io.muzoo.ssc.zork.command;

import io.muzoo.ssc.zork.Main;
import io.muzoo.ssc.zork.Player;
import io.muzoo.ssc.zork.World;

public class InfoCommand implements Command{
    @Override
    public void execute(String[] args, Main.Status level, Player player, World world) {
        if(level.equals(Main.Status.PLAYING)){
            System.out.println(player.currentDescription());
        }
    }
}

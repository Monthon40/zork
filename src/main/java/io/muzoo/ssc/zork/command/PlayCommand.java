package io.muzoo.ssc.zork.command;

import io.muzoo.ssc.zork.Main;
import io.muzoo.ssc.zork.Player;
import io.muzoo.ssc.zork.StartPlace;
import io.muzoo.ssc.zork.World;
import io.muzoo.ssc.zork.command.Command;

public class PlayCommand implements Command {

    @Override
    public void execute(String[] args, Main.Status level, Player player, World world) {
        if(level.equals(Main.Status.MENU)) {
            player.setCurrentPlace(world.getMap(StartPlace.class));
            player.getCurrentPlace().enter(player);
            level = Main.Status.PLAYING;
        }else{
            System.out.println(   "----------------------------\n"
                                + "Not able to use this command\n"
                                + "----------------------------\n");
        }
    }
}

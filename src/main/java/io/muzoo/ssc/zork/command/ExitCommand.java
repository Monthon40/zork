package io.muzoo.ssc.zork.command;

import io.muzoo.ssc.zork.Main;
import io.muzoo.ssc.zork.Player;
import io.muzoo.ssc.zork.World;



public class ExitCommand implements Command{


    @Override
    public void execute(String[] args, Main.Status level, Player player, World world) {
        if(level.equals(Main.Status.MENU)){
            System.out.println(   "-----------------\n"
                                + "Successfully Exit\n"
                                + "-----------------");
            System.exit(0);
        } else{
            System.out.println("----------------------------\n"
                                + "Not able to use this command\n"
                                + "----------------------------\n");
        }
    }
}

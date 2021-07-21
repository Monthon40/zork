package io.muzoo.ssc.zork.command;


import io.muzoo.ssc.zork.Main;
import io.muzoo.ssc.zork.Player;
import io.muzoo.ssc.zork.World;


public interface Command {

    void execute(String[] args, Main.Status level, Player player, World world);
}

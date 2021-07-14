package io.muzoo.ssc.zork.command;

import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.Main;
import io.muzoo.ssc.zork.Player;
import io.muzoo.ssc.zork.World;

import java.util.List;

public interface Command {

    int numArgs();

    String getCommand();

//    void execute(Game game, List<String> strings);

    void execute(String[] args, Main.Status level, Player player, World world);
}

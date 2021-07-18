package io.muzoo.ssc.zork.command;

import io.muzoo.ssc.zork.Main;
import io.muzoo.ssc.zork.Player;
import io.muzoo.ssc.zork.World;

public class CommandHelp implements Command{

    private final String helpText = "\n"
            + "========================\n"
            + "   help - Print out all command.\n"
            + "========================\n"
            + "      Menu Command\n"
            + "========================\n"
            + "   exit - Exit of the game.\n"
            + "   play {map-name} - Load the map\n"
            + "   load {saved-point-name} - Load save file\n"
            + "========================\n"
            + "      In-game Command\n"
            + "========================\n"
            + "   info - Give players and current map details.\n"
            + "   take {item} - Pick up item in the room.\n"
            + "   drop {item} - Drop an item in the inventory.\n"
            + "   attack with {item} - Attack with an item.\n"
            + "   go {direction} - Move north, south, east, west.\n"
            + "   map - Show the map.\n"
            + "   autopilot {file} - Run the game by the input file.\n"
            + "   quit - Exit back to Menu.\n"
            + "   save {name} - Save the game.\n"
            + "========================\n";


    @Override
    public void execute(final String[] args, final Main.Status level, Player player, World world) {
        System.out.println(helpText);
    }
}

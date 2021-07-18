package io.muzoo.ssc.zork;

import io.muzoo.ssc.zork.command.Command;
import io.muzoo.ssc.zork.command.CommandFactory;


import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Main {


    Status level = Status.MENU;

    public enum Status {
        PLAYING, WIN, DIE, MENU
    }

    public static void main(String[] args) {



        final Player player = new Player(10, "test");
        final World world = new World();
        Scanner scanner = new Scanner(System.in);
        Main game = new Main();
        player.getCurrentPlace().enter(player);
        try (Scanner reader = new Scanner(System.in)) {
            Status death = null;
            while ((death = player.getDeath()) == Status.PLAYING) {
                final io.muzoo.ssc.zork.Map<?> currentMap
                        = player.getCurrentPlace();
                final String currentTitle = currentMap.title();
                System.out.println(currentTitle);
            }
            System.out.println(" $ Zork $>");
            final String input = reader.nextLine();
            String[] cmds = input.split(" ");
            Command cmd = CommandFactory.getCommand(cmds[0]);
            if (cmd != null) {
                cmd.execute(cmds, level, player, world);
            }
            System.out.println("What?");
        }
    }


        public static final Map<String, World.Direction> ttt = Main.ttt();

        private static Map<String, World.Direction> ttt() {
            final Map<String, World.Direction> map = new HashMap<>();
            map.put("north", World.Direction.NORTH);
            map.put("south", World.Direction.SOUTH);
            map.put("east", World.Direction.EAST);
            map.put("west", World.Direction.WEST);
            return map;
        }
}

package io.muzoo.ssc.zork.command;

import io.muzoo.ssc.zork.Game;

import java.util.List;

public class ExitCommand implements Command{

    @Override
    public int numArgs() {
        return 1;
    }

    @Override
    public String getCommand() {
        return "exit";
    }

    @Override
    public void execute(Game game, List<String> args) {
        game.getOutput().println("Game exit");
        game.exit();
    }
}

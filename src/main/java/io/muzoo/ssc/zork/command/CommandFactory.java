package io.muzoo.ssc.zork.command;

import io.muzoo.ssc.zork.command.Command;
import io.muzoo.ssc.zork.command.ExitCommand;

import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.Map;

public final class CommandFactory {

//    private static final List<Class<? extends Command>> REGISTERED_COMMANDS = Arrays.asList(
//            ExitCommand.class
//    );
//
//    private static final Map<String, Command> COMMAND_MAP = new HashMap<>();
//
//    static{{
//        for(Class<? extends Command> commandClass: REGISTERED_COMMANDS){
//            try {
//                Command command = commandClass.getDeclaredConstructor().newInstance();
//                COMMAND_MAP.put(command.getCommand(), command);
//            } catch (InstantiationException e) {
//                e.printStackTrace();
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            } catch (InvocationTargetException e) {
//                e.printStackTrace();
//            } catch (NoSuchMethodException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    }
//
//    public static Command get(String command){
//        return COMMAND_MAP.get(command);
//    }
//
//    public static List<String> getAllCommands(){
//        return COMMAND_MAP.keySet().stream().collect(Collectors.toList());
//    }

    private CommandFactory(){

    }

    private static final Map<String, Command> COMMAND_MAP = new HashMap<>();

    static{
        COMMAND_MAP.put("play", new PlayCommand());
        COMMAND_MAP.put("drop", new DropCommand());
        COMMAND_MAP.put("exit", new ExitCommand());
        COMMAND_MAP.put("info", new InfoCommand());
        COMMAND_MAP.put("help", new CommandHelp());
    }

    public static Command getCommand(final String cmd){
        return COMMAND_MAP.get(cmd);
    }
}

package me.minemis.msmcshop.commandsSystem;

import me.minemis.msmcshop.commandsSystem.commands.CommandExecutor;

import java.util.List;

public class CommandData {
    private final CommandExecutor command;
    private final CommandID id;
    private final String name;
    private final List<String> aliases;

    public CommandData(CommandExecutor command, CommandID id, String name, List<String> aliases) {
        this.command = command;
        this.id = id;
        this.name = name;
        this.aliases = aliases;
    }

    public CommandID getId() {
        return id;
    }

    public CommandExecutor getCommand() {
        return command;
    }

    public String getName() {
        return name;
    }

    public List<String> getAliases() {
        return aliases;
    }
}

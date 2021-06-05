package me.minemis.msmcshop.commandsSystem;

import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class CommandInstance extends BukkitCommand {

    private final CommandID id;
    private final CommandManager commandManager;

    protected CommandInstance(CommandID id, @NotNull String name, @NotNull List<String> aliases, CommandManager commandManager) {
        super(name, "", "/" + name, aliases);
        this.id = id;
        this.commandManager = commandManager;
    }

    @Override
    public boolean execute(@NotNull CommandSender sender, @NotNull String label, @NotNull String[] args) {
        commandManager.runCommand(id, sender, label, args);
        return false;
    }
}

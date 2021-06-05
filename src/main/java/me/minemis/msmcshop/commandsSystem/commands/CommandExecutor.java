package me.minemis.msmcshop.commandsSystem.commands;

import org.bukkit.command.CommandSender;

public interface CommandExecutor {
    void execute(CommandSender sender, String label, String[] args);
}

package me.minemis.msmcshop.commandsSystem.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestCommand implements CommandExecutor{
    @Override
    public void execute(CommandSender sender, String label, String[] args) {

        if (!(sender instanceof Player)){
            return;
        }

        Player player = (Player) sender;

        player.sendMessage("Zostałeś wytestowany frajerze");
    }
}

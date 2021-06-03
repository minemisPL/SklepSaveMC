package me.minemis.msmcshop.commands;

import me.minemis.msmcshop.gui.GuiEnum;
import me.minemis.msmcshop.gui.GuiManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ShopCommand implements CommandExecutor {

    private final GuiManager guiManager;

    public ShopCommand(GuiManager guiManager) {
        this.guiManager = guiManager;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        if (!(commandSender instanceof Player)){
            return true;
        }

        Player player = (Player) commandSender;

        player.openInventory(guiManager.getInventory(GuiEnum.SHOP_MENU));

        return true;
    }

}

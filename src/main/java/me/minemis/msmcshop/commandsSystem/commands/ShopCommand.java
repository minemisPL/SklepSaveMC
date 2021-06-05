package me.minemis.msmcshop.commandsSystem.commands;

import me.minemis.msmcshop.gui.GuiIID;
import me.minemis.msmcshop.gui.GuiManager;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ShopCommand implements CommandExecutor{

    private final GuiManager guiManager;

    public ShopCommand(GuiManager guiManager) {
        this.guiManager = guiManager;
    }

    @Override
    public void execute(CommandSender sender, String label, String[] args) {
        if (!(sender instanceof Player)){
            return;
        }

        Player player = (Player) sender;

        player.openInventory(guiManager.getInventory(GuiIID.SHOP_MENU));
    }

}

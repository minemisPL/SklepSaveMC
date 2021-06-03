package me.minemis.msmcshop;

import me.minemis.msmcshop.commands.ShopCommand;
import me.minemis.msmcshop.gui.GuiManager;
import me.minemis.msmcshop.listeners.InventoryClick;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class MSMCShop extends JavaPlugin {

    private GuiManager guiManager;

    @Override
    public void onEnable() {
        guiManager = new GuiManager();
        PluginManager pm = Bukkit.getPluginManager();

        pm.registerEvents(new InventoryClick(guiManager), this);

        this.getCommand("shop").setExecutor(new ShopCommand(guiManager));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public GuiManager getGuiManager() {
        return guiManager;
    }
}

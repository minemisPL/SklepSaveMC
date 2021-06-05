package me.minemis.msmcshop;

import me.minemis.msmcshop.commandsSystem.CommandManager;
import me.minemis.msmcshop.gui.GuiManager;
import me.minemis.msmcshop.listeners.InventoryClick;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class MSMCShop extends JavaPlugin {

    private GuiManager guiManager;
    private CommandManager commandManager;

    @Override
    public void onEnable() {
        guiManager = new GuiManager();
        commandManager = new CommandManager(guiManager);
        PluginManager pm = Bukkit.getPluginManager();

        commandManager.registerCommands();

        pm.registerEvents(new InventoryClick(guiManager), this);
    }

    @Override
    public void onDisable() {
        commandManager.unregisterCommands();
    }

    public GuiManager getGuiManager() {
        return guiManager;
    }

}

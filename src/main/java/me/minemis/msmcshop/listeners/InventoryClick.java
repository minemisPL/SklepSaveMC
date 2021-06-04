package me.minemis.msmcshop.listeners;

import me.minemis.msmcshop.gui.GuiManager;
import me.minemis.msmcshop.gui.holders.SMCInventoryHolder;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class InventoryClick implements Listener {

    private final GuiManager guiManager;

    public InventoryClick(GuiManager guiManager) {
        this.guiManager = guiManager;
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event){
        Inventory inventory = event.getClickedInventory();

        if (inventory == null || !(inventory.getHolder() instanceof SMCInventoryHolder)){
            return;
        }

        event.setCancelled(true);

        SMCInventoryHolder holder = (SMCInventoryHolder) inventory.getHolder();

        guiManager.runClick(holder.getId(), event);

    }
}
package me.minemis.msmcshop.listeners;

import me.minemis.msmcshop.gui.GuiManager;
import me.minemis.msmcshop.gui.clickExecutors.TestExecutor;
import me.minemis.msmcshop.gui.holders.SMCInventoryHolder;
import me.minemis.msmcshop.gui.clickExecutors.ShopMenuExecutor;
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
        Inventory inventory = event.getInventory();

        if (!(inventory.getHolder() instanceof SMCInventoryHolder)){
            return;
        }
        System.out.println("Instance of SMCInventoryHolder test");

        event.setCancelled(true);

        SMCInventoryHolder holder = (SMCInventoryHolder) inventory.getHolder();

        //TODO: We ogarnij to. Te enumy w switchu to jakiś rak
        //TODO: Automatyzacja ma być jakaś np. guiManager.runClick(holder.getId());
        //TODO: I w tym GuiManager#runClick(GuiEnum id) nie ma być switcha.

        switch (holder.getId()) {
            case SHOP_MENU: new ShopMenuExecutor(guiManager).execute(event); break;
            case TEST: new TestExecutor().execute(event); break;
        }

        System.out.println("Switch test");

    }
}
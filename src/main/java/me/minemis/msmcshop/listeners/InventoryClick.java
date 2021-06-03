package me.minemis.msmcshop.listeners;

import me.minemis.msmcshop.gui.GuiManager;
import me.minemis.msmcshop.gui.clickExecutors.TestExecutor;
import me.minemis.msmcshop.gui.holders.SMCInventoryHolder;
import me.minemis.msmcshop.gui.clickExecutors.ShopMenuExecutor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClick implements Listener {

    private final GuiManager guiManager;

    public InventoryClick(GuiManager guiManager) {
        this.guiManager = guiManager;
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event){

        if (event.getClickedInventory() == null){
            return;
        }
        System.out.println("Inventory null test");

        if (!(event.getClickedInventory().getHolder() instanceof SMCInventoryHolder)){
            return;
        }
        System.out.println("Instance of SMCInventoryHolder test");

        event.setCancelled(true);

        SMCInventoryHolder holder = (SMCInventoryHolder) event.getClickedInventory().getHolder();

        if (holder == null){
            return;
        }

        System.out.println("Holder null test");

        switch (holder.getId()){
            case SHOPMENU: new ShopMenuExecutor(guiManager).execute(event); break;
            case TEST: new TestExecutor().execute(event); break;
        }

        System.out.println("Switch test");

    }
}
package me.minemis.msmcshop.gui.clickExecutors;

import org.bukkit.event.inventory.InventoryClickEvent;

public class TestExecutor implements ClickExecutor {
    @Override
    public void execute(InventoryClickEvent event) {
        System.out.println("Everything is fine");
        event.setCancelled(true);
    }
}

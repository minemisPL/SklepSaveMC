package me.minemis.msmcshop.gui.clickExecutors;

import me.minemis.msmcshop.gui.GuiEnum;
import me.minemis.msmcshop.gui.GuiManager;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;

public class ShopMenuExecutor implements ClickExecutor {

    private final GuiManager guiManager;

    public ShopMenuExecutor(GuiManager guiManager) {
        this.guiManager = guiManager;
    }

    @Override
    public void execute(InventoryClickEvent event) {

        event.setCancelled(true);

        if (event.getCurrentItem() == null){
            return;
        }

        Player player = (Player) event.getWhoClicked();

        if (event.getCurrentItem().getType() == Material.GOLD_INGOT){
            System.out.println("ShopMenuExecutor material test");

            player.openInventory(guiManager.getInventory(GuiEnum.TEST));
        }
    }
}

package me.minemis.msmcshop.gui.clickExecutors;

import me.minemis.msmcshop.gui.GuiIID;
import me.minemis.msmcshop.gui.GuiManager;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class ShopMenuExecutor implements ClickExecutor {

    private final GuiManager guiManager;

    public ShopMenuExecutor(GuiManager guiManager) {
        this.guiManager = guiManager;
    }

    @Override
    public void execute(InventoryClickEvent event) {
        ItemStack item = event.getCurrentItem();

        if (item == null){
            return;
        }

        Player player = (Player) event.getWhoClicked();

        if (item.getType() == Material.GOLD_INGOT) {
            guiManager.openInventory(player, GuiIID.TEST);
            player.openInventory(guiManager.getInventory(GuiIID.TEST));
        }
    }
}

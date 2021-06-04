package me.minemis.msmcshop.gui.creators;

import me.minemis.msmcshop.gui.holders.ShopMenuGui;
import org.bukkit.inventory.Inventory;

public class ShopMenuGuiCreator implements GuiCreator {
    @Override
    public Inventory createGui() {
        return new ShopMenuGui().getInventory();
    }
}

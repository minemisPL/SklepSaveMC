package me.minemis.msmcshop.gui.creators;

import me.minemis.msmcshop.gui.holders.TestGui;
import org.bukkit.inventory.Inventory;

public class TestCreator implements GuiCreator{
    @Override
    public Inventory createGui() {
        return new TestGui().getInventory();
    }
}

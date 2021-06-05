package me.minemis.msmcshop.gui.creators;

import me.minemis.msmcshop.gui.GuiBuilder;
import me.minemis.msmcshop.gui.GuiIID;
import me.minemis.msmcshop.gui.holders.SMCInventoryHolder;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

public class TestCreator implements GuiCreator{
    @Override
    public Inventory createGui() {
        SMCInventoryHolder holder = new SMCInventoryHolder(GuiIID.TEST);
        GuiBuilder builder = new GuiBuilder(holder, 6, "SaveMC sklep - test");

        builder.setItem(Material.DIAMOND_BLOCK, 15, 32);
        builder.setItem(Material.DIAMOND_BLOCK, 20, 16);

        Inventory inventory = builder.getInventory();
        holder.setInventory(inventory);
        return inventory;
    }
}

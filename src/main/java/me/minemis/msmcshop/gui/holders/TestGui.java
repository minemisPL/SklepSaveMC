package me.minemis.msmcshop.gui.holders;

import me.minemis.msmcshop.gui.GuiBuilder;
import me.minemis.msmcshop.gui.GuiEnum;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

public class TestGui implements SMCInventoryHolder {

    private final Inventory inventory;
    private final GuiEnum id = GuiEnum.TEST;

    public TestGui(){
        GuiBuilder holder = new GuiBuilder(this, 6, "SaveMC sklep - test");

        holder.setItem(Material.DIAMOND_BLOCK, 15, 32);
        holder.setItem(Material.DIAMOND_BLOCK, 20, 16);

        inventory = holder.getInventory();
    }

    @Override
    public @NotNull Inventory getInventory() {
        return inventory;
    }

    @Override
    public GuiEnum getId() {
        return id;
    }
}

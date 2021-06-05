package me.minemis.msmcshop.gui.holders;

import me.minemis.msmcshop.gui.GuiIID;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public class SMCInventoryHolder implements InventoryHolder {

    private Inventory inventory;
    private final GuiIID id;

    public SMCInventoryHolder(GuiIID id) {
        this.id = id;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public @NotNull Inventory getInventory() {
        return inventory;
    }

    public GuiIID getId() {
        return id;
    }
}

package me.minemis.msmcshop.gui.holders;

import me.minemis.msmcshop.gui.GuiBuilder;
import me.minemis.msmcshop.gui.GuiEnum;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

public class ShopMenuGui implements SMCInventoryHolder {

    private final Inventory inventory;
    private final GuiEnum id;

    public ShopMenuGui(GuiEnum id){
        GuiBuilder holder = new GuiBuilder(this, 1, "SaveMC sklep");
        this.id = id;

        holder.addItem(Material.GOLD_INGOT, 3);
        holder.setItemStackMeta(3,"§eKup", "Kup se dirta byku", "Albo jakieś jajko se pierdolnij");

        holder.addItem(Material.IRON_INGOT, 5);
        holder.setItemStackMeta(5,"§6Sprzedaj", "Sprzedaj złom byniu");

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

package me.minemis.msmcshop.gui.holders;

import me.minemis.msmcshop.gui.GuiBuilder;
import me.minemis.msmcshop.gui.GuiEnum;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

public class ShopMenuGui implements SMCInventoryHolder {

    private final Inventory inventory;
    private final GuiEnum id = GuiEnum.SHOP_MENU;

    public ShopMenuGui() {
        GuiBuilder builder = new GuiBuilder(this, 1, "SaveMC sklep");

        builder.setItem(Material.GOLD_INGOT, 3, 1, "§eKup", "Kup se dirta byku", "Albo jakieś jajko se pierdolnij");
        builder.setItem(Material.IRON_INGOT, 5, 1, "§6Sprzedaj", "Sprzedaj złom byniu");

        inventory = builder.getInventory();
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

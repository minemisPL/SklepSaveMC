package me.minemis.msmcshop.gui.creators;

import me.minemis.msmcshop.gui.GuiBuilder;
import me.minemis.msmcshop.gui.GuiIID;
import me.minemis.msmcshop.gui.holders.SMCInventoryHolder;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

public class ShopMenuGuiCreator implements GuiCreator {
    @Override
    public Inventory createGui() {
        SMCInventoryHolder holder = new SMCInventoryHolder(GuiIID.SHOP_MENU);
        GuiBuilder builder = new GuiBuilder(holder, 1, "§eSaveMC sklep");

        builder.setItem(Material.GOLD_INGOT, 3, 1, "§eKup", "Kup se dirta byku", "Albo jakieś jajko se pierdolnij");
        builder.setItem(Material.IRON_INGOT, 5, 1, "§6Sprzedaj", "Sprzedaj złom byniu");

        Inventory inventory = builder.getInventory();
        holder.setInventory(inventory);
        return inventory;
    }
}

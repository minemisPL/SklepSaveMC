package me.minemis.msmcshop.gui;

import me.minemis.msmcshop.gui.holders.ShopMenuGui;
import me.minemis.msmcshop.gui.holders.TestGui;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

import java.util.HashMap;
import java.util.Map;

public class GuiManager {

    //TODO: Naprawić code bo nie działa (generuj dla każdego wywołania komendy przez gracza)
    private final Map<GuiEnum, InventoryHolder> guiMap = new HashMap<>();

    public GuiManager(){
        guiMap.put(GuiEnum.SHOP_MENU, new ShopMenuGui(GuiEnum.SHOP_MENU));
        guiMap.put(GuiEnum.TEST , new TestGui(GuiEnum.TEST));
    }

    public Map<GuiEnum, InventoryHolder> getGuiMap() {
        return guiMap;
    }

    public Inventory getInventory(GuiEnum name) {
        return guiMap.get(name).getInventory();
    }

}

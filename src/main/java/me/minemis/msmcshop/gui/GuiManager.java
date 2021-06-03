package me.minemis.msmcshop.gui;

import me.minemis.msmcshop.gui.holders.ShopMenuGui;
import me.minemis.msmcshop.gui.holders.TestGui;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

import java.util.HashMap;
import java.util.Map;

public class GuiManager {
    private final Map<GuiEnum, InventoryHolder> guiMap = new HashMap<>();

    public GuiManager(){
        guiMap.put(GuiEnum.SHOPMENU, new ShopMenuGui(GuiEnum.SHOPMENU));
        guiMap.put(GuiEnum.TEST , new TestGui(GuiEnum.TEST));
    }

    public Map<GuiEnum, InventoryHolder> getGuiMap() {
        return guiMap;
    }

    public Inventory getInventory(GuiEnum name){
        return guiMap.get(name).getInventory();
    }
}

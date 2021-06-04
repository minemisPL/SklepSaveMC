package me.minemis.msmcshop.gui;

import me.minemis.msmcshop.gui.clickExecutors.ClickExecutor;
import me.minemis.msmcshop.gui.clickExecutors.ShopMenuExecutor;
import me.minemis.msmcshop.gui.clickExecutors.TestExecutor;
import me.minemis.msmcshop.gui.creators.GuiCreator;
import me.minemis.msmcshop.gui.creators.ShopMenuGuiCreator;
import me.minemis.msmcshop.gui.creators.TestCreator;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import java.util.HashMap;
import java.util.Map;

public class GuiManager {

    private final Map<GuiEnum, GuiCreator> guiMap = new HashMap<>();
    private final Map<GuiEnum, ClickExecutor> executorMap = new HashMap<>();

    public GuiManager(){
        guiMap.put(GuiEnum.SHOP_MENU, new ShopMenuGuiCreator());
        guiMap.put(GuiEnum.TEST, new TestCreator());

        executorMap.put(GuiEnum.SHOP_MENU, new ShopMenuExecutor(this));
        executorMap.put(GuiEnum.TEST, new TestExecutor());
    }

    public void runClick(GuiEnum id, InventoryClickEvent event){
        executorMap.get(id).execute(event);
    }

    public Map<GuiEnum, GuiCreator> getGuiMap() {
        return guiMap;
    }

    public Inventory getInventory(GuiEnum id) {
        return guiMap.get(id).createGui();
    }

}

package me.minemis.msmcshop.gui;

import me.minemis.msmcshop.gui.clickExecutors.ShopMenuExecutor;
import me.minemis.msmcshop.gui.clickExecutors.TestExecutor;
import me.minemis.msmcshop.gui.creators.ShopMenuGuiCreator;
import me.minemis.msmcshop.gui.creators.TestCreator;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import java.util.HashMap;
import java.util.Map;

public class GuiManager {

    private final Map<GuiIID, GuiData> guiMap = new HashMap<>();

    public GuiManager() {
        guiMap.put(GuiIID.SHOP_MENU, new GuiData(new ShopMenuGuiCreator(), new ShopMenuExecutor(this)));
        guiMap.put(GuiIID.TEST, new GuiData(new TestCreator(), new TestExecutor()));
    }

    public void runClick(GuiIID id, InventoryClickEvent event){
        guiMap.get(id).getExecutor().execute(event);
    }

    public Inventory getInventory(GuiIID id) {
        return guiMap.get(id).getCreator().createGui();
    }

    @Deprecated
    public void openInventory(Player player, GuiIID id) {
        player.openInventory(guiMap.get(id).getCreator().createGui());
    }
}

package me.minemis.msmcshop.gui;

import me.minemis.msmcshop.utils.ChatUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;
import java.util.Arrays;

public class GuiBuilder implements InventoryHolder {

    private final InventoryHolder holder;
    private  final int size;
    private Inventory inventory;

    public GuiBuilder(InventoryHolder holder, int rows, String title){

        this.holder = holder;

        if (rows > 6){
            this.size = 54;
            return;
        }
        this.size = rows * 9;
        inventory = Bukkit.createInventory(holder, size, title);
    }

    @Deprecated
    public void setItem(Material material, int position, int amount) {
        if (position >= size) {
            position = size - 1;
        }

        inventory.setItem(position, new ItemStack(material, amount));
    }

    public void setItem(Material material, int position, int amount, String name, String... lore) {
        if (position >= size) {
            position = size - 1;
        }

        ItemStack item = new ItemStack(material, amount);
        ItemMeta meta = item.getItemMeta();

        if (name != null) {
            meta.setDisplayName(ChatUtils.color(name));
        }

        if (lore != null && lore.length != 0) {
            meta.setLore(ChatUtils.color(Arrays.asList(lore)));
        }

        item.setItemMeta(meta);
        inventory.setItem(position, item);
    }

    public void setItem(Material material, int position){
        if (position >= size) {
            position = size - 1;
        }

        inventory.setItem(position, new ItemStack(material));
    }

    public void addItem(Material material, int amount){
        inventory.addItem(new ItemStack(material, amount));
    }

    public void addItem(Material material){
        inventory.addItem(new ItemStack(material));
    }

    public ItemStack getItemStack(int index) {
        return inventory.getItem(index);
    }

    @Deprecated
    public void setItemStackMeta(int index, String name, String... lore) {
        ItemStack item = inventory.getItem(index);

        if (item == null || item.getItemMeta() == null){
            return;
        }

        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(name);
        meta.setLore(Arrays.asList(lore));
        item.setItemMeta(meta);
    }

    @Deprecated
    public void setItemStackMeta(int index, String name){
        ItemStack item = inventory.getItem(index);

        if (item == null || item.getItemMeta() == null){
            return;
        }

        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(name);
        item.setItemMeta(meta);
    }

    public InventoryHolder getHolder() {
        return holder;
    }

    @Override
    public @NotNull Inventory getInventory() {
        return inventory;
    }
}

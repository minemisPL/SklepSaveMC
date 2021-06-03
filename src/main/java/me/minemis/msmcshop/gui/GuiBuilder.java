package me.minemis.msmcshop.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    public void addItem(Material material, int position, int amount){
        if (position > size) position = size;
        inventory.setItem(position, new ItemStack(material, amount));
    }

    public void addItem(Material material, int position){
        if (position > size) position = size;
        inventory.setItem(position, new ItemStack(material));
    }

    public void addItem(Material material, long amount){
        inventory.addItem(new ItemStack(material, (int) amount));
    }

    public void addItem(Material material){
        inventory.addItem(new ItemStack(material));
    }

    public ItemStack getItemStack(int index){
        return inventory.getItem(index);
    }

    public void setItemStackMeta(int index, String name, String... lore){
        if (inventory.getItem(index) == null || inventory.getItem(index).getItemMeta() == null){
            return;
        }
        ItemStack item = inventory.getItem(index);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(Arrays.asList(lore));
        item.setItemMeta(meta);
    }

    public void setItemStackMeta(int index, String name){
        if (inventory.getItem(index) == null || inventory.getItem(index).getItemMeta() == null){
            return;
        }

        ItemStack item = inventory.getItem(index);
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

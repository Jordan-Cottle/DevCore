package core.dev;

import org.bukkit.Bukkit;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

import core.dev.base.BaseInventory;

public class SimpleInventory extends BaseInventory {

    /**
     * Creates a virtual {@link Inventory} of type {@link InventoryType.CHEST} of
     * specified size.
     * 
     * @param size The number of slots the inventory should contain. Must be a
     *             multiple of 9.
     */
    public SimpleInventory(int size) {
        inventory = Bukkit.createInventory(null, size);
    }

}
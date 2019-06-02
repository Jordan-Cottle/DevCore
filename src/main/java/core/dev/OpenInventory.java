package core.dev;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class OpenInventory implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if (!(sender instanceof Player)){
            return false;
        }

        Player player = (Player) sender;

        SimpleInventory inventory = new SimpleInventory(9);
        ItemStack item = new ItemStack(Material.APPLE, 8);

        inventory.addItem(item);

        player.openInventory(inventory);

        return true;
    }
}
package io.github.footballmatt01.explodingArrows;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class giveKit implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
			
			//New ItemStack
			ItemStack diamond = new ItemStack(Material.DIAMOND);
			
			ItemStack bricks = new ItemStack(Material.BRICK, 20);
			
			//Give Player the Items
			player.getInventory().addItem(bricks, diamond);
			
		}
		
		//If player executes command correctly we return true
		return false;
	}

}

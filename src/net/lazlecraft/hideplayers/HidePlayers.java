package net.lazlecraft.hideplayers;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class HidePlayers extends JavaPlugin {

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Lol console, you crazy");
            return false;
        }
        Player p = (Player) sender;
        if (commandLabel.equalsIgnoreCase("hideplayers") || commandLabel.equalsIgnoreCase("hideppl") && p.hasPermission("hide.people")) {
        	   	for (Player ppl : Bukkit.getOnlinePlayers()) {
        	   		if (p.canSee(ppl))
        	   			p.hidePlayer(ppl);
        	   		else {
        	   			p.showPlayer(ppl);
        	   	}
        	}
        } return false;
	}
}
	
package me.SirAlex.SimpleOide;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class SimpleOide extends JavaPlugin{

	public void onDisable() {
		
		System.out.println("[SimpleOide] disabled!");
	}

	public void onEnable() {
		
		System.out.println("[SimpleOide] enabled!");
	}
    
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		boolean succeed = false;
		
		if (sender instanceof Player) {
		    Player player = (Player) sender;
		    if (cmd.getName().equalsIgnoreCase("oide")){
		    	   if (args.length == 1){
		    		Player target = Bukkit.getPlayerExact(args[0]);
		    		target.setHealth(0);
		    		target.setAllowFlight(true);
		    		target.setFlying(true);
		    		target.sendMessage(ChatColor.GREEN + "[SimpleOide] " + "Du wurdest geoidet!");
		    		target.getPlayer().chat(ChatColor.RED +"Ich oide herum!");
		    		
		    		succeed = true;
		    		 {
		    		player.sendMessage(ChatColor.GREEN + "[SimpleOide] " + ChatColor.GREEN + "Es wurde erfolgreich herumgeoidet!");
		    	}
		    }
	    	   if (args.length == 0){
	    		player.sendMessage(ChatColor.RED + "[SimpleOide] " + "Du musst einen Spielernamen eingeben!");
	    		
	    		succeed = true;
	    	   }
	    }
    }
		return succeed;
	}
}

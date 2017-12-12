package com.dwc;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import net.minecraft.server.v1_8_R3.CommandExecute;

public class BugReporter extends CommandExecute implements Listener, CommandExecutor{
	public String wild = "wild";
	public String seebug = "seebug";
	public String reload = "dwcreload";
	public String delbug = "delbug";
	public String bug = "bug";
	ArrayList<Player> cooldown = new ArrayList<Player>();
	private Main plugin = Main.getPlugin(Main.class);	
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    Player player = (Player) sender;
		
		FileConfiguration config = plugin.getConfig();
		//Reporting a bug
		if (cmd.getName().equalsIgnoreCase(bug) && sender instanceof Player) {
			
			if (args.length >= 1) {
				
				String bugMessage = "";
				
				for (String arg : args) {
					bugMessage = bugMessage + arg + " ";
				}
				
				//Handeling the argument
				if(!config.contains(player.getName().toLowerCase())) {
					config.set(player.getName().toLowerCase(), bugMessage);
					player.sendMessage(ChatColor.GREEN + "Bug report sent.");
					plugin.saveConfig();
				} else player.sendMessage(ChatColor.RED + "Bug Already Known!");
				
			} else player.sendMessage(ChatColor.RED + "Usage: /bug <bugreport>");
			
		    
			
			return true;
			
		}
		//Viewing all bugs
		if (cmd.getName().equalsIgnoreCase(seebug) && sender instanceof Player) {
			
			if (player.isOp()) {
					
				//Iterating through each bug report to config
				for (String key : config.getKeys(false)) {
					player.sendMessage(ChatColor.GOLD + key + ": " + config.getString(key));
				}
				
				if (config.getKeys(false).isEmpty()) {
					player.sendMessage(ChatColor.GREEN + "No Bugs Found!");
				}
				
			} else 	player.sendMessage(ChatColor.RED + "An OP will take Care of that!");
			
			
			
			return true;
		}
		//deleting a bug
		if (cmd.getName().equalsIgnoreCase(delbug) && sender instanceof Player) {
			if (args.length == 1 && player.isOp()) {
				if (config.contains(args[0].toLowerCase())) {
					config.set(args[0].toLowerCase(), null);
					plugin.saveConfig();
					player.sendMessage(ChatColor.GREEN + "Bug deleted Succesfully");
				
				} else player.sendMessage(ChatColor.RED + "Player not found!");
				
			}else 
				player.sendMessage(ChatColor.RED + "Insufficient Permission.");
			
			return true;
        }
		if (cmd.getName().equalsIgnoreCase("dwcreload")&& sender instanceof Player) {
            if(player.isOp()) {
			plugin.reloadConfig();
            sender.sendMessage(ChatColor.GREEN + "Reloaded the plugin!");
		} else
			player.sendMessage(ChatColor.RED + "Insufficient Permissions!");
            return true;
		}
		if (cmd.getName().equalsIgnoreCase("wild") && sender instanceof Player) {
			if(cooldown.contains(player)) {
				player.sendMessage(ChatColor.RED + "You must wait 60 seconds to teleport again!");
				return true;
			}

            //the original location you are
			 Location originalLocation = player.getLocation();
           
            //Randomize
			 Random random = new Random();
           
            //Makes the teleportLocation null
			 Location teleportLocation = null;
           
            //sends you 1000 blocks away on the x coordinates
			 int x = random.nextInt(1000) + 1;
            int y = 150;
            //sends you 1000 blocks away on the z coordinates
            int z = random.nextInt(1000) + 1;
           
            //makes sure your on the land
            boolean isOnLand = false;
           
           //this means if your NOT on land this will happen
            while (isOnLand == false) {

                //signifys the new location    
           	 teleportLocation = new Location(player.getWorld(), x, y, z);
                   
                //if your in the air it will send you to the land    
           	 if (teleportLocation.getBlock().getType() != Material.AIR) {
                            isOnLand = true;
                    } else y--;
           
            }
           
            //this runs the command
            player.teleport(new Location(player.getWorld(), teleportLocation.getX(), teleportLocation.getY() + 1, teleportLocation.getZ()));
           //this is the coomand
            player.sendMessage(ChatColor.GREEN + "You have been teleported " + (int)teleportLocation.distance(originalLocation) + " blocks away!");
           cooldown.add(player);
            Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin , new Runnable() {
        	   public void run() {
        		   cooldown.remove(player);
        	   }
        	   
           }, 1200);
            return true;
		}
		return false;
	}
}



package com.dwc;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import net.minecraft.server.v1_8_R3.CommandExecute;

public class Commands extends CommandExecute implements Listener, CommandExecutor {
	public String cmd1 = "website";
	public String cmd2 = "rules";
	public String cmd3 = "apply";
	public String cmd4 = "clearchat";
	private Main plugin = Main.getPlugin(Main.class);
	private String prefix = (ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("prefix")));
    
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			if(cmd.getName().equalsIgnoreCase(cmd1)) {
	            Player player = (Player) sender;
	            player.sendMessage(prefix);
	            player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("website")));
	            return true;
			} 
			if (sender instanceof Player) {
				if(cmd.getName().equalsIgnoreCase(cmd2)) {
 					Player player = (Player) sender;
 					player.sendMessage(prefix);
 					player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("rule1")));
 					player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("rule2")));
 					player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("rule3")));
 					player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("rule4")));
 					player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("rule5")));
 					player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("rule6")));
 					player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("rule7")));
 					player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("rule8")));
 					player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("rule9")));
 					player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("rule10")));
 					player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("rule11")));
 					player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("rule12")));
 					return true;
				}
				if (sender instanceof Player) {
					if(cmd.getName().equalsIgnoreCase(cmd3)) {
						Player player = (Player) sender;
						player.sendMessage(prefix);
						player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("websiteforapply")));
						return true;
					}
					if (sender instanceof Player) {
						if(cmd.getName().equalsIgnoreCase(cmd4)) {
							Player player = (Player) sender;
							if(player.isOp()) {
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								Bukkit.broadcastMessage("");
								player.sendMessage(ChatColor.GREEN + "Chat has been successfully cleared!");
								Bukkit.broadcastMessage(ChatColor.GRAY + "" + ChatColor.BOLD + "" + ChatColor.ITALIC + "Chat has been cleard by " + player.getName());
								return true;
						} else {
							player.sendMessage(ChatColor.RED + "Insufficient Permissions!");
						}
						}
					}
				}
			}
			}else {
				sender.sendMessage(ChatColor.RED + "You must be in game to do this command!");
				return true;
			}
		return false;
	}
   

	}

 

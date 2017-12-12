package com.dwc;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import com.dwc.Events.Events;


public class Main extends JavaPlugin implements Listener {
	

	@Override
	public void onEnable() {
		Commands commands = new Commands();
		BugReporter commands1 = new BugReporter();
		getCommand(commands1.wild).setExecutor(commands1);
		getCommand(commands1.bug).setExecutor(commands1);
		getCommand(commands1.delbug).setExecutor(commands1);
		getCommand(commands1.reload).setExecutor(commands1);
		getCommand(commands1.seebug).setExecutor(commands1);
		getCommand(commands.cmd1).setExecutor(commands);
		getCommand(commands.cmd2).setExecutor(commands);
		getCommand(commands.cmd3).setExecutor(commands);
		getCommand(commands.cmd4).setExecutor(commands);
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "\n\nPlugin Enabled, Nothing to see here.\n\n");
		getServer().getPluginManager().registerEvents(new Events(), this);
		loadConfig();
	}

	public void loadConfig() {
		getConfig().options().copyDefaults(true);
		saveConfig();
	}

	@Override
	public void onDisable() {
	}

}
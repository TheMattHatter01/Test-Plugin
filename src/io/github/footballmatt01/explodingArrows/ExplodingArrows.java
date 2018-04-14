package io.github.footballmatt01.explodingArrows;

import org.bukkit.plugin.java.JavaPlugin;

public class ExplodingArrows extends JavaPlugin {
	// Fired when plugin is first enabled
	@Override
	public void onEnable() {
		this.getCommand("kit").setExecutor(new giveKit());
		getServer().getPluginManager().registerEvents(new listenEvents(), this);
	}
	// Fired when plugin is disabled
	@Override
	public void onDisable() {
		
	}

}

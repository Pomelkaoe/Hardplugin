package com.example.complexplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class ComplexPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("ComplexPlugin включен!");
        DatabaseManager.connect();
        getServer().getPluginManager().registerEvents(new PlayerEventListener(), this);
        getCommand("stats").setExecutor(new StatsCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("ComplexPlugin выключен!");
        DatabaseManager.disconnect();
    }
}

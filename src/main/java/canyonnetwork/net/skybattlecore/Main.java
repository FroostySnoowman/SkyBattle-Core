package canyonnetwork.net.skybattlecore;

import canyonnetwork.net.skybattlecore.Commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        getLogger().info("SkyBattle-Core plugin has enabled.");

        getCommand("test").setExecutor(new TestCommand(this));

        getConfig().options().copyDefaults();
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        getLogger().info("SkyBattle-Core has disabled.");
    }
}

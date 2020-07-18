package org.cjohnson.townyreborn;

import co.aikar.commands.BukkitCommandManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class TownyReborn extends JavaPlugin {
    public static final String officialPluginName = "TownyReborn";
    public static final String officialPluginVersion = "v1.1.1";

    private BukkitCommandManager commandManager;

    @Override
    public void onEnable() {
        getLogger().info("Starting Initialization of TownyReborn...");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

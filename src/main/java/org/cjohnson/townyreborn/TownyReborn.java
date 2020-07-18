package org.cjohnson.townyreborn;

import co.aikar.commands.BukkitCommandManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.cjohnson.townyreborn.utility.BukkitFormats;

public final class TownyReborn extends JavaPlugin {
    public static final String officialPluginName = "TownyReborn";
    public static final String officialPluginVersion = "v1.1.1";

    private BukkitCommandManager bukkitCommandManager;

    @Override
    public void onEnable() {
        getLogger().info(BukkitFormats.bukkitColoredMessage(
                "Starting Initialization of {0} {1}...",
                officialPluginName,
                officialPluginVersion));

        // Initialize Aikar Annotation Command Framework
        bukkitCommandManager = new BukkitCommandManager(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

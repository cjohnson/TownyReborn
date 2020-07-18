package org.cjohnson.townyreborn.utility;

import org.bukkit.ChatColor;

import java.text.MessageFormat;

public class BukkitFormats {
    public static final char ALT_COLOR_CHAR = '&';

    public static String bukkitColoredMessage(String message, Object... objects) {
        return MessageFormat.format(ChatColor.translateAlternateColorCodes(ALT_COLOR_CHAR, message), objects);
    }

    public static String bukkitMessage(String message, Object... objects) {
        return MessageFormat.format(message, objects);
    }
}

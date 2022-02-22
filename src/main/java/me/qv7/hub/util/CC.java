package me.qv7.hub.util;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

/**
 * @author 7qv_ on 22/2/2022.
 * @project HubOpenSRC
 */
public class CC {

    public static String translate(String c) {
        return ChatColor.translateAlternateColorCodes('&', c);
    }

    public static void log(String c) {
       Bukkit.getConsoleSender().sendMessage(translate(c));
    }

}

package me.qv7.hub.listener;

import me.qv7.hub.Hub;
import me.qv7.hub.util.CC;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * @author 7qv_ on 22/2/2022.
 * @project HubOpenSRC
 */
public class PlayerListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player p = event.getPlayer();
        event.setJoinMessage(null);

        p.sendMessage(CC.translate(Hub.getInstance().getConfig().getString("JOIN.MESSAGE").replace("%player%", p.getName())));
        p.playSound(p.getLocation(), Sound.LEVEL_UP, 1.0f, 1.0f);

    }
}

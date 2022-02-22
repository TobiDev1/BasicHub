package me.qv7.hub;

import lombok.Getter;
import me.qv7.hub.commands.AuthorCommand;
import me.qv7.hub.listener.PlayerListener;
import me.qv7.hub.listener.WorldListener;
import me.qv7.hub.util.CC;
import org.bukkit.plugin.java.JavaPlugin;


@Getter
public class Hub extends JavaPlugin {

    public static Hub inst;


    @Override
    public void onEnable() {
       inst = this;
       registerListener();
        CC.log("&aListeners Loading");
       registerCommands();
       CC.log("&aCommands Loading");

       saveDefaultConfig();

        CC.log("&7&m---------------------------");
        CC.log("&cBasic HubCore OpenSRC");
        CC.log("&cAuthor&7: &f7qv_");
        CC.log("&7&m---------------------------");

    }

    @Override
    public void onDisable() {
        saveDefaultConfig();
    }

    public void registerListener() {
        getServer().getPluginManager().registerEvents(new PlayerListener(), this);
        getServer().getPluginManager().registerEvents(new WorldListener(), this);
    }

    public void registerCommands() {
        getCommand("author").setExecutor(new AuthorCommand());
    }

    public static Hub getInstance() {
        return inst;
    }

}

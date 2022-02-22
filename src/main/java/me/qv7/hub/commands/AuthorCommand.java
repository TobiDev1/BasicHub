package me.qv7.hub.commands;

import me.qv7.hub.util.CC;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * @author 7qv_ on 22/2/2022.
 * @project HubOpenSRC
 */
public class AuthorCommand implements CommandExecutor {
        @Override
        public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
                sender.sendMessage(CC.translate("&7&m---------------------------"));
                sender.sendMessage(CC.translate("&cBasic HubCore Open SRC"));
                sender.sendMessage(CC.translate("&cAuthor&7: &f7qv_ "));
                sender.sendMessage(CC.translate("&7&m---------------------------"));
                return false;
        }
}

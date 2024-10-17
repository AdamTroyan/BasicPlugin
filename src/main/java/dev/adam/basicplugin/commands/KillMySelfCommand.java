package dev.adam.basicplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class KillMySelfCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if(!(sender instanceof Player player)) return true;

        player.setHealth(0);
        player.sendMessage(ChatColor.RED + "Oops.. You killed yourself");

        return true;
    }
}

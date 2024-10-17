package dev.adam.basicplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BrodcastCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if(!(sender instanceof Player player)) return true;

        StringBuilder messageBuilder = new StringBuilder();

        for(String arg: args){
            messageBuilder.append(arg).append(" ");
        }

        String message = messageBuilder.toString().trim();
        Bukkit.broadcastMessage(message);

        return true;
    }
}

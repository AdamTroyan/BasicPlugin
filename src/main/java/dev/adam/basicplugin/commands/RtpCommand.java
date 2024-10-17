package dev.adam.basicplugin.commands;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RtpCommand implements CommandExecutor {
    private final Random random = new Random();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (!(sender instanceof Player player)) {
            return true;
        }

        List<String> allCond = new ArrayList<>(List.of("near", "mid", "far"));
        for (String state : allCond) {
            if (args[0].equalsIgnoreCase(state)) {
                player.sendMessage(ChatColor.GOLD + "You'll be teleported in few seconds..");
                randomRtp(player, state);
            }
        }

        return true;
    }

    private int generateRandomCoordinate(int min, int max) {
        int randomNumber = random.nextInt(max - min + 1) + min;
        return random.nextBoolean() ? randomNumber : -randomNumber;
    }

    private Location generateRandomLocation(Player player, String state) {
        int x, z;

        switch (state.toLowerCase()) {
            case "near":
                x = generateRandomCoordinate(100, 1500);
                z = generateRandomCoordinate(100, 1500);
                break;
            case "mid":
                x = generateRandomCoordinate(1500, 5000);
                z = generateRandomCoordinate(1500, 5000);
                break;
            case "far":
                x = generateRandomCoordinate(5000, 18000);
                z = generateRandomCoordinate(5000, 18000);
                break;
            default:
                throw new IllegalArgumentException("Invalid state: " + state);
        }

        World world = player.getWorld();
        int y = world.getHighestBlockYAt(x, z);

        Location checkState = new Location(world, x, y, z);
        if (checkState.getBlock().getType().equals(Material.WATER) || checkState.getBlock().getType().equals(Material.LAVA)) {
            return generateRandomLocation(player, state);
        }

        checkState = new Location(world, x, y, z);

        return checkState;
    }

    public void randomRtp(Player player, String state) {
        World world = player.getWorld();
        Location tp = generateRandomLocation(player, state);
        Location toTp = new Location(world, tp.getX(), tp.getY(), tp.getZ());

        player.teleport(toTp);
        player.sendMessage(ChatColor.GREEN + "You've teleported to random place! " + "Your new location is at:\n" + ChatColor.GOLD + tp.getBlockX() + "X, " + tp.getBlockY() + "Y, " + tp.getBlockZ() + "Z");
    }
}

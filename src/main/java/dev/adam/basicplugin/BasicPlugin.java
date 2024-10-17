package dev.adam.basicplugin;

import dev.adam.basicplugin.commands.*;
import dev.adam.basicplugin.tabcompletor.RtpCommandTabCompletor;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import lombok.*;
import java.util.Objects;

public final class BasicPlugin extends JavaPlugin {

    @Getter
    private static BasicPlugin instance;
    @Override
    public void onEnable() {
        instance = this;

        getLogger().info("----------------------------\nBasicPlugin has been enabled\n----------------------------");

        saveDefaultConfig();

        if(getConfig().getBoolean("basic_command_enabled")) {
            Objects.requireNonNull(getCommand("killself")).setExecutor(new KillMySelfCommand());
            Objects.requireNonNull(getCommand("heal")).setExecutor(new HealCommand());
            Objects.requireNonNull(getCommand("feed")).setExecutor(new FeedCommand());
            Objects.requireNonNull(getCommand("broadcast")).setExecutor(new BrodcastCommand());
        } else {
            getLogger().warning("Please enable basic_command_enabled in the plugin's config.");
        }

        if(getConfig().getBoolean("rtp_enabled")){
            Objects.requireNonNull(getCommand("rtp")).setTabCompleter(new RtpCommandTabCompletor());
            Objects.requireNonNull(getCommand("rtp")).setExecutor(new RtpCommand());
        } else {
            getLogger().warning("Please enable rtp_enabled");
        }
    }

    @Override
    public void onDisable() {
        getLogger().info("----------------------------\nBasicPlugin has been disabled\n----------------------------");
    }
}

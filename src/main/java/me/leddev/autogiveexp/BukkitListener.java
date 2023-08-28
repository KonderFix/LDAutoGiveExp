package me.leddev.autogiveexp;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class BukkitListener implements Listener {

    private final JavaPlugin plugin;

    public BukkitListener(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void OnJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        if (!player.hasPlayedBefore()) {
            player.giveExpLevels(plugin.getConfig().getInt("giveExpLevels"));
        }
    }
}

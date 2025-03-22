package xyz.lncvrt.galaxycreations;

import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class GalaxyCreations extends JavaPlugin implements Listener {
    private final MiniMessage miniMessage = MiniMessage.miniMessage();

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        if (!event.getPlayer().hasPlayedBefore()) {
            player.performCommand("p auto");
            player.sendMessage(miniMessage.deserialize(setPrefix("<light_purple>Welcome to Galaxy Network: Creative Server!\nYou have been teleported <rainbow>to your own plot!</rainbow>\nHere, you can build almost anything you want\nIf you need help, run the /discord command and we will help you!</light_purple>")));
        }
    }

    public String setPrefix(String message) {
        return "<gradient:light_purple:dark_purple:light_purple><bold>GalaxyNetwork</gradient> <gray><bold>»</bold></gray> %s".formatted(message);
    }
}

package xyz.lncvrt.galaxycreations.events

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import xyz.lncvrt.galaxycreations.GalaxyCreations

class PlayerJoinListener(private val plugin: GalaxyCreations) : Listener {
    @EventHandler
    fun onPlayerJoinEvent(event: PlayerJoinEvent) {
        val player = event.getPlayer()
        if (!event.getPlayer().hasPlayedBefore()) {
            player.performCommand("p auto")
            player.sendMessage(plugin.miniMessage.deserialize(plugin.setPrefix("<light_purple>Welcome to Galaxy Network: Creative Server!\nYou have been teleported <rainbow>to your own plot!</rainbow>\nHere, you can build almost anything you want\nIf you need help, run the /discord command and we will help you!</light_purple>")))
        }
    }
}
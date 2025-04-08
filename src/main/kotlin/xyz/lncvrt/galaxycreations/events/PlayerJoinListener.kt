package xyz.lncvrt.galaxycreations.events

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import xyz.lncvrt.galaxyapi.utils.MessageFormat
import xyz.lncvrt.galaxycreations.GalaxyCreations

class PlayerJoinListener(private val plugin: GalaxyCreations) : Listener {
    @EventHandler
    fun onPlayerJoinEvent(event: PlayerJoinEvent) {
        val player = event.getPlayer()
        if (!event.getPlayer().hasPlayedBefore()) {
            player.performCommand("p auto")
            player.sendMessage(plugin.miniMessage.deserialize(MessageFormat.setPrefix("<light_purple>Welcome to Galaxy Network: Creative Server!\nYou have been teleported <rainbow>to your own plot!</rainbow>\nHere, you can build almost anything you want\nIf you need help, run the /discord command and we will help you!\nIf you need to, you can go to your plot again by doing the command <u><click:suggest_command:'/p home'>/p home</click></u> to return back\nYou can also do <u><click:suggest_command:'/p claim'>/p claim</click></u> in an empty plot to claim it as your own if you needed more space.</light_purple>")))
        }
    }
}
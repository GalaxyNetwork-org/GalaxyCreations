package xyz.lncvrt.galaxycreations

import net.kyori.adventure.text.minimessage.MiniMessage
import org.bukkit.plugin.java.JavaPlugin
import xyz.lncvrt.galaxycreations.events.PlayerJoinListener
import xyz.lncvrt.galaxycreations.events.ProjectileLaunchListener

class GalaxyCreations : JavaPlugin() {
    internal val miniMessage = MiniMessage.miniMessage()

    override fun onEnable() {
        server.pluginManager.registerEvents(PlayerJoinListener(this), this)
        server.pluginManager.registerEvents(ProjectileLaunchListener(), this)
    }
}

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

    internal fun setPrefix(message: String): String {
        return "<gradient:light_purple:dark_purple:light_purple><bold>GalaxyNetwork</gradient> <gray><bold>»</bold></gray> $message"
    }
}

package xyz.lncvrt.galaxycreations

import net.kyori.adventure.text.minimessage.MiniMessage
import org.bukkit.plugin.java.JavaPlugin
import xyz.lncvrt.galaxycreations.events.*

class GalaxyCreations : JavaPlugin() {
    internal val miniMessage = MiniMessage.miniMessage()

    override fun onEnable() {
        server.pluginManager.registerEvents(PlayerInteractListener(), this)
        server.pluginManager.registerEvents(PlayerJoinListener(this), this)
        server.pluginManager.registerEvents(ProjectileLaunchListener(), this)
        server.pluginManager.registerEvents(VehicleCreateListener(), this)
        server.pluginManager.registerEvents(VehicleMoveListener(), this)
    }
}

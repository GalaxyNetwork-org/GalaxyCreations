package xyz.lncvrt.galaxycreations.events

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.ProjectileLaunchEvent

class ProjectileLaunchListener : Listener {
    @EventHandler
    fun onProjectileLaunchEvent(event: ProjectileLaunchEvent) {
//        if (event.entityType == EntityType.ARROW) return
        event.isCancelled = true
    }
}
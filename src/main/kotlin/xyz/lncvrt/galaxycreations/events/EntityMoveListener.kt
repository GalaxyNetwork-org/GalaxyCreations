package xyz.lncvrt.galaxycreations.events

import io.papermc.paper.event.entity.EntityMoveEvent
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener

class EntityMoveListener : Listener {
    @EventHandler
    fun onEntityMoveEvent(event: EntityMoveEvent) {
        val chunk = event.entity.location.chunk
        val entities = chunk.entities.filter { it !is Player }
        if (entities.size > 9) entities.forEach { it.remove() }
    }
}
package xyz.lncvrt.galaxycreations.events

import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.player.PlayerInteractEvent

class PlayerInteractListener : Listener {
    @EventHandler
    fun onPlayerInteractEvent(event: PlayerInteractEvent) {
        if (event.action == Action.RIGHT_CLICK_BLOCK) {
            val item = event.item ?: return
            if (item.type.name.contains("MINECART")) {
                val chunk = event.clickedBlock?.location?.chunk ?: return
                val entities = chunk.entities.filter { it !is Player }
                if (entities.size > 9) entities.forEach { it.remove() }
            }
        }
    }
}
package xyz.lncvrt.galaxycreations.events

import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.vehicle.VehicleMoveEvent

class VehicleMoveListener : Listener {
    @EventHandler
    fun onVehicleMoveEvent(event: VehicleMoveEvent) {
        val chunk = event.vehicle.location.chunk
        val entities = chunk.entities.filter { it !is Player }
        if (entities.size > 9) entities.forEach { it.remove() }
    }
}
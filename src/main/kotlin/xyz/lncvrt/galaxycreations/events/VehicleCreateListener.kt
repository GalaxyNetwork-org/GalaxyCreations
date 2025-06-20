package xyz.lncvrt.galaxycreations.events

import org.bukkit.entity.Vehicle
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.vehicle.VehicleCreateEvent

class VehicleCreateListener : Listener {
    @EventHandler
    fun onVehicleCreateEvent(event: VehicleCreateEvent) {
        val chunk = event.vehicle.location.chunk
        val vehicles = chunk.entities.filterIsInstance<Vehicle>()
        if (vehicles.size > 9) vehicles.forEach { it.remove() }
    }
}
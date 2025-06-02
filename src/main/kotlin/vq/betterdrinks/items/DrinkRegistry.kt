package vq.betterdrinks.items

import net.minecraft.item.Item
import net.minecraft.item.Item.*
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.util.Identifier

class DrinkRegistry {
    fun register(name : String, itemFactory: (Settings) -> Item, settings: Settings) : Item {
        val identifier = Identifier.of("betterdrinks", name);
        val key = RegistryKey.of(RegistryKeys.ITEM, identifier);
        val item = itemFactory(settings);
        return Registry.register(Registries.ITEM, identifier, item);
    }
}
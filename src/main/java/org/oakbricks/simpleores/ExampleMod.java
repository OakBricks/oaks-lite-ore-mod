package org.oakbricks.simpleores;

import net.fabricmc.api.ModInitializer;

public class SimpleOres implements ModInitializer {
    public static final Block EXAMPLE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
	
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("The ores have appeared!");
	}
}

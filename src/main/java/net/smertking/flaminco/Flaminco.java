package net.smertking.flaminco;

import net.fabricmc.api.ModInitializer;
import net.smertking.flaminco.item.ModBlocks;
import net.smertking.flaminco.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Flaminco implements ModInitializer {
	public static final String MOD_ID = "flaminco";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerItems();
		ModBlocks.registerBlocks();
	}
}

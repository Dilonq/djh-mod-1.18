package net.djh.djhmod;

import net.djh.djhmod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DJHMod implements ModInitializer {
	public static final String MODID = "djhmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}

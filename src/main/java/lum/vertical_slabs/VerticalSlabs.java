package lum.vertical_slabs;

import lum.vertical_slabs.block.ModBlocks;
import lum.vertical_slabs.creativemodetab.ModCreativeModTabs;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VerticalSlabs implements ModInitializer {
	public static final String MOD_ID = "vertical_slabs";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModBlocks.registerModBlocks();
        ModCreativeModTabs.registerModCreativeModTabs();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}

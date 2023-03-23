package net.max.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.max.tutorialmod.block.ModBlocks;
import net.max.tutorialmod.item.ModItems;
import net.max.tutorialmod.world.feature.ModConfiguredFeatures;
import net.max.tutorialmod.world.gen.ModOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();


		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModOreGeneration.generateOres();

	}
}

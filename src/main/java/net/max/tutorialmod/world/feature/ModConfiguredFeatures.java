package net.max.tutorialmod.world.feature;

import net.max.tutorialmod.TutorialMod;
import net.max.tutorialmod.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_ADAMANTIUM_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_ADAMANTIUM_ORE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ADAMANTIUM_ORE =
            ConfiguredFeatures.register("adamantium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ADAMANTIUM_ORES, 5));


    public static final List<OreFeatureConfig.Target> OVERWORLD_MYTHRIL_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_MYTHRIL_ORE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> MYTHRIL_ORE =
            ConfiguredFeatures.register("mythril_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_MYTHRIL_ORES, 5));


    public static final List<OreFeatureConfig.Target> OVERWORLD_DEEP_IRON_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_DEEP_IRON_ORE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> DEEP_IRON_ORE =
            ConfiguredFeatures.register("deep_iron_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_DEEP_IRON_ORES, 9));


    public static final List<OreFeatureConfig.Target> OVERWORLD_INFUSCOLIUM_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_INFUSCOLIUM_ORE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> INFUSCOLIUM_ORE =
            ConfiguredFeatures.register("infuscolium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_INFUSCOLIUM_ORES, 4));

    public static final List<OreFeatureConfig.Target> NETHER_HELLSTONE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.NETHERRACK, ModBlocks.HELLSTONE_ORE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> HELLSTONE_ORE =
            ConfiguredFeatures.register("hellstone_ore", Feature.ORE, new OreFeatureConfig(NETHER_HELLSTONE_ORES, 4));


    public static void registerConfiguredFeatures() {
        TutorialMod.LOGGER.debug("Registering the ModConfiguredFeatures " + TutorialMod.MOD_ID);
    }
}
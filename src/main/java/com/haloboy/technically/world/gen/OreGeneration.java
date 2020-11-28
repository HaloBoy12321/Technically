package com.haloboy.technically.world.gen;

import com.haloboy.technically.Technically;
import com.haloboy.technically.config.ModConfigBuilder;
import com.haloboy.technically.setup.ModBlocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
/**
 * Ore generation
 * @author TechOFreak
 *
 */

@Mod.EventBusSubscriber
public class OreGeneration {

    private static final ArrayList<ConfiguredFeature<?, ?>> overworldOres = new ArrayList<ConfiguredFeature<?, ?>>();
    //private static final ArrayList<ConfiguredFeature<?, ?>> netherOres = new ArrayList<ConfiguredFeature<?, ?>>();
    //private static final ArrayList<ConfiguredFeature<?, ?>> endOres = new ArrayList<ConfiguredFeature<?, ?>>();

    public static void registerOres() {
        //BASE_STONE_OVERWORLD is for generating in stone, granite, diorite, and andesite
        //NETHERRACK is for generating in netherrack
        //BASE_STONE_NETHER is for generating in netherrack, basalt and blackstone

        //OverWorld Ore Register
        if(ModConfigBuilder.SILVER_ORE_GENERATION.get()) {
            overworldOres.add(register("silver_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, //What to Replace
                    ModBlocks.SILVER_ORE.get().getDefaultState(), ModConfigBuilder.SILVER_ORE_SIZE.get())) //Vein Size
                    .range(ModConfigBuilder.SILVER_ORE_MAX_HEIGHT.get()).square() //Spawn height start
                    .func_242731_b(ModConfigBuilder.SILVER_ORE_FREQUENCY.get()))); //Chunk spawn frequency
        }
        if(ModConfigBuilder.SILVER_ORE_GENERATION.get()) {
            overworldOres.add(register("copper_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, //What to Replace
                    ModBlocks.COPPER_ORE.get().getDefaultState(), ModConfigBuilder.COPPER_ORE_SIZE.get())) //Vein Size
                    .range(ModConfigBuilder.COPPER_ORE_MAX_HEIGHT.get()).square() //Spawn height start
                    .func_242731_b(ModConfigBuilder.COPPER_ORE_FREQUENCY.get()))); //Chunk spawn frequency
        }
        if(ModConfigBuilder.TIN_ORE_GENERATION.get()) {
            overworldOres.add(register("tin_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, //What to Replace
                    ModBlocks.TIN_ORE.get().getDefaultState(), ModConfigBuilder.TIN_ORE_SIZE.get())) //Vein Size
                    .range(ModConfigBuilder.TIN_ORE_MAX_HEIGHT.get()).square() //Spawn height start
                    .func_242731_b(ModConfigBuilder.TIN_ORE_FREQUENCY.get()))); //Chunk spawn frequency
        }
        if(ModConfigBuilder.LEAD_ORE_GENERATION.get()) {
            overworldOres.add(register("lead_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, //What to Replace
                    ModBlocks.LEAD_ORE.get().getDefaultState(), ModConfigBuilder.LEAD_ORE_SIZE.get())) //Vein Size
                    .range(ModConfigBuilder.LEAD_ORE_MAX_HEIGHT.get()).square() //Spawn height start
                    .func_242731_b(ModConfigBuilder.LEAD_ORE_FREQUENCY.get()))); //Chunk spawn frequency
        }



/*
        //Nether Ore Register
        netherOres.add(register("flame_crystal_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
                OreFeatureConfig.FillerBlockType.NETHERRACK, RegistryHandlerBlocks.FLAME_CRYSTAL_ORE.get().getDefaultState(), 4))
                .range(48).square()
                .func_242731_b(64)));

        //The End Ore Register
        endOres.add(register("air_block", Feature.ORE.withConfiguration(new OreFeatureConfig(
                new BlockMatchRuleTest(Blocks.END_STONE), RegistryHandlerBlocks.AIR_CRYSTAL_BLOCK.get().getDefaultState(), 4)) //Vein Size
                .range(128).square() //Spawn height start
                .func_242731_b(64))); //Chunk spawn frequency
*/
    }
        @SubscribeEvent(priority = EventPriority.HIGHEST)
        public static void gen(BiomeLoadingEvent event) {
            BiomeGenerationSettingsBuilder generation = event.getGeneration();
            /*
            if(event.getCategory().equals(Biome.Category.NETHER)){
                for(ConfiguredFeature<?, ?> ore : netherOres){
                    if (ore != null) generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
                }
            }
            if(event.getCategory().equals(Biome.Category.THEEND)){
                for(ConfiguredFeature<?, ?> ore : endOres){
                    if (ore != null) generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
                }
            }

             */
            for(ConfiguredFeature<?, ?> ore : overworldOres){
                if (ore != null) generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
            }
        }

    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, Technically.MOD_ID + ":" + name, configuredFeature);
    }
}

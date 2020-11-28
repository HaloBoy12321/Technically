package com.haloboy.technically.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModConfigBuilder {

    public static ForgeConfigSpec.BooleanValue SILVER_ORE_GENERATION;
    public static ForgeConfigSpec.IntValue SILVER_ORE_CHANCE;
    public static ForgeConfigSpec.IntValue SILVER_ORE_SIZE;
    public static ForgeConfigSpec.IntValue SILVER_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue SILVER_ORE_MAX_HEIGHT;

    public static void init(ForgeConfigSpec.Builder SERVER_BUILDER)
    {

        SERVER_BUILDER.comment("Silver Ore Generation").push("silver_ore");

        SILVER_ORE_GENERATION = SERVER_BUILDER.comment("Generate Silver Ore veins [true / false]").define("silverOreGeneration", true);
        SILVER_ORE_SIZE = SERVER_BUILDER.comment("Size of Silver Ore veins [default: 4]").defineInRange("silverOreSize", 4, 0, 100);
        SILVER_ORE_CHANCE = SERVER_BUILDER.comment("Chances of Silver Ore veins being generated [default: 15]").defineInRange("silverOreChance", 15, 0, 100);
        SILVER_ORE_MIN_HEIGHT = SERVER_BUILDER.comment("Minimal height for Silver Ore veins generation,[default: 20]").defineInRange("silverOreMinHeight", 20, 0, 255);
        SILVER_ORE_MAX_HEIGHT = SERVER_BUILDER.comment("Maximal height for Silver Ore veins generation [default: 50]").defineInRange("silverOreMaxHeight", 50, 0, 255);

        SERVER_BUILDER.pop();

    }
}

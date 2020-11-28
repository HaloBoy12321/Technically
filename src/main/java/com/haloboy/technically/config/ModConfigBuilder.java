package com.haloboy.technically.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModConfigBuilder {

    public static ForgeConfigSpec.BooleanValue SILVER_ORE_GENERATION;
    public static ForgeConfigSpec.IntValue SILVER_ORE_FREQUENCY;
    public static ForgeConfigSpec.IntValue SILVER_ORE_SIZE;
    public static ForgeConfigSpec.IntValue SILVER_ORE_MAX_HEIGHT;

    public static ForgeConfigSpec.BooleanValue COPPER_ORE_GENERATION;
    public static ForgeConfigSpec.IntValue COPPER_ORE_FREQUENCY;
    public static ForgeConfigSpec.IntValue COPPER_ORE_SIZE;
    public static ForgeConfigSpec.IntValue COPPER_ORE_MAX_HEIGHT;

    public static ForgeConfigSpec.BooleanValue TIN_ORE_GENERATION;
    public static ForgeConfigSpec.IntValue TIN_ORE_FREQUENCY;
    public static ForgeConfigSpec.IntValue TIN_ORE_SIZE;
    public static ForgeConfigSpec.IntValue TIN_ORE_MAX_HEIGHT;

    public static ForgeConfigSpec.BooleanValue LEAD_ORE_GENERATION;
    public static ForgeConfigSpec.IntValue LEAD_ORE_FREQUENCY;
    public static ForgeConfigSpec.IntValue LEAD_ORE_SIZE;
    public static ForgeConfigSpec.IntValue LEAD_ORE_MAX_HEIGHT;

    public static void init(ForgeConfigSpec.Builder SERVER_BUILDER)
    {

        SERVER_BUILDER.comment("Silver Ore Generation").push("silver_ore");

        SILVER_ORE_GENERATION = SERVER_BUILDER.comment("Generate Silver Ore veins [true / false]").define("silverOreGeneration", true);
        SILVER_ORE_SIZE = SERVER_BUILDER.comment("Size of Silver Ore veins [default: 4]").defineInRange("silverOreSize", 4, 0, 100);
        SILVER_ORE_FREQUENCY = SERVER_BUILDER.comment("Frequency of Silver Ore veins being generated [default: 15]").defineInRange("silverOreFrequency", 15, 0, 100);
        SILVER_ORE_MAX_HEIGHT = SERVER_BUILDER.comment("Maximal height for Silver Ore veins generation [default: 50]").defineInRange("silverOreMaxHeight", 64, 0, 255);

        SERVER_BUILDER.pop();

        SERVER_BUILDER.comment("Copper Ore Generation").push("copper_ore");

        COPPER_ORE_GENERATION = SERVER_BUILDER.comment("Generate Copper Ore veins [true / false]").define("copperOreGeneration", true);
        COPPER_ORE_SIZE = SERVER_BUILDER.comment("Size of Copper Ore veins [default: 4]").defineInRange("copperOreSize", 4, 0, 100);
        COPPER_ORE_FREQUENCY = SERVER_BUILDER.comment("Frequency of Copper Ore veins being generated [default: 15]").defineInRange("copperOreFrequency", 15, 0, 100);
        COPPER_ORE_MAX_HEIGHT = SERVER_BUILDER.comment("Maximal height for Copper Ore veins generation [default: 64]").defineInRange("copperOreMaxHeight", 64, 0, 255);

        SERVER_BUILDER.pop();

        SERVER_BUILDER.comment("Tin Ore Generation").push("tin_ore");

        TIN_ORE_GENERATION = SERVER_BUILDER.comment("Generate Tin Ore veins [true / false]").define("tinOreGeneration", true);
        TIN_ORE_SIZE = SERVER_BUILDER.comment("Size of Tin Ore veins [default: 4]").defineInRange("tinOreSize", 4, 0, 100);
        TIN_ORE_FREQUENCY = SERVER_BUILDER.comment("Frequency of Tin Ore veins being generated [default: 15]").defineInRange("tinOreFrequency", 15, 0, 100);
        TIN_ORE_MAX_HEIGHT = SERVER_BUILDER.comment("Maximal height for Tin Ore veins generation [default: 64]").defineInRange("tinOreMaxHeight", 64, 0, 255);

        SERVER_BUILDER.pop();

        SERVER_BUILDER.comment("Lead Ore Generation").push("lead_ore");

        LEAD_ORE_GENERATION = SERVER_BUILDER.comment("Generate Lead Ore veins [true / false]").define("leadOreGeneration", true);
        LEAD_ORE_SIZE = SERVER_BUILDER.comment("Size of Lead Ore veins [default: 4]").defineInRange("leadOreSize", 4, 0, 100);
        LEAD_ORE_FREQUENCY = SERVER_BUILDER.comment("Frequency of Lead Ore veins being generated [default: 15]").defineInRange("leadOreFrequency", 15, 0, 100);
        LEAD_ORE_MAX_HEIGHT = SERVER_BUILDER.comment("Maximal height for Lead Ore veins generation [default: 64]").defineInRange("leadOreMaxHeight", 64, 0, 255);

        SERVER_BUILDER.pop();


    }
}

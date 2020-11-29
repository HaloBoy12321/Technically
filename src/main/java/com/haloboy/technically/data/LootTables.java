package com.haloboy.technically.data;

import com.haloboy.technically.setup.ModBlocks;
import net.minecraft.data.DataGenerator;

public class LootTables extends BaseLootTableProvider {

    public LootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {
        lootTables.put(ModBlocks.SILVER_BLOCK.get(), createStandardTable("silver_block", ModBlocks.SILVER_BLOCK.get()));
        lootTables.put(ModBlocks.COPPER_BLOCK.get(), createStandardTable("copper_block", ModBlocks.COPPER_BLOCK.get()));
        lootTables.put(ModBlocks.TIN_BLOCK.get(), createStandardTable("tin_block", ModBlocks.TIN_BLOCK.get()));
        lootTables.put(ModBlocks.LEAD_BLOCK.get(), createStandardTable("lead_block", ModBlocks.LEAD_BLOCK.get()));
        lootTables.put(ModBlocks.SILVER_ORE.get(), createStandardTable("silver_ore", ModBlocks.SILVER_ORE.get()));
        lootTables.put(ModBlocks.COPPER_ORE.get(), createStandardTable("copper_ore", ModBlocks.COPPER_ORE.get()));
        lootTables.put(ModBlocks.TIN_ORE.get(), createStandardTable("tin_ore", ModBlocks.TIN_ORE.get()));
        lootTables.put(ModBlocks.LEAD_ORE.get(), createStandardTable("lead_ore", ModBlocks.LEAD_ORE.get()));
    }
}
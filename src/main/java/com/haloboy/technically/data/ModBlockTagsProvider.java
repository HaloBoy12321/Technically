package com.haloboy.technically.data;

import com.haloboy.technically.Technically;
import com.haloboy.technically.setup.ModBlocks;
import com.haloboy.technically.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, Technically.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        getOrCreateBuilder(ModTags.Blocks.ORES_SILVER).add(ModBlocks.SILVER_ORE.get());
        getOrCreateBuilder(ModTags.Blocks.ORES_COPPER).add(ModBlocks.COPPER_ORE.get());
        getOrCreateBuilder(ModTags.Blocks.ORES_TIN).add(ModBlocks.TIN_ORE.get());
        getOrCreateBuilder(ModTags.Blocks.ORES_LEAD).add(ModBlocks.LEAD_ORE.get());
        getOrCreateBuilder(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_SILVER);
        getOrCreateBuilder(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_COPPER);
        getOrCreateBuilder(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_TIN);
        getOrCreateBuilder(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_LEAD);

        getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCK_SILVER).add(ModBlocks.SILVER_BLOCK.get());
        getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCK_COPPER).add(ModBlocks.COPPER_BLOCK.get());
        getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCK_TIN).add(ModBlocks.TIN_BLOCK.get());
        getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCK_LEAD).add(ModBlocks.LEAD_BLOCK.get());
        getOrCreateBuilder(Tags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCK_SILVER);
        getOrCreateBuilder(Tags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCK_COPPER);
        getOrCreateBuilder(Tags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCK_TIN);
        getOrCreateBuilder(Tags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCK_LEAD);
    }
}

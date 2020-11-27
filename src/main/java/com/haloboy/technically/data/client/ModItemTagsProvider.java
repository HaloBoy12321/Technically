package com.haloboy.technically.data.client;

import com.haloboy.technically.Technically;
import com.haloboy.technically.setup.ModItems;
import com.haloboy.technically.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeItemTagsProvider;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, Technically.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        //SILVER
        copy(ModTags.Blocks.ORES_SILVER,ModTags.Items.ORES_SILVER);
        copy(Tags.Blocks.ORES,Tags.Items.ORES);
        copy(ModTags.Blocks.STORAGE_BLOCK_SILVER,ModTags.Items.STORAGE_BLOCK_SILVER);
        copy(Tags.Blocks.STORAGE_BLOCKS,Tags.Items.STORAGE_BLOCKS);
        getOrCreateBuilder(ModTags.Items.INGOTS_SILVER).add(ModItems.SILVER_INGOT.get());
        getOrCreateBuilder(Tags.Items.INGOTS).addTag(ModTags.Items.INGOTS_SILVER);
        getOrCreateBuilder(ModTags.Items.NUGGET_SILVER).add(ModItems.SILVER_NUGGET.get());
        getOrCreateBuilder(Tags.Items.NUGGETS).addTag(ModTags.Items.NUGGET_SILVER);
        getOrCreateBuilder(ModTags.Items.DUST_SILVER).add(ModItems.SILVER_DUST.get());
        getOrCreateBuilder(Tags.Items.DUSTS).addTag(ModTags.Items.DUST_SILVER);
        //COPPER
        copy(ModTags.Blocks.ORES_COPPER,ModTags.Items.ORES_COPPER);
        copy(Tags.Blocks.ORES,Tags.Items.ORES);
        copy(ModTags.Blocks.STORAGE_BLOCK_COPPER,ModTags.Items.STORAGE_BLOCK_COPPER);
        copy(Tags.Blocks.STORAGE_BLOCKS,Tags.Items.STORAGE_BLOCKS);
        getOrCreateBuilder(ModTags.Items.INGOTS_COPPER).add(ModItems.COPPER_INGOT.get());
        getOrCreateBuilder(Tags.Items.INGOTS).addTag(ModTags.Items.INGOTS_COPPER);
        getOrCreateBuilder(ModTags.Items.NUGGET_COPPER).add(ModItems.COPPER_NUGGET.get());
        getOrCreateBuilder(Tags.Items.NUGGETS).addTag(ModTags.Items.NUGGET_COPPER);
        getOrCreateBuilder(ModTags.Items.DUST_COPPER).add(ModItems.COPPER_DUST.get());
        getOrCreateBuilder(Tags.Items.DUSTS).addTag(ModTags.Items.DUST_COPPER);
        //TIN
        copy(ModTags.Blocks.ORES_TIN,ModTags.Items.ORES_TIN);
        copy(Tags.Blocks.ORES,Tags.Items.ORES);
        copy(ModTags.Blocks.STORAGE_BLOCK_TIN,ModTags.Items.STORAGE_BLOCK_TIN);
        copy(Tags.Blocks.STORAGE_BLOCKS,Tags.Items.STORAGE_BLOCKS);
        getOrCreateBuilder(ModTags.Items.INGOTS_TIN).add(ModItems.TIN_INGOT.get());
        getOrCreateBuilder(Tags.Items.INGOTS).addTag(ModTags.Items.INGOTS_TIN);
        getOrCreateBuilder(ModTags.Items.NUGGET_TIN).add(ModItems.TIN_NUGGET.get());
        getOrCreateBuilder(Tags.Items.NUGGETS).addTag(ModTags.Items.NUGGET_TIN);
        getOrCreateBuilder(ModTags.Items.DUST_TIN).add(ModItems.TIN_DUST.get());
        getOrCreateBuilder(Tags.Items.DUSTS).addTag(ModTags.Items.DUST_TIN);
        //LEAD
        copy(ModTags.Blocks.ORES_LEAD,ModTags.Items.ORES_LEAD);
        copy(Tags.Blocks.ORES,Tags.Items.ORES);
        copy(ModTags.Blocks.STORAGE_BLOCK_LEAD,ModTags.Items.STORAGE_BLOCK_LEAD);
        copy(Tags.Blocks.STORAGE_BLOCKS,Tags.Items.STORAGE_BLOCKS);
        getOrCreateBuilder(ModTags.Items.INGOTS_LEAD).add(ModItems.LEAD_INGOT.get());
        getOrCreateBuilder(Tags.Items.INGOTS).addTag(ModTags.Items.INGOTS_LEAD);
        getOrCreateBuilder(ModTags.Items.NUGGET_LEAD).add(ModItems.LEAD_NUGGET.get());
        getOrCreateBuilder(Tags.Items.NUGGETS).addTag(ModTags.Items.NUGGET_LEAD);
        getOrCreateBuilder(ModTags.Items.DUST_LEAD).add(ModItems.LEAD_DUST.get());
        getOrCreateBuilder(Tags.Items.DUSTS).addTag(ModTags.Items.DUST_LEAD);

    }


}

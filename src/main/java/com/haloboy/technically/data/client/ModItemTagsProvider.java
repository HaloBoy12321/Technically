package com.haloboy.technically.data.client;

import com.haloboy.technically.setup.ModItems;
import com.haloboy.technically.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeItemTagsProvider;

public class ModItemTagsProvider extends ForgeItemTagsProvider {

    public ModItemTagsProvider(DataGenerator gen, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
        super(gen, blockTagProvider, existingFileHelper);
        registerTags();
        copy(ModTags.Blocks.ORES_SILVER,ModTags.Items.ORES_SILVER);
        copy(Tags.Blocks.ORES,Tags.Items.ORES);
        copy(ModTags.Blocks.STORAGE_BLOCK_SILVER,ModTags.Items.STORAGE_BLOCK_SILVER);
        copy(Tags.Blocks.STORAGE_BLOCKS,Tags.Items.STORAGE_BLOCKS);

        getOrCreateBuilder(ModTags.Items.INGOTS_SILVER).add(ModItems.SILVER_INGOT.get());
        getOrCreateBuilder(Tags.Items.INGOTS).addTag(ModTags.Items.INGOTS_SILVER);
    }
}

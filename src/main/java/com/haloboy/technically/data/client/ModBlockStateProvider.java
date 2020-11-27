package com.haloboy.technically.data.client;

import com.haloboy.technically.Technically;
import com.haloboy.technically.setup.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Technically.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //SILVER
        simpleBlock(ModBlocks.SILVER_BLOCK.get());
        simpleBlock(ModBlocks.SILVER_ORE.get());
        //COPPER
        simpleBlock(ModBlocks.COPPER_BLOCK.get());
        simpleBlock(ModBlocks.COPPER_ORE.get());
        //TIN
        simpleBlock(ModBlocks.TIN_BLOCK.get());
        simpleBlock(ModBlocks.TIN_ORE.get());
        //LEAD
        simpleBlock(ModBlocks.LEAD_BLOCK.get());
        simpleBlock(ModBlocks.LEAD_ORE.get());

    }
}

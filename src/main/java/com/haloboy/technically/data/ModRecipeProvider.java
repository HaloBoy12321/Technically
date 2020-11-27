package com.haloboy.technically.data;

import com.haloboy.technically.Technically;
import com.haloboy.technically.setup.ModBlocks;
import com.haloboy.technically.setup.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.common.data.ForgeRecipeProvider;

import java.util.function.Consumer;

public class ModRecipeProvider extends ForgeRecipeProvider {

    public ModRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        registerCraftingItems(consumer);
    }
    private void registerCraftingItems(Consumer<IFinishedRecipe> consumer) {
        compressor(consumer, ModBlocks.SILVER_BLOCK.get(), ModItems.SILVER_INGOT.get(), "silver_block");
        compressor(consumer, ModBlocks.COPPER_BLOCK.get(), ModItems.COPPER_INGOT.get(),"copper_block");
        compressor(consumer, ModBlocks.TIN_BLOCK.get(), ModItems.TIN_INGOT.get(),"tin_block");
        compressor(consumer, ModBlocks.LEAD_BLOCK.get(), ModItems.LEAD_INGOT.get(),"lead_block");

        compressor(consumer, ModItems.SILVER_INGOT.get(), ModItems.SILVER_NUGGET.get(),"silver_ingot");
        compressor(consumer, ModItems.COPPER_INGOT.get(), ModItems.COPPER_NUGGET.get(),"copper_ingot");
        compressor(consumer, ModItems.TIN_INGOT.get(), ModItems.TIN_NUGGET.get(),"tin_ingot");
        compressor(consumer, ModItems.LEAD_INGOT.get(), ModItems.LEAD_NUGGET.get(),"lead_ingot");
    }

    private void compressor(Consumer<IFinishedRecipe> consumer, IItemProvider large, IItemProvider small,String path){
        ShapedRecipeBuilder.shapedRecipe(large, 1)
                .patternLine("###")
                .patternLine("###")
                .patternLine("###")
                .key('#', small)
                .addCriterion("has_item", hasItem(large))
                .build(consumer, Technically.getId(path + "_compress"));
        ShapelessRecipeBuilder.shapelessRecipe(small, 9)
                .addIngredient(large)
                .addCriterion("has_item", hasItem(large))
                .build(consumer, Technically.getId(path + "_decompress"));
    }

}

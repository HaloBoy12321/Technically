package com.haloboy.technically.data;

import com.haloboy.technically.Technically;
import com.haloboy.technically.setup.ModBlocks;
import com.haloboy.technically.setup.ModItems;
import net.minecraft.advancements.criterion.ImpossibleTrigger;
import net.minecraft.data.*;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.loot.functions.Smelt;
import net.minecraft.tags.ITag;
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
        registerSmelting(consumer);
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
    private void registerSmelting(Consumer<IFinishedRecipe> consumer) {
        smeltingAndBlasting(consumer, "silver_ore", ModBlocks.SILVER_ORE.get(), ModItems.SILVER_INGOT.get());
        smeltingAndBlasting(consumer, "copper_ore", ModBlocks.COPPER_ORE.get(), ModItems.COPPER_INGOT.get());
        smeltingAndBlasting(consumer, "tin_ore", ModBlocks.TIN_ORE.get(), ModItems.TIN_INGOT.get());
        smeltingAndBlasting(consumer, "lead_ore", ModBlocks.LEAD_ORE.get(), ModItems.LEAD_INGOT.get());

        smeltingAndBlasting(consumer, "silver_dust", ModItems.SILVER_DUST.get(), ModItems.SILVER_INGOT.get());
        smeltingAndBlasting(consumer, "copper_dust", ModItems.COPPER_DUST.get(), ModItems.COPPER_INGOT.get());
        smeltingAndBlasting(consumer, "tin_dust", ModItems.TIN_DUST.get(), ModItems.TIN_INGOT.get());
        smeltingAndBlasting(consumer, "lead_dust", ModItems.LEAD_DUST.get(), ModItems.LEAD_INGOT.get());
    }
    private void smeltingAndBlasting(Consumer<IFinishedRecipe> consumer, String id, IItemProvider ingredientItem, IItemProvider result) {
        Ingredient ingredientIn = Ingredient.fromItems(ingredientItem);
        smeltingAndBlasting(consumer, id, ingredientIn, result);
    }

    private void smeltingAndBlasting(Consumer<IFinishedRecipe> consumer, String id, ITag<Item> ingredientTag, IItemProvider result) {
        Ingredient ingredientIn = Ingredient.fromTag(ingredientTag);
        smeltingAndBlasting(consumer, id, ingredientIn, result);
    }

    private void smeltingAndBlasting(Consumer<IFinishedRecipe> consumer, String id, Ingredient ingredientIn, IItemProvider result) {
        CookingRecipeBuilder.blastingRecipe(ingredientIn, result, 1.0f, 100)
                .addCriterion("impossible", new ImpossibleTrigger.Instance())
                .build(consumer, Technically.getId("blasting/" + id));
        CookingRecipeBuilder.smeltingRecipe(ingredientIn, result, 1.0f, 200)
                .addCriterion("impossible", new ImpossibleTrigger.Instance())
                .build(consumer, Technically.getId("smelting/" + id));
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

package com.haloboy.technically.setup;

import com.haloboy.technically.Technically;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    //ore
    public static final RegistryObject<Block> SILVER_ORE = register("silver_ore",() ->
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3,3).harvestLevel(2).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COPPER_ORE = register("copper_ore",() ->
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3,3).harvestLevel(1).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TIN_ORE = register("tin_ore",() ->
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3,3).harvestLevel(2).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LEAD_ORE = register("lead_ore",() ->
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3,3).harvestLevel(1).sound(SoundType.STONE)));

    //block of ...
    public static final RegistryObject<Block> SILVER_BLOCK = register("silver_block",() ->
            new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(5,6).sound(SoundType.METAL)));
    public static final RegistryObject<Block> COPPER_BLOCK = register("copper_block",() ->
            new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(5,6).sound(SoundType.METAL)));
    public static final RegistryObject<Block> TIN_BLOCK = register("tin_block",() ->
            new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(5,6).sound(SoundType.METAL)));
    public static final RegistryObject<Block> LEAD_BLOCK = register("lead_block",() ->
            new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(5,6).sound(SoundType.METAL)));




    static void register(){}

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block){
        return Registration.BLOCKS.register(name,block);
    }
    private static <T extends Block> RegistryObject<T> register(String name,Supplier<T> block){
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name,()-> new BlockItem(ret.get(), new Item.Properties().group(Technically.technically)));
        return ret;
    }
}

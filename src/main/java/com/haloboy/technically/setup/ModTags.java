package com.haloboy.technically.setup;

import com.haloboy.technically.Technically;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class ModTags {
    public static final class Blocks{
        //SILVER
        public static final ITag.INamedTag<Block> ORES_SILVER = forge("ores/silver");
        public static final ITag.INamedTag<Block> STORAGE_BLOCK_SILVER = forge("storage_block/silver");
        //COPPER
        public static final ITag.INamedTag<Block> ORES_COPPER = forge("ores/copper");
        public static final ITag.INamedTag<Block> STORAGE_BLOCK_COPPER = forge("storage_block/copper");
        //TIN
        public static final ITag.INamedTag<Block> ORES_TIN = forge("ores/tin");
        public static final ITag.INamedTag<Block> STORAGE_BLOCK_TIN = forge("storage_block/tin");
        //LEAD
        public static final ITag.INamedTag<Block> ORES_LEAD = forge("ores/lead");
        public static final ITag.INamedTag<Block> STORAGE_BLOCK_LEAD = forge("storage_block/lead");




        private static ITag.INamedTag<Block> forge(String path) {
            return BlockTags.makeWrapperTag(new ResourceLocation("forge",path).toString());
        }
        private static ITag.INamedTag<Block> mod(String path){
            return BlockTags.makeWrapperTag(new ResourceLocation(Technically.MOD_ID, path).toString());
        }
    }


    public  static final  class  Items{
        //silver
        public static final ITag.INamedTag<Item> ORES_SILVER = forge("ores/silver");
        public static final ITag.INamedTag<Item> STORAGE_BLOCK_SILVER = forge("storage_block/silver");
        public static final ITag.INamedTag<Item> INGOTS_SILVER = forge("ingots/silver");
        public static final ITag.INamedTag<Item> NUGGET_SILVER = forge("nuggets/silver");
        public static final ITag.INamedTag<Item> DUST_SILVER = forge("dusts/silver");
        //copper
        public static final ITag.INamedTag<Item> ORES_COPPER = forge("ores/copper");
        public static final ITag.INamedTag<Item> STORAGE_BLOCK_COPPER = forge("storage_block/copper");
        public static final ITag.INamedTag<Item> INGOTS_COPPER = forge("ingots/copper");
        public static final ITag.INamedTag<Item> NUGGET_COPPER = forge("nuggets/copper");
        public static final ITag.INamedTag<Item> DUST_COPPER = forge("dusts/copper");
        //tin
        public static final ITag.INamedTag<Item> ORES_TIN = forge("ores/tin");
        public static final ITag.INamedTag<Item> STORAGE_BLOCK_TIN = forge("storage_block/tin");
        public static final ITag.INamedTag<Item> INGOTS_TIN = forge("ingots/tin");
        public static final ITag.INamedTag<Item> NUGGET_TIN = forge("nuggets/tin");
        public static final ITag.INamedTag<Item> DUST_TIN = forge("dusts/tin");
        //lead
        public static final ITag.INamedTag<Item> ORES_LEAD = forge("ores/lead");
        public static final ITag.INamedTag<Item> STORAGE_BLOCK_LEAD = forge("storage_block/lead");
        public static final ITag.INamedTag<Item> INGOTS_LEAD = forge("ingots/lead");
        public static final ITag.INamedTag<Item> NUGGET_LEAD = forge("nuggets/lead");
        public static final ITag.INamedTag<Item> DUST_LEAD = forge("dusts/lead");



        private static ITag.INamedTag<Item> forge(String path) {
            return ItemTags.makeWrapperTag(new ResourceLocation("forge",path).toString());
        }
        private static ITag.INamedTag<Item> mod(String path){
            return ItemTags.makeWrapperTag(new ResourceLocation(Technically.MOD_ID, path).toString());
        }
    }
}

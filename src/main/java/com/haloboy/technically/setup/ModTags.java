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
        public static final ITag.INamedTag<Block> ORES_SILVER = forge("ores/silver");
        public static final ITag.INamedTag<Block> STORAGE_BLOCK_SILVER = forge("storage_block/silver");

        private static ITag.INamedTag<Block> forge(String path) {
            return BlockTags.makeWrapperTag(new ResourceLocation("forge",path).toString());
        }
        private static ITag.INamedTag<Block> mod(String path){
            return BlockTags.makeWrapperTag(new ResourceLocation(Technically.MOD_ID, path).toString());
        }
    }
    public  static final  class  Items{
        public static final ITag.INamedTag<Item> ORES_SILVER = forge("ores/silver");
        public static final ITag.INamedTag<Item> STORAGE_BLOCK_SILVER = forge("storage_block/silver");

        public static final ITag.INamedTag<Item> INGOTS_SILVER = forge("ingots/silver");

        private static ITag.INamedTag<Item> forge(String path) {
            return ItemTags.makeWrapperTag(new ResourceLocation("forge",path).toString());
        }
        private static ITag.INamedTag<Item> mod(String path){
            return ItemTags.makeWrapperTag(new ResourceLocation(Technically.MOD_ID, path).toString());
        }
    }
}

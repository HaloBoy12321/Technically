package com.haloboy.technically.setup;

import com.haloboy.technically.Technically;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> SILVER_INGOT = Registration.ITEMS.register("silver_ingot",()->
            new Item(new Item.Properties().group(Technically.TAB)));
    public static final RegistryObject<Item> FURNACE = Registration.ITEMS.register("furnace",()->
            new Item(new Item.Properties().group(Technically.TAB)));
    static void register(){}
}

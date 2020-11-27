package com.haloboy.technically.setup;

import com.haloboy.technically.Technically;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    //ingots
    public static final RegistryObject<Item> SILVER_INGOT = Registration.ITEMS.register("silver_ingot",()->
            new Item(new Item.Properties().group(Technically.TAB)));
    public static final RegistryObject<Item> COPPER_INGOT = Registration.ITEMS.register("copper_ingot",()->
            new Item(new Item.Properties().group(Technically.TAB)));
    public static final RegistryObject<Item> TIN_INGOT = Registration.ITEMS.register("tin_ingot",()->
            new Item(new Item.Properties().group(Technically.TAB)));
    public static final RegistryObject<Item> LEAD_INGOT = Registration.ITEMS.register("lead_ingot",()->
            new Item(new Item.Properties().group(Technically.TAB)));
    //nugget
    public static final RegistryObject<Item> SILVER_NUGGET = Registration.ITEMS.register("silver_nugget",()->
            new Item(new Item.Properties().group(Technically.TAB)));
    public static final RegistryObject<Item> COPPER_NUGGET = Registration.ITEMS.register("copper_nugget",()->
            new Item(new Item.Properties().group(Technically.TAB)));
    public static final RegistryObject<Item> TIN_NUGGET = Registration.ITEMS.register("tin_nugget",()->
            new Item(new Item.Properties().group(Technically.TAB)));
    public static final RegistryObject<Item> LEAD_NUGGET = Registration.ITEMS.register("lead_nugget",()->
            new Item(new Item.Properties().group(Technically.TAB)));
    //dust
    public static final RegistryObject<Item> SILVER_DUST = Registration.ITEMS.register("silver_dust",()->
            new Item(new Item.Properties().group(Technically.TAB)));
    public static final RegistryObject<Item> COPPER_DUST = Registration.ITEMS.register("copper_dust",()->
            new Item(new Item.Properties().group(Technically.TAB)));
    public static final RegistryObject<Item> TIN_DUST = Registration.ITEMS.register("tin_dust",()->
            new Item(new Item.Properties().group(Technically.TAB)));
    public static final RegistryObject<Item> LEAD_DUST = Registration.ITEMS.register("lead_dust",()->
            new Item(new Item.Properties().group(Technically.TAB)));



    static void register(){}
}

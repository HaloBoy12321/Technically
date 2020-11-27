package com.haloboy.technically;

import com.haloboy.technically.setup.ModItems;
import com.haloboy.technically.setup.Registration;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(Technically.MOD_ID)
public class Technically {
    public static final String MOD_ID = "technically";
    private static final Logger LOGGER = LogManager.getLogger();

    public static final ItemGroup TAB = new ItemGroup("technicallyTAB"){

        @Override
        public ItemStack createIcon() {return new ItemStack(ModItems.SILVER_INGOT.get());}
    };

    public Technically() {
        Registration.register();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
}
package com.haloboy.technically;

import com.haloboy.technically.config.ModConfig;
import com.haloboy.technically.data.util.TechnicallyGroup;
import com.haloboy.technically.setup.Registration;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(Technically.MOD_ID)
public class Technically {
    public static Technically instance;
    public static final String MOD_ID = "technically";
    public static final Logger LOGGER = LogManager.getLogger();
    public static final  ItemGroup technically = new TechnicallyGroup();
    public static ResourceLocation getId(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    public Technically() {
        Registration.register();
        instance = this;

        ModConfig.loadConfig(ModConfig.CONFIG, FMLPaths.CONFIGDIR.get().resolve("technically.toml"));
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::modSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void modSetup(final FMLCommonSetupEvent event)
    {
        //OreGenerator.addFeatures();
        LOGGER.info("Technically common setup");
    }
}
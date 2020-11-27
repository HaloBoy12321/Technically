package com.haloboy.technically.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import com.haloboy.technically.Technically;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Technically.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        //silver
        withExistingParent("silver_block",modLoc("block/silver_block"));
        withExistingParent("silver_ore",modLoc("block/silver_ore"));
        builder(itemGenerated, "silver_ingot");
        builder(itemGenerated, "silver_nugget");
        builder(itemGenerated, "silver_dust");

        //copper
        withExistingParent("copper_block",modLoc("block/copper_block"));
        withExistingParent("copper_ore",modLoc("block/copper_ore"));
        builder(itemGenerated, "copper_ingot");
        builder(itemGenerated, "copper_nugget");
        builder(itemGenerated, "copper_dust");
        //tin
        withExistingParent("tin_block",modLoc("block/tin_block"));
        withExistingParent("tin_ore",modLoc("block/tin_ore"));
        builder(itemGenerated, "tin_ingot");
        builder(itemGenerated, "tin_nugget");
        builder(itemGenerated, "tin_dust");
        //lead
        withExistingParent("lead_block",modLoc("block/lead_block"));
        withExistingParent("lead_ore",modLoc("block/lead_ore"));
        builder(itemGenerated, "lead_ingot");
        builder(itemGenerated, "lead_nugget");
        builder(itemGenerated, "lead_dust");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}

package com.haloboy.technically.data.client;

import com.haloboy.technically.Technically;
import com.haloboy.technically.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.fml.RegistryObject;
import org.apache.commons.lang3.StringUtils;


public class ModLangProvider extends LanguageProvider {

    public ModLangProvider(DataGenerator gen) {
        super(gen, Technically.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.technically_tab", "Technically");
        for (RegistryObject<Item> object : Registration.ITEMS.getEntries()){
            String ItemKey = object.get().getTranslationKey(); // block.technically.silver_block
            String name = capitalizeString(StringUtils.substringAfter(ItemKey,"technically.").replace("_"," "));
            add(ItemKey, name);
        }
    }

    public static String capitalizeString(String string) {
        char[] chars = string.toLowerCase().toCharArray();
        boolean found = false;
        for (int i = 0; i < chars.length; i++) {
            if (!found && Character.isLetter(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            } else if (Character.isWhitespace(chars[i])) { // You can add other chars here
                found = false;
            }
        }
        return String.valueOf(chars);
    }
}

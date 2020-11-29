package com.haloboy.technically.data;

import com.haloboy.technically.setup.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class TechnicallyGroup extends ItemGroup {
    public TechnicallyGroup() {
        super("technically_tab");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.SILVER_INGOT.get());
    }
}

package com.example.bamboo.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CustomCreativeTab {
    public static final CreativeModeTab BambooTab = new CreativeModeTab("bambooTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModsItems.bamb.get());
        }
    };
}

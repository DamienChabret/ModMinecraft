package com.example.bamboo.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CustomCreativeTab {
    private static final CreativeModeTab bambooTab = new CreativeModeTab("bambooTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModsItems.getBamb().get());
        }
    };


    /// Acesseur du bamboo tab
    public static CreativeModeTab getBambooTab(){
        return bambooTab;
    }
}

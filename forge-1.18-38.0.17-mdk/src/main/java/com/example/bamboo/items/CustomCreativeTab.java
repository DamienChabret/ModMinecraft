package com.example.bamboo.items;

import com.example.bamboo.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CustomCreativeTab {
    private static final CreativeModeTab bambooTab = new CreativeModeTab("bambooTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.bamboo_grass.get());
        }
    };


    /// Acesseur du bamboo tab
    public static CreativeModeTab getBambooTab(){
        return bambooTab;
    }
}

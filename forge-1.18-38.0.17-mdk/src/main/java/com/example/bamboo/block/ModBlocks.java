package com.example.bamboo.block;

import com.example.bamboo.Bamboo;
import com.example.bamboo.items.CustomCreativeTab;
import com.example.bamboo.items.ModsItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

/**
 * Classe qui contient les blocks
 */
public class ModBlocks {
    // Créations liste de blocks
    public static final DeferredRegister<Block> blocks =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Bamboo.ID_MOD);


    // =================== LISTE DES BLOCKS DU JEU
    // BLOCK
    public static final RegistryObject<Block> bambou_block = RegisterBlock("bambou_block", // Nom
        () -> new Block(BlockBehaviour.Properties.of(Material.CACTUS)), // Indique même proprieté qu'un autre block
        CustomCreativeTab.getBambooTab()); // Indique tab dans lequel il apparait
    // DROP
    /*
    public static final RegistryObject<Block> bambou_drop = RegisterBlock("bambou_block", // Nom
            () -> new Experience(BlockBehaviour.Properties.of(Material.CACTUS), UniformInt.of(3,7)), // Indique même proprieté qu'un autre block
            CustomCreativeTab.BambooTab); // Indique tab dans lequel il apparait
     */
     // ===========================================


    /**
     * Ajoute un nouveau blocks
     * @param name
     * @param block
     * @param tab
     * @return
     * @param <T>
     */
    private static <T extends  Block> RegistryObject<T> RegisterBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = blocks.register(name,block); // enregistre le block
        registerBlockItem(name, toReturn, tab); // enregistre le block comme item
        return toReturn;
    }

    /**
     * Enregistre le block comme item
     * @param name
     * @param block
     * @param tab
     * @return
     * @param <T>
     */
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModsItems.getItems().register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    /**
     * ???
     * @param eventBus ???
     */
    public static void register(IEventBus eventBus){
        blocks.register(eventBus);
    }
}

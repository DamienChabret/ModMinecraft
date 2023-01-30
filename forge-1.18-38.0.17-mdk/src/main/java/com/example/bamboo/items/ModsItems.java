package com.example.bamboo.items;

import com.example.bamboo.Bamboo;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModsItems {

    // liste d'items
    public static final DeferredRegister<Item> items = DeferredRegister.create(ForgeRegistries.ITEMS, Bamboo.ID_MOD);


    // Ajout d'item
    public static final RegistryObject<Item> bambook = items.register("bambook",
            () -> new Item(new Item.Properties().tab(CustomCreativeTab.BambooTab))); // Créer l'item et l'ajoute à la liste des items de décoration

    public static final RegistryObject<Item> bamb = items.register("bamboo",
            () -> new Item(new Item.Properties().tab(CustomCreativeTab.BambooTab))); // Créer l'item et l'ajoute à la liste des items de décoration

    public static void register(IEventBus eventBus){
        items.register(eventBus);
    }



}
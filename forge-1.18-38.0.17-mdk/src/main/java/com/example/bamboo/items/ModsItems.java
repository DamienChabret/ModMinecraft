package com.example.bamboo.items;

import com.example.bamboo.Bamboo;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * Classe qui contient les items
 */
public class ModsItems {

    // liste d'items
    private static final DeferredRegister<Item> items = DeferredRegister.create(ForgeRegistries.ITEMS, Bamboo.ID_MOD);

    // Ajout d'item
    private static final RegistryObject<Item> bambook = items.register("bambook",
            () -> new Item(new Item.Properties().tab(CustomCreativeTab.getBambooTab()))); // Créer l'item et l'ajoute à la liste des items de décoration




    /**
     * Retourne la liste des items
     * @return Liste des items
     */
    public static DeferredRegister<Item> getItems(){
        return items;
    }



    /**
     * Récupère l'item >> Bambook <<
     * @return un item
     */
    public static RegistryObject<Item> getBambook(){
        return bambook;
    }


    /**
     * ????
     * @param eventBus ???
     */
    public static void register(IEventBus eventBus){
        items.register(eventBus);
    }



}
package com.zombieturtle.scrambledloot.client;

import com.zombieturtle.scrambledloot.init.ModItems;
import com.zombieturtle.scrambledloot.ScrambledLoot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(value = Side.CLIENT, modid = ScrambledLoot.MODID)
public class ModelRegistrationHandler {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        registerModel(ModItems.TOOL_CRATE, 0);
        registerModel(ModItems.INDUSTRIAL_CRATE, 0);
        registerModel(ModItems.PRECIOUS_CRATE, 0);
        registerModel(ModItems.NETHEREND_CRATE, 0);
        registerModel(ModItems.OBLIVI_CRATE, 0);
    }

    private static void registerModel(Item item, int meta) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}

package com.zombieturtle.scrambledloot;

import com.zombieturtle.scrambledloot.util.RegistryUtil;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = ScrambledLoot.MODID)
public class RegistrationHandler {

    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        final Item[] items = {
                RegistryUtil.setItemName(new Item(), "tool_crate").setCreativeTab(CreativeTabs.MISC),
                RegistryUtil.setItemName(new Item(), "industrial_crate").setCreativeTab(CreativeTabs.MISC),
                RegistryUtil.setItemName(new Item(), "precious_crate").setCreativeTab(CreativeTabs.MISC),
                RegistryUtil.setItemName(new Item(), "netherend_crate").setCreativeTab(CreativeTabs.MISC),
                RegistryUtil.setItemName(new Item(), "oblivi_crate").setCreativeTab(CreativeTabs.MISC)
        };

        event.getRegistry().registerAll(items);
    }

}

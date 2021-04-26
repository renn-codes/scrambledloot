package com.zombieturtle.scrambledloot.util;

import com.zombieturtle.scrambledloot.ScrambledLoot;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class RegistryUtil {

    public static Item setItemName(final Item item, final String name) {
        item.setRegistryName(ScrambledLoot.MODID, name).setUnlocalizedName(ScrambledLoot.MODID + "." + name);
        return item;
    }

    public static Block setBlockName(final Block block, final String name) {
        block.setRegistryName(ScrambledLoot.MODID, name).setUnlocalizedName(ScrambledLoot.MODID + "." + name);
        return block;
    }
}

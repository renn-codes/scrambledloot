package com.zombieturtle.scrambledloot;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ScrambledLoot.MODID, name = ScrambledLoot.NAME, version = ScrambledLoot.VERSION)
public class ScrambledLoot
{
    public static final String MODID = "scrambledloot";
    public static final String NAME = "Scrambled Loot";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("[init] Scrambled Loot, hot and ready! Order up!");
    }
}

package com.omicron.demonic_scythe;

import net.minecraft.init.Blocks;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

@Mod(modid = DemonicScythe.MODID, version = DemonicScythe.VERSION)
public class DemonicScythe
{
    public static final String MODID = "demonic_scythe";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        // some example code
        File directory = event.getModConfigurationDirectory();
        Registration.config = new Configuration(new File(directory.getPath(), "demonic_scythe.cfg"));
        Config.readConfig();
        System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
        Registration.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        if (Registration.config.hasChanged())
            Registration.config.save();
        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
    }
}

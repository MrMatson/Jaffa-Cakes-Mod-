package com.mrmatson.jaffas;

import com.mrmatson.jaffas.proxy.IProxy;
import com.mrmatson.jaffas.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class JaffaCakesMod
{

    @Mod.Instance("Jaffas")
    public static JaffaCakesMod instance;

    @SidedProxy(clientSide = "com.mrmatson.jaffas.proxy.ClientProxy", serverSide = "com.mrmatson.jaffas.proxy.ServerProxy")
    public static IProxy proxy;



    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}

package santa.gregtanks;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import net.minecraft.creativetab.CreativeTabs;

import santa.gregtanks.blocks.BlockHandler;
import santa.gregtanks.proxies.Client;
import santa.gregtanks.proxies.Common;
//import santa.gregtanks.items.ItemHandler;

/**
 * Created by elijahfoster-wysocki on 9/20/14.
 */

@Mod(name="GregTanks", modid="gregtanks", version="0.1", dependencies="required-after:gregtech")
public class GregTanks {

    @Mod.Instance("gregtanks")
    public static GregTanks instance;

    @SidedProxy(clientSide="santa.gregtanks.proxies.Client", serverSide="santa.gregtanks.proxies.Common")
    public static Common proxy;
    public static Client proxyClient;
    public static CreativeTabs tabGregTanks = new GregTanksTab("GregTanks");

    @Mod.EventHandler
    void pre(FMLPreInitializationEvent event){

        BlockHandler.define();
        BlockHandler.register();
        BlockHandler.recipes();

    }

    @Mod.EventHandler
    void init(FMLInitializationEvent event){

        /*
            I am only keeping this here in case I, for whatever reason, add items. Same goes for the import at line 14.
        ItemHandler.define();
        ItemHandler.register();
        ItemHandler.recipes();
        */

        proxy.initRenderers();
        proxy.initSounds(); //I don't actually have sounds, but in case I do in the future, there's this already there.
    }



    @Mod.EventHandler
    void post(FMLPostInitializationEvent event){

    }

    /* TODO
     */
}

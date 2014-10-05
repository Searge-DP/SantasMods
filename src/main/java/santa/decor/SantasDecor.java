package santa.decor;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import santa.decor.blocks.BlockHandler;
import santa.decor.proxies.CommonProxy;
import cpw.mods.fml.common.Mod.EventHandler;

/**
 * Created by elijahfoster-wysocki on 7/14/14.
 */

@Mod(modid = "santasdecor", name = "Santa's Decor", version = "0.5.3")
public class SantasDecor {

    @SidedProxy(clientSide="santa.decor.proxies.ClientProxy", serverSide="santa.decor.proxies.CommonProxy")
    public static CommonProxy proxy;

    public static CreativeTabs tabSantasDecor = new SantasDecorTab("Santa's Decor");

    @Mod.EventHandler
    void foreplay(FMLPreInitializationEvent event){


        Config.load(event);

        BlockHandler.meet();
        BlockHandler.date();
        BlockHandler.useMove();

        System.out.println("[Santa's Decor] Stuff should be working fine.");
        System.out.println("[Santa] Hi Peter. How you doin bby?");
    }

    @Mod.EventHandler
    void fornication(FMLInitializationEvent event){
        proxy.initRenderers();
        proxy.initSounds();


    }

    @Mod.EventHandler
    void cuddling(FMLPostInitializationEvent event){
        System.out.println("[Santa's Decor] Stuff is definitely working fine.");

    }

    /* TODO
        FOR 0.6
    Stained Glass Panes
    Config options to disable block categories (burnt, blaze, etc)
    Lamps
    GregTech integration
        Blocks require a machine to be created. Get help from Peter on how to use the GT API.
    Flooring tiles (connected textures that are random maybe)
    Dark Glass Block
     */
}

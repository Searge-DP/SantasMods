package santa.toys;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import santa.toys.blocks.BlockHandler;
import santa.toys.items.ItemHandler;
import santa.toys.proxies.Client;
import santa.toys.proxies.Common;

/**
 * Created by elijahfoster-wysocki on 7/28/14.
 */
@Mod(modid = "santastoys", name = "Santa's Toys", version = "0.6")
public class SantasToys {

    @Mod.Instance("santastoys")
    public static SantasToys instance;

    @SidedProxy(clientSide="santa.toys.proxies.Client", serverSide="santa.toys.proxies.Common")
    public static Common proxy;
    public static Client proxyClient;
    public static CreativeTabs tabSantasToys = new SantasToysTab("Santa's Toys");

    @Mod.EventHandler
    void foreplay(FMLPreInitializationEvent event){

        Config.load(event);

        BlockHandler.meet();
        BlockHandler.date();
        BlockHandler.useMove();

    }

    @Mod.EventHandler
    void intercourse(FMLInitializationEvent event){

        ItemHandler.meet();
        ItemHandler.useMove();
        ItemHandler.date();

        proxy.initRenderers();
        proxy.initSounds(); //I don't actually have sounds, but in case I do in the future, there's this already there.
    }



    @Mod.EventHandler
    void cuddling(FMLPostInitializationEvent event){

    }

    /* TODO
    Make a config file that can be used to disable each individual feature. (Will come in 0.4)
    Make the dispenser shoot the entities rather than the item itself (Will come in 0.5)
    Powered Carts, takes solid fuel to go faster than normal carts. same speed as normal carts if it has no fuel.(0.5)
     */

}


package santa.pants;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import santa.pants.ItemHandler;
import santa.pants.proxies.CommonProxy;

/**
 * Created by elijahfoster-wysocki on 7/20/14.
 */
@Mod(modid = "sparklypants", name = "Sparkly Pants", version = "0.2")
public class SparklyPants {


    @SidedProxy(clientSide = "santa.pants.proxies.ClientProxy", serverSide = "santa.pants.proxies.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    void foreplay(FMLPreInitializationEvent event) {

        System.out.println("[Sparkly Pants] Preparing to make you a pop star.");

    }

    @Mod.EventHandler
    void intercourse(FMLInitializationEvent event) {

        ItemHandler.meet();
        ItemHandler.useMove();
        ItemHandler.date();

    }


    @Mod.EventHandler
    void cuddling(FMLPostInitializationEvent event) {

        System.out.println("[Sparkly Pants] Injected pop star juice into your pants.");

    }

    /* TODO
    Make the pants actually sparkle, maybe light a small area as well (Will come in 0.3)
     */
}

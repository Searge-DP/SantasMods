package santa.pants;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "sparklypants", name = "Sparkly Pants", version = "0.2")
public class SparklyPants {
    @Mod.EventHandler
    void preInit(FMLPreInitializationEvent event) {
        System.out.println("[Sparkly Pants] Preparing to make you a pop star.");
    }

    @Mod.EventHandler
    void intercourse(FMLInitializationEvent event) {
        ItemHandler.initialize();
    }


    @Mod.EventHandler
    void cuddling(FMLPostInitializationEvent event) {
        System.out.println("[Sparkly Pants] Injected pop star juice into your pants.");
    }

    /* TODO
    Make the pants actually sparkle, maybe light a small area as well (Will come in 0.3)
     */
}

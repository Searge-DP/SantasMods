package santa.toys;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.block.BlockDispenser;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import santa.toys.blocks.BlockHandler;
import santa.toys.entity.DispenserBehaviorEnder;
import santa.toys.entity.DispenserBehaviorNether;
import santa.toys.items.EnderBlaster;
import santa.toys.items.ItemHandler;
import santa.toys.proxies.Client;
import santa.toys.proxies.Common;

/**
 * @author SatanicSanta
 */
@Mod(modid = "santastoys", name = "Santa's Toys", version = "0.4")
public class SantasToys {

    @Mod.Instance("santastoys")
    public static SantasToys instance;

    @SidedProxy(clientSide="santa.toys.proxies.Client", serverSide="santa.toys.proxies.Common")
    public static Common proxy;
    public static Client proxyClient;
    public static CreativeTabs tabSantasToys = new SantasToysTab("Santa's Toys");

    @Mod.EventHandler
    void preInit(FMLPreInitializationEvent event) {

        Config.load(event);

        BlockHandler.meet();
        BlockHandler.date();
        BlockHandler.useMove();

        ItemHandler.registerBehaviors();

    }

    @Mod.EventHandler
    void init(FMLInitializationEvent event) {

        ItemHandler.meet();
        ItemHandler.useMove();
        ItemHandler.date();

        proxy.initRenderers();
        proxy.initSounds(); //I don't actually have sounds, but in case I do in the future, there's this already there.
    }



    @Mod.EventHandler
    void postInit(FMLPostInitializationEvent event) {}

}


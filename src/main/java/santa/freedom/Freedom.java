package santa.freedom;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import santa.freedom.items.ItemHandler;
import santa.freedom.proxies.CommonProxy;

/**
 * Created by elijahfoster-wysocki on 7/20/14.
 */
@Mod(modid="santafreedom", name="Freedom", version="1.7.7.8")
public class Freedom
{

    @SidedProxy(clientSide="santa.freedom.proxies.ClientProxy", serverSide="santa.freedom.proxies.CommonProxy")
    public static CommonProxy proxy;

    public static CreativeTabs tabFreedom = new FreedomTab("Freedom");

    @Mod.EventHandler
    void foreplay(FMLPreInitializationEvent event)
    {

        System.out.println("wooooooooo freedom! guns and shit!");
    }
    @Mod.EventHandler
    void fornication(FMLInitializationEvent event) {
        System.out.println("freedom has been obtained! prepare to inject mountain dew and fried butter into your face!");

        proxy.initRenderers();
        proxy.initSounds();

        ItemHandler.meet();
        ItemHandler.useMove();
        ItemHandler.date();
    }

    @Mod.EventHandler
    void cuddling(FMLPostInitializationEvent event)
    {
    }
}

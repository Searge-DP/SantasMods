package santa.decor;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import santa.decor.blocks.BlockHandler;
import santa.decor.proxies.CommonProxy;

@Mod(modid = "santasdecor", name = "Santa's Decor", version = "0.7")
public class SantasDecor {
    @SidedProxy(clientSide="santa.decor.proxies.ClientProxy", serverSide="santa.decor.proxies.CommonProxy")
    public static CommonProxy proxy;

    public static CreativeTabs tabSantasDecor = new SantasDecorTab("Santa's Decor");
    public static int pumpkinRenderID;

    /**
     * Registers a tile entity.
     * @param clazz The class that extends TileEntity.
     * @param str The customized key/name.
     */
    private static void registerTE(Class<?extends TileEntity> clazz, String str){
        GameRegistry.registerTileEntityWithAlternatives(clazz, "santasdecor" + str);
    }

    @Mod.EventHandler
    void pre(FMLPreInitializationEvent event) {
        Config.load(event);
        BlockHandler.initializeFamilies();
        BlockHandler.registerBlocks();
        BlockHandler.registerRecipes();
    }

    @Mod.EventHandler
    void init(FMLInitializationEvent event) {
        proxy.initRenderers();
        proxy.initSounds();

    }

    @Mod.EventHandler
    void postInit(FMLPostInitializationEvent event) {}
}

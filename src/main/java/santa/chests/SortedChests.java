package santa.chests;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;

/**
 * @author SatanicSanta
 */

@Mod(modid = "sortedchests", name = "Sorted Chests", version = "0.0.1")
public class SortedChests {

    @SidedProxy(clientSide="santa.chests.proxies.Client", serverSide="santa.chests.proxies.Common")
    public static Common proxy;
    public static Client proxyClient;
    public static CreativeTabs tabSortedChests = new SortedChestsTab("Sorted Chests");

    @Mod.Instance("sortedchests")
    public static SortedChests instance;

    public static Block chest;

    public static void registerTileEntity(Class<? extends TileEntity> clazz, String key) {
        GameRegistry.registerTileEntityWithAlternatives(clazz, "sortedchests:" + key);
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        chest = new BlockSortedChest();
        GameRegistry.registerBlock(chest, "chest");
        registerTileEntity(TileEntitySortedChest.class, "chest");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.initRenderers();
        proxy.initSounds();
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
    }
}
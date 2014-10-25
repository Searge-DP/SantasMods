package santa.resurrection;

import cpw.mods.fml.common.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.*;
import net.minecraft.tileentity.TileEntity;
import santa.resurrection.block.*;
import santa.resurrection.proxies.*;


/**
 * Created by elijahfoster-wysocki on 10/25/14.
 */

@Mod(modid = "ftbresurrection", name = "Resurrection Custom Mod", version = "0.1")
public class ResurrectionMod {

    public static void registerTileEntity(Class<? extends TileEntity> clazz, String key){
        GameRegistry.registerTileEntityWithAlternatives(clazz, "ftbresurrection:" + key);
    }

    @SidedProxy(clientSide="santa.resurrection.proxies.Client", serverSide="santa.resurrection.proxies.Common")
    public static Common proxyCommon;
    public static Client proxyClient;

    @Mod.EventHandler
    void pre(FMLPreInitializationEvent event){
        BlockHandler.newStuff();
        BlockHandler.registerStuff();

        registerTileEntity(TileEntityTrophy.class, "trophy");
        registerTileEntity(TileEntityTrophyMulti.class, "trophyMulti");
    }

    @Mod.EventHandler
    void init(FMLInitializationEvent event){

        proxyCommon.initRenderers();
        proxyCommon.initSounds();
    }

    /* TODO
    Literally everything.
     */
}

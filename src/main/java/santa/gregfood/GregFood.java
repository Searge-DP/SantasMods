package santa.gregfood;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import santa.gregfood.fluid.*;
import santa.gregfood.item.*;

/**
 * @author SatanicSanta
 */

@Mod(name = "GregFood", modid = "gregfood", version = "0.1", dependencies = "required-after:gregtech; required-after:harvestcraft")
public class GregFood {

    public static CreativeTabs tab;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        new MetaItem();
        new Fluids().run();
        Config.load(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void post(FMLPostInitializationEvent event){

    }
}

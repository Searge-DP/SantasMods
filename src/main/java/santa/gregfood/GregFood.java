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
        Config.load(event);
        new MetaItem();
        new Fluids().run();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        new FluidRecipes().run();
    }

    @Mod.EventHandler
    public void post(FMLPostInitializationEvent event){

        System.out.println("Seriously, in a second when Greg tells you to wait before killing MC, WAIT. It will finish, it just may take a while. He's doing OreDict stuff and there's really no way around it. (Also his tileentity ores don't cause lag, stop saying otherwise.)");
    }
}

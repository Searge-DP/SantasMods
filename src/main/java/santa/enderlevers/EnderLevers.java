package santa.enderlevers;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import santa.enderlevers.blocks.BlockHandler;

import java.io.File;

/**
 * @author SatanicSanta
 */

@Mod(modid = "enderlevers", name = "Ender Levers", version = "0.1")
public class EnderLevers {

    public static CreativeTabs tab;

    @Mod.EventHandler
    public void pre(FMLPreInitializationEvent event){
        Config.load(event);

        tab = new EnderLeversTab(CreativeTabs.getNextID(), "enderlevers").setBackgroundImageName("item_search.png");

        BlockHandler.registerStuff();
        //ItemHandler.registerStuff(); Putting this here in case I decide to add items.

        if (Loader.isModLoaded("EnderStorage") && Config.consoleStuff){
            FMLLog.info("[enderlevers] OH HI ENDERSTORAGE BROTHER.");
        }
    }

    @Mod.EventHandler
    public void dur(FMLInitializationEvent event){
        BlockHandler.recipes();
        //ItemHandler.recipes(); Putting this here in case I decide to add items.
    }

    @Mod.EventHandler
    public void pos(FMLPostInitializationEvent event){
        if (Config.consoleStuff) {
            FMLLog.info("[enderlevers] Ender Levers has loaded probably.");
        }
    }

    private class EnderLeversTab extends CreativeTabs {
        public EnderLeversTab(int par1, String par2){
            super(par1, par2);
        }

        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem(){
            return Item.getItemFromBlock(BlockHandler.enderLever);
        }

        @Override
        public boolean hasSearchBar(){
            return false;
        }
    }
}

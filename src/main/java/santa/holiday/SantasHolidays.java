package santa.holiday;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import santa.holiday.items.ItemHandler;
import santa.holiday.blocks.BlockHandler;

import java.util.Date;

/**
 * @author SatanicSanta
 */

@Mod(name = "Santa's Holidays", modid = "santaholidays", version = "0.1.0")
public class SantasHolidays {

    public static CreativeTabs tab;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        Config.load(event);

        tab = new HolidayTab(CreativeTabs.getNextID(), "santaholidays").setBackgroundImageName("item_search.png");

        BlockHandler.registerStuff();
        ItemHandler.registerStuff();

        HolidayCrap.doCrap();

        if (Config.consoleSpam){
            System.out.println("Preinit stage done");
        }
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        BlockHandler.recipes();
        ItemHandler.recipes();

        if (Config.consoleSpam){
            System.out.println("Init stage done");
        }
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

        if (Config.consoleSpam){
            System.out.println("Postinit stage done");
        }
    }

    private class HolidayTab extends CreativeTabs {
        public HolidayTab(int par1, String par2){
            super(par1, par2);
        }

        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem(){
            return Item.getItemFromBlock(Blocks.pumpkin);
        }

        @Override
        public boolean hasSearchBar(){
            return false;
        }
    }
}

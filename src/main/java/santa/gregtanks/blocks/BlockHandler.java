package santa.gregtanks.blocks;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.block.Block;

import santa.gregtanks.blocks.wood.*;
/*
import santa.gregtanks.blocks.copper.*;
import santa.gregtanks.blocks.bronze.*;
import santa.gregtanks.blocks.steel.*;
import santa.gregtanks.blocks.stainless.*;
import santa.gregtanks.blocks.titanium.*;
import santa.gregtanks.blocks.tungstensteel.*;
*/

/**
 * Created by elijahfoster-wysocki on 9/20/14.
 */
public class BlockHandler {

    public static Block woodTankFrame;
    public static Block woodTankWindow;
    public static Block woodTankControl;

    /*
    public static Block copperTankFrame;
    public static Block copperTankWindow;
    public static Block copperTankControl;

    public static Block bronzeTankFrame;
    public static Block bronzeTankWindow;
    public static Block bronzeTankControl;

    public static Block steelTankFrame;
    public static Block steelTankWindow;
    public static Block steelTankControl;

    public static Block stainlessTankFrame;
    public static Block stainlessTankWindow;
    public static Block stainlessTankControl;

    public static Block titaniumTankFrame;
    public static Block titaniumTankWindow;
    public static Block titaniumTankControl;

    public static Block tungstensteelTankFrame;
    public static Block tungstensteelTankWindow;
    public static Block tungstensteelTankControl;
    */

    public static void define(){
        woodTankFrame = new WoodTankFrame();
        woodTankWindow = new WoodTankWindow();
        woodTankControl = new WoodTankControl();

        /*
        copperTankFrame = new CopperTankFrame();
        copperTankWindow = new CopperTankWindow();
        copperTankControl = new CopperTankControl();

        bronzeTankFrame = new BronzeTankFrame();
        bronzeTankWindow = new BronzeTankWindow();
        bronzeTankControl = new BronzeTankWindow();

        steelTankFrame = new SteelTankFrame();
        steelTankWindow = new SteelTankWindow();
        steelTankControl = new SteelTankControl();

        stainlessTankFrame = new StainlessTankFrame();
        stainlessTankWindow = new StainlessTankWindow();
        stainlessTankControl = new StainlessTankControl();

        titaniumTankFrame = new TitaniumTankFrame();
        titaniumTankWindow = new TitaniumTankWindow();
        titaniumTankControl = new TitaniumTankControl();

        tungstensteelTankFrame = new TungstensteelTankFrame();
        tungstensteelTankWindow = new TungstensteelTankWindow();
        tungstensteelTankControl = new TungstensteelTankControl();
        */

    }

    public static  void register(){
        
        GameRegistry.registerBlock(woodTankFrame, BlockInfo.WOODTANKFRAME_KEY);
        GameRegistry.registerBlock(woodTankWindow, BlockInfo.WOODTANKWINDOW_KEY);
        GameRegistry.registerBlock(woodTankControl, BlockInfo.WOODTANKCONTROL_KEY);

        /*
        GameRegistry.registerBlock(copperTankFrame, BlockInfo.COPPERTANKFRAME_KEY);
        GameRegistry.registerBlock(copperTankWindow, BlockInfo.COPPERTANKWINDOW_KEY);
        GameRegistry.registerBlock(copperTankControl, BlockInfo.COPPERTANKCONTROL_KEY);

        GameRegistry.registerBlock(bronzeTankFrame, BlockInfo.BRONZETANKFRAME_KEY);
        GameRegistry.registerBlock(bronzeTankWindow, BlockInfo.BRONZETANKWINDOW_KEY);
        GameRegistry.registerBlock(bronzeTankControl, BlockInfo.BRONZETANKCONTROL_KEY);

        GameRegistry.registerBlock(steelTankFrame, BlockInfo.STEELTANKFRAME_KEY);
        GameRegistry.registerBlock(steelTankWindow, BlockInfo.STEELTANKWINDOW_KEY);
        GameRegistry.registerBlock(steelTankControl, BlockInfo.STEELTANKCONTROL_KEY);

        GameRegistry.registerBlock(stainlessTankFrame, BlockInfo.STAINLESSTANKFRAME_KEY);
        GameRegistry.registerBlock(stainlessTankWindow, BlockInfo.STAINLESSTANKWINDOW_KEY);
        GameRegistry.registerBlock(stainlessTankControl, BlockInfo.STAINLESSTANKCONTROL_KEY);

        GameRegistry.registerBlock(titaniumTankFrame, BlockInfo.TITANIUMTANKFRAME_KEY);
        GameRegistry.registerBlock(titaniumTankWindow, BlockInfo.TITANIUMTANKWINDOW_KEY);
        GameRegistry.registerBlock(titaniumTankControl, BlockInfo.TITANIUMTANKCONTROL_KEY);

        GameRegistry.registerBlock(tungstensteelTankFrame, BlockInfo.TUNGSTENSTEELTANKFRAME_KEY);
        GameRegistry.registerBlock(tungstensteelTankWindow, BlockInfo.TUNGSTENSTEELTANKWINDOW_KEY);
        GameRegistry.registerBlock(tungstensteelTankControl, BlockInfo.TUNGSTENSTEELTANKCONTROL_KEY);
        */

    }

    public static void recipes(){

    }
}

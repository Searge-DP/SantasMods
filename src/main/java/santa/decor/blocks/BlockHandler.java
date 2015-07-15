package santa.decor.blocks;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import santa.decor.Config;
import santa.decor.blocks.items.*;

/**
 * @author SatanicSanta
 */
public class BlockHandler {

    public static final String[] familiesMain = {
      "blaze",   //0
      "bone",    //1
      "burnt",   //2
      "crying",  //3
      "ender",   //4
      "flesh",   //5
      "ice",     //6
      "leather", //7
      "porked",  //8
      "slime",   //9
      "snow"     //10
    };

    public static final String[] familiesQuartz = {
      "blaze",  //0
      "burnt",  //1
      "crying", //2
      "ender",  //3
      "ice",    //4
      "porked", //5
      "slime"   //6
    };

    //public static Block pumpkin;


    public static Block brick;
    public static Block chiseled;
    public static Block cobblestone;
    public static Block log;
    public static Block paver;
    public static Block plank;
    public static Block quartz;
    public static Block quartzChiseled;
    public static Block quartzPillar;
    public static Block stone;
    public static Block glass;

    /*nyi
    public static Block darkGlassPane;
    public static Block blazeGlassPane;
    public static Block boneGlassPane;
    public static Block fleshGlassPane;
    public static Block slimyGlassPane;
    public static Block enderGlassPane;
    public static Block burntGlassPane;
    public static Block icyGlassPane;
    public static Block leatherGlassPane;
    public static Block snowyGlassPane;
    public static Block cryingGlassPane;
    public static Block porkedGlassPane;
    */

    public static void registerBlocks() {
        /*
        if (Config.enablePumpkin){
            GameRegistry.registerBlock(pumpkin, BlockInfo.PUMPKIN_KEY);
        }
        */

        brick = GameRegistry.registerBlock(new Brick(), ItemBlockBrick.class, "brick").setBlockName("brick");
        chiseled = GameRegistry.registerBlock(new Chiseled(), ItemBlockChiseled.class, "chiseled").setBlockName("chiseled");
        cobblestone = GameRegistry.registerBlock(new Cobblestone(), "cobblestone").setBlockName("cobblestone");
        log = GameRegistry.registerBlock(new Log(), "log").setBlockName("log");
        paver = GameRegistry.registerBlock(new Paver(), "paver").setBlockName("paver");
        plank = GameRegistry.registerBlock(new Plank(), "plank").setBlockName("plank");
        quartz = GameRegistry.registerBlock(new Quartz(), "quartz").setBlockName("quartz");
        quartzChiseled = GameRegistry.registerBlock(new QuartzChiseled(), "quartzChiseled").setBlockName("quartzChiseled");
        quartzPillar = GameRegistry.registerBlock(new QuartzPillar(), "quartzPillar").setBlockName("quartzPillar");
        stone = GameRegistry.registerBlock(new Stone(), "stone").setBlockName("stone");
        glass = GameRegistry.registerBlock(new Glass(), "glass").setBlockName("glass");

        /*
        GameRegistry.registerBlock(boneGlassPane, BlockInfo.BONEGLASSPANE_KEY);
        GameRegistry.registerBlock(fleshGlassPane, BlockInfo.FLESHGLASSPANE_KEY);
        GameRegistry.registerBlock(slimyGlassPane, BlockInfo.SLIMEGLASSPANE_KEY);
        GameRegistry.registerBlock(enderGlassPane, BlockInfo.ENDERGLASSPANE_KEY);
        GameRegistry.registerBlock(burntGlassPane, BlockInfo.BURNTGLASSPANE_KEY);
        GameRegistry.registerBlock(icyGlassPane, BlockInfo.ICEGLASSPANE_KEY);
        GameRegistry.registerBlock(leatherGlassPane, BlockInfo.LEATHERGLASSPANE_KEY);
        GameRegistry.registerBlock(snowyGlassPane, BlockInfo.SNOWGLASSPANE_KEY);
        GameRegistry.registerBlock(blazeGlassPane, BlockInfo.BLAZEGLASSPANE_KEY);*/
    }

    public static void registerRecipes() {
        if (Config.enableBone) {
            GameRegistry.addRecipe(new ItemStack(brick, 4, 1), new Object[] {
              "XX", "XX", 'X', new ItemStack(stone, 1, 1).getItem()
            });

            GameRegistry.addRecipe(new ItemStack(cobblestone, 8, 1), new Object[] {
              "XXX", "XZX", "XXX", 'X', Blocks.cobblestone, 'Z', Items.bone
            });

            GameRegistry.addRecipe(new ItemStack(chiseled, 4, 1), new Object[] {
              "XX", "XX", 'X', new ItemStack(brick, 1, 1).getItem()
            });

            GameRegistry.addRecipe(new ItemStack(log, 8, 1), new Object[] {
              "XXX", "XZX", "XXX", 'X', Blocks.log, 'Z', Items.bone
            });

            GameRegistry.addShapelessRecipe(new ItemStack(plank, 4, 1), new Object[]{
              new ItemStack(log, 1, 1)
            });

            GameRegistry.addRecipe(new ItemStack(stone, 8, 1), new Object[]{
              "XXX", "XZX", "XXX", 'X', Blocks.stone, 'Z', Items.bone
            });

            GameRegistry.addShapelessRecipe(new ItemStack(paver, 1, 1), new Object[]{
              new ItemStack(brick, 1, 1)
            });

            GameRegistry.addRecipe(new ItemStack(glass, 1, 1), new Object[] {
              "XXX", "XZX", "XXX", 'X', Blocks.glass, 'Z', Items.bone
            });
        }

        //flesh
        if (Config.enableFlesh) {

        }

        //ice
        if (Config.enableIce) {

        }

        //snow
        if (Config.enableSnow) {

        }

        //leather
        if (Config.enableLeather) {

        }

        //blaze
        if (Config.enableBlaze) {

        }

        //porked
        if (Config.enablePorked) {

        }

        //ender 24
        if (Config.enableEnder && Config.enderBalance) {

        }

        //ender 8
        if (Config.enableEnder && !Config.enderBalance){

        }

        //burnt
        if (Config.enableBurnt) {

        }

        //crying 12
        if (Config.enableCrying && Config.cryingBalance) {

        }

        //crying 8
        if (Config.enableCrying && !Config.cryingBalance){

        }

        /*GameRegistry.addRecipe(new ItemStack(fleshGlassPane, 16), new Object[]{ "XXX", "XXX", Character.valueOf('X'), fleshGlass});
        GameRegistry.addRecipe(new ItemStack(boneGlassPane, 16), new Object[]{ "XXX", "XXX", Character.valueOf('X'), boneGlass});
        GameRegistry.addRecipe(new ItemStack(slimyGlassPane, 16), new Object[]{ "XXX", "XXX", Character.valueOf('X'), slimyGlass});
        GameRegistry.addRecipe(new ItemStack(enderGlassPane, 16), new Object[]{ "XXX", "XXX", Character.valueOf('X'), enderGlass});
        GameRegistry.addRecipe(new ItemStack(burntGlassPane, 16), new Object[]{ "XXX", "XXX", Character.valueOf('X'), burntGlass});
        GameRegistry.addRecipe(new ItemStack(icyGlassPane, 16), new Object[]{ "XXX", "XXX", Character.valueOf('X'), icyGlass});
        GameRegistry.addRecipe(new ItemStack(leatherGlassPane, 16), new Object[]{ "XXX", "XXX", Character.valueOf('X'), leatherGlass});
        GameRegistry.addRecipe(new ItemStack(snowyGlassPane, 16), new Object[]{ "XXX", "XXX", Character.valueOf('X'), snowyGlass});
        GameRegistry.addRecipe(new ItemStack(blazeGlassPane, 16), new Object[]{ "XXX", "XXX", Character.valueOf('X'), blazeGlass});*/
    }
}

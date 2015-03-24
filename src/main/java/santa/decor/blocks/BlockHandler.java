package santa.decor.blocks;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import santa.decor.Config;

/**
 * Created by elijahfoster-wysocki on 7/14/14.
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


    public static void registerBlocks(){
        /*
        if (Config.enablePumpkin){
            GameRegistry.registerBlock(pumpkin, BlockInfo.PUMPKIN_KEY);
        }
        */

        brick = GameRegistry.registerBlock(new Brick(), "brick");
        chiseled = GameRegistry.registerBlock(new Chiseled(), "chiseled");
        cobblestone = GameRegistry.registerBlock(new Cobblestone(), "cobblestone");
        log = GameRegistry.registerBlock(new Log(), "log");
        paver = GameRegistry.registerBlock(new Paver(), "paver");
        plank = GameRegistry.registerBlock(new Plank(), "plank");
        quartz = GameRegistry.registerBlock(new Quartz(), "quartz");
        quartzChiseled = GameRegistry.registerBlock(new QuartzChiseled(), "quartzChiseled");
        quartzPillar = GameRegistry.registerBlock(new QuartzPillar(), "quartzPillar");
        stone = GameRegistry.registerBlock(new Stone(), "stone");
        glass = GameRegistry.registerBlock(new Glass(), "glass");

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


    public static void useMove(){
        //bone
        if (Config.enableBone) {
            GameRegistry.addRecipe(new ItemStack(boneBrick, 4), new Object[]{"XX", "XX", Character.valueOf('X'), boneSmooth});
            GameRegistry.addRecipe(new ItemStack(boneCobble, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.cobblestone, Character.valueOf('Z'), Items.bone});
            GameRegistry.addRecipe(new ItemStack(boneChiseled, 4), new Object[]{"XX", "XX", Character.valueOf('X'), boneBrick});
            GameRegistry.addRecipe(new ItemStack(boneLog, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.log, Character.valueOf('Z'), Items.bone});
            GameRegistry.addShapelessRecipe(new ItemStack(bonePlank, 4), new Object[]{new ItemStack(boneLog)});
            GameRegistry.addRecipe(new ItemStack(boneSmooth, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.stone, Character.valueOf('Z'), Items.bone});
            GameRegistry.addShapelessRecipe(new ItemStack(bonePaver, 1), new Object[]{new ItemStack(boneBrick)});
            GameRegistry.addRecipe(new ItemStack(boneGlass, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.glass, Character.valueOf('Z'), Items.bone});
        }

        //flesh
        if (Config.enableFlesh) {
            GameRegistry.addRecipe(new ItemStack(fleshBrick, 4), new Object[]{"XX", "XX", Character.valueOf('X'), fleshSmooth});
            GameRegistry.addRecipe(new ItemStack(fleshCobble, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.cobblestone, Character.valueOf('Z'), Items.rotten_flesh});
            GameRegistry.addRecipe(new ItemStack(fleshChiseled, 4), new Object[]{"XX", "XX", Character.valueOf('X'), fleshBrick});
            GameRegistry.addRecipe(new ItemStack(fleshLog, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.log, Character.valueOf('Z'), Items.rotten_flesh});
            GameRegistry.addShapelessRecipe(new ItemStack(fleshPlank, 4), new Object[]{new ItemStack(fleshLog)});
            GameRegistry.addRecipe(new ItemStack(fleshSmooth, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.stone, Character.valueOf('Z'), Items.rotten_flesh});
            GameRegistry.addShapelessRecipe(new ItemStack(fleshPaver, 1), new Object[]{new ItemStack(fleshBrick)});
            GameRegistry.addRecipe(new ItemStack(fleshGlass, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.glass, Character.valueOf('Z'), Items.rotten_flesh});
        }

        //ice
        if (Config.enableIce) {
            GameRegistry.addRecipe(new ItemStack(icyBrick, 4), new Object[]{"XX", "XX", Character.valueOf('X'), icySmooth});
            GameRegistry.addRecipe(new ItemStack(icyCobble, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.cobblestone, Character.valueOf('Z'), Blocks.ice});
            GameRegistry.addRecipe(new ItemStack(icyChiseled, 4), new Object[]{"XX", "XX", Character.valueOf('X'), icyBrick});
            GameRegistry.addRecipe(new ItemStack(icyLog, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.log, Character.valueOf('Z'), Blocks.ice});
            GameRegistry.addShapelessRecipe(new ItemStack(icyPlank, 4), new Object[]{new ItemStack(icyLog)});
            GameRegistry.addRecipe(new ItemStack(icySmooth, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.stone, Character.valueOf('Z'), Blocks.ice});
            GameRegistry.addRecipe(new ItemStack(icyQuartz, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.quartz_block, Character.valueOf('Z'), Blocks.ice});
            GameRegistry.addRecipe(new ItemStack(icyQChiseled, 4), new Object[]{"XX", "XX", Character.valueOf('X'), icyQuartz});
            GameRegistry.addRecipe(new ItemStack(icyPillar, 2), new Object[]{"X", "X", Character.valueOf('X'), icyQuartz});
            GameRegistry.addShapelessRecipe(new ItemStack(icyPaver, 1), new Object[]{new ItemStack(icyBrick)});
            GameRegistry.addRecipe(new ItemStack(icyGlass, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.glass, Character.valueOf('Z'), Blocks.ice});
        }

        //snow
        if (Config.enableSnow) {
            GameRegistry.addRecipe(new ItemStack(snowyBrick, 4), new Object[]{"XX", "XX", Character.valueOf('X'), snowySmooth});
            GameRegistry.addRecipe(new ItemStack(snowyCobble, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.cobblestone, Character.valueOf('Z'), Items.snowball});
            GameRegistry.addRecipe(new ItemStack(snowyChiseled, 4), new Object[]{"XX", "XX", Character.valueOf('X'), snowyBrick});
            GameRegistry.addRecipe(new ItemStack(snowyLog, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.log, Character.valueOf('Z'), Items.snowball});
            GameRegistry.addShapelessRecipe(new ItemStack(snowyPlank, 4), new Object[]{new ItemStack(snowyLog)});
            GameRegistry.addRecipe(new ItemStack(snowySmooth, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.stone, Character.valueOf('Z'), Items.snowball});
            GameRegistry.addShapelessRecipe(new ItemStack(snowyPaver, 1), new Object[]{new ItemStack(snowyBrick)});
            GameRegistry.addRecipe(new ItemStack(snowyGlass, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.glass, Character.valueOf('Z'), Items.snowball});
        }

        //leather
        if (Config.enableLeather) {
            GameRegistry.addRecipe(new ItemStack(leatherBrick, 4), new Object[]{"XX", "XX", Character.valueOf('X'), leatherSmooth});
            GameRegistry.addRecipe(new ItemStack(leatherCobble, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.cobblestone, Character.valueOf('Z'), Items.leather});
            GameRegistry.addRecipe(new ItemStack(leatherChiseled, 4), new Object[]{"XX", "XX", Character.valueOf('X'), leatherBrick});
            GameRegistry.addRecipe(new ItemStack(leatherLog, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.log, Character.valueOf('Z'), Items.leather});
            GameRegistry.addShapelessRecipe(new ItemStack(leatherPlank, 4), new Object[]{new ItemStack(leatherLog)});
            GameRegistry.addRecipe(new ItemStack(leatherSmooth, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.stone, Character.valueOf('Z'), Items.leather});
            GameRegistry.addShapelessRecipe(new ItemStack(leatherPaver, 1), new Object[]{new ItemStack(leatherBrick)});
            GameRegistry.addRecipe(new ItemStack(leatherGlass, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.glass, Character.valueOf('Z'), Items.leather});
        }

        //blaze
        if (Config.enableBlaze) {
            GameRegistry.addRecipe(new ItemStack(blazeBrick, 4), new Object[]{"XX", "XX", Character.valueOf('X'), blazeSmooth});
            GameRegistry.addRecipe(new ItemStack(blazeCobble, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.cobblestone, Character.valueOf('Z'), Items.blaze_rod});
            GameRegistry.addRecipe(new ItemStack(blazeChiseled, 4), new Object[]{"XX", "XX", Character.valueOf('X'), blazeBrick});
            GameRegistry.addRecipe(new ItemStack(blazeLog, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.log, Character.valueOf('Z'), Items.blaze_rod});
            GameRegistry.addShapelessRecipe(new ItemStack(blazePlank, 4), new Object[]{new ItemStack(blazeLog)});
            GameRegistry.addRecipe(new ItemStack(blazeSmooth, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.stone, Character.valueOf('Z'), Items.blaze_rod});
            GameRegistry.addRecipe(new ItemStack(blazeQuartz, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.quartz_block, Character.valueOf('Z'), Items.blaze_rod});
            GameRegistry.addRecipe(new ItemStack(blazeQChiseled, 4), new Object[]{"XX", "XX", Character.valueOf('X'), blazeQuartz});
            GameRegistry.addRecipe(new ItemStack(blazePillar, 2), new Object[]{"X", "X", Character.valueOf('X'), blazeQuartz});
            GameRegistry.addShapelessRecipe(new ItemStack(blazePaver, 1), new Object[]{new ItemStack(blazeBrick)});
            GameRegistry.addRecipe(new ItemStack(blazeGlass, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.glass, Character.valueOf('Z'), Items.blaze_rod});
        }

        //porked
        if (Config.enablePorked) {
            GameRegistry.addRecipe(new ItemStack(porkedBrick, 4), new Object[]{"XX", "XX", Character.valueOf('X'), porkedSmooth});
            GameRegistry.addRecipe(new ItemStack(porkedCobble, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.cobblestone, Character.valueOf('Z'), Items.porkchop});
            GameRegistry.addRecipe(new ItemStack(porkedChiseled, 4), new Object[]{"XX", "XX", Character.valueOf('X'), porkedBrick});
            GameRegistry.addRecipe(new ItemStack(porkedLog, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.log, Character.valueOf('Z'), Items.porkchop});
            GameRegistry.addShapelessRecipe(new ItemStack(porkedPlank, 4), new Object[]{new ItemStack(porkedLog)});
            GameRegistry.addRecipe(new ItemStack(porkedSmooth, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.stone, Character.valueOf('Z'), Items.porkchop});
            GameRegistry.addRecipe(new ItemStack(porkedQuartz, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.quartz_block, Character.valueOf('Z'), Items.porkchop});
            GameRegistry.addRecipe(new ItemStack(porkedQChiseled, 4), new Object[]{"XX", "XX", Character.valueOf('X'), porkedQuartz});
            GameRegistry.addRecipe(new ItemStack(porkedPillar, 2), new Object[]{"X", "X", Character.valueOf('X'), porkedQuartz});
            GameRegistry.addShapelessRecipe(new ItemStack(porkedPaver, 1), new Object[]{new ItemStack(porkedBrick)});
            GameRegistry.addRecipe(new ItemStack(porkedGlass, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.glass, Character.valueOf('Z'), Items.porkchop});
        }

        //ender 24
        if (Config.enableEnder && Config.enderBalance) {
            GameRegistry.addRecipe(new ItemStack(enderBrick, 4), new Object[]{"XX", "XX", Character.valueOf('X'), enderSmooth});
            GameRegistry.addRecipe(new ItemStack(enderCobble, 24), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.cobblestone, Character.valueOf('Z'), Items.ender_pearl});
            GameRegistry.addRecipe(new ItemStack(enderChiseled, 4), new Object[]{"XX", "XX", Character.valueOf('X'), enderBrick});
            GameRegistry.addRecipe(new ItemStack(enderLog, 24), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.log, Character.valueOf('Z'), Items.ender_pearl});
            GameRegistry.addShapelessRecipe(new ItemStack(enderPlank, 4), new Object[]{new ItemStack(enderLog)});
            GameRegistry.addRecipe(new ItemStack(enderSmooth, 24), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.stone, Character.valueOf('Z'), Items.ender_pearl});
            GameRegistry.addRecipe(new ItemStack(enderQuartz, 24), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.quartz_block, Character.valueOf('Z'), Items.ender_pearl});
            GameRegistry.addRecipe(new ItemStack(enderQChiseled, 4), new Object[]{"XX", "XX", Character.valueOf('X'), enderQuartz});
            GameRegistry.addRecipe(new ItemStack(enderPillar, 2), new Object[]{"X", "X", Character.valueOf('X'), enderQuartz});
            GameRegistry.addShapelessRecipe(new ItemStack(enderPaver, 1), new Object[]{new ItemStack(enderBrick)});
            GameRegistry.addRecipe(new ItemStack(enderGlass, 24), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.glass, Character.valueOf('Z'), Items.ender_pearl});
        }

        //ender 8
        if (Config.enableEnder && !Config.enderBalance){
            GameRegistry.addRecipe(new ItemStack(enderBrick, 4), new Object[]{"XX", "XX", Character.valueOf('X'), enderSmooth});
            GameRegistry.addRecipe(new ItemStack(enderCobble, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.cobblestone, Character.valueOf('Z'), Items.ender_pearl});
            GameRegistry.addRecipe(new ItemStack(enderChiseled, 4), new Object[]{"XX", "XX", Character.valueOf('X'), enderBrick});
            GameRegistry.addRecipe(new ItemStack(enderLog, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.log, Character.valueOf('Z'), Items.ender_pearl});
            GameRegistry.addShapelessRecipe(new ItemStack(enderPlank, 4), new Object[]{new ItemStack(enderLog)});
            GameRegistry.addRecipe(new ItemStack(enderSmooth, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.stone, Character.valueOf('Z'), Items.ender_pearl});
            GameRegistry.addRecipe(new ItemStack(enderQuartz, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.quartz_block, Character.valueOf('Z'), Items.ender_pearl});
            GameRegistry.addRecipe(new ItemStack(enderQChiseled, 4), new Object[]{"XX", "XX", Character.valueOf('X'), enderQuartz});
            GameRegistry.addRecipe(new ItemStack(enderPillar, 2), new Object[]{"X", "X", Character.valueOf('X'), enderQuartz});
            GameRegistry.addShapelessRecipe(new ItemStack(enderPaver, 1), new Object[]{new ItemStack(enderBrick)});
            GameRegistry.addRecipe(new ItemStack(enderGlass, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.glass, Character.valueOf('Z'), Items.ender_pearl});
        }

        //burnt
        if (Config.enableBurnt) {
            GameRegistry.addRecipe(new ItemStack(burntSmooth, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.stone, Character.valueOf('Z'), Items.coal});
            GameRegistry.addRecipe(new ItemStack(burntQuartz, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.quartz_block, Character.valueOf('Z'), Items.coal});
            GameRegistry.addRecipe(new ItemStack(burntBrick, 4), new Object[]{"XX", "XX", Character.valueOf('X'), burntSmooth});
            GameRegistry.addRecipe(new ItemStack(burntChiseled, 4), new Object[]{"XX", "XX", Character.valueOf('X'), burntBrick});
            GameRegistry.addRecipe(new ItemStack(burntQChiseled, 4), new Object[]{"XX", "XX", Character.valueOf('X'), burntQuartz});
            GameRegistry.addRecipe(new ItemStack(burntPillar, 2), new Object[]{"X", "X", Character.valueOf('X'), burntQuartz});
            GameRegistry.addShapelessRecipe(new ItemStack(burntPlank, 4), new Object[]{new ItemStack(burntLog)});
            GameRegistry.addRecipe(new ItemStack(burntCobble, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.cobblestone, Character.valueOf('Z'), Items.coal});
            GameRegistry.addRecipe(new ItemStack(burntLog, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.log, Character.valueOf('Z'), Items.coal});
            GameRegistry.addShapelessRecipe(new ItemStack(burntPaver, 1), new Object[]{new ItemStack(burntBrick)});
            GameRegistry.addRecipe(new ItemStack(burntGlass, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.glass, Character.valueOf('Z'), Items.coal});
        }

        //crying 12
        if (Config.enableCrying && Config.cryingBalance) {
            GameRegistry.addRecipe(new ItemStack(cryingBrick, 4), new Object[]{"XX", "XX", Character.valueOf('X'), cryingSmooth});
            GameRegistry.addRecipe(new ItemStack(cryingCobble, 12), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.cobblestone, Character.valueOf('Z'), Items.ghast_tear});
            GameRegistry.addRecipe(new ItemStack(cryingChiseled, 4), new Object[]{"XX", "XX", Character.valueOf('X'), cryingBrick});
            GameRegistry.addRecipe(new ItemStack(cryingLog, 12), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.log, Character.valueOf('Z'), Items.ghast_tear});
            GameRegistry.addShapelessRecipe(new ItemStack(cryingPlank, 4), new Object[]{new ItemStack(cryingLog)});
            GameRegistry.addRecipe(new ItemStack(cryingSmooth, 12), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.stone, Character.valueOf('Z'), Items.ghast_tear});
            GameRegistry.addRecipe(new ItemStack(cryingQuartz, 12), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.quartz_block, Character.valueOf('Z'), Items.ghast_tear});
            GameRegistry.addRecipe(new ItemStack(cryingQChiseled, 4), new Object[]{"XX", "XX", Character.valueOf('X'), cryingQuartz});
            GameRegistry.addRecipe(new ItemStack(cryingPillar, 2), new Object[]{"X", "X", Character.valueOf('X'), cryingQuartz});
            GameRegistry.addShapelessRecipe(new ItemStack(cryingPaver, 1), new Object[]{new ItemStack(cryingBrick)});
            GameRegistry.addRecipe(new ItemStack(cryingGlass, 12), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.glass, Character.valueOf('Z'), Items.ghast_tear});
        }

        //crying 8
        if (Config.enableCrying && !Config.cryingBalance){
            GameRegistry.addRecipe(new ItemStack(cryingBrick, 4), new Object[]{"XX", "XX", Character.valueOf('X'), cryingSmooth});
            GameRegistry.addRecipe(new ItemStack(cryingCobble, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.cobblestone, Character.valueOf('Z'), Items.ghast_tear});
            GameRegistry.addRecipe(new ItemStack(cryingChiseled, 4), new Object[]{"XX", "XX", Character.valueOf('X'), cryingBrick});
            GameRegistry.addRecipe(new ItemStack(cryingLog, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.log, Character.valueOf('Z'), Items.ghast_tear});
            GameRegistry.addShapelessRecipe(new ItemStack(cryingPlank, 4), new Object[]{new ItemStack(cryingLog)});
            GameRegistry.addRecipe(new ItemStack(cryingSmooth, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.stone, Character.valueOf('Z'), Items.ghast_tear});
            GameRegistry.addRecipe(new ItemStack(cryingQuartz, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.quartz_block, Character.valueOf('Z'), Items.ghast_tear});
            GameRegistry.addRecipe(new ItemStack(cryingQChiseled, 4), new Object[]{"XX", "XX", Character.valueOf('X'), cryingQuartz});
            GameRegistry.addRecipe(new ItemStack(cryingPillar, 2), new Object[]{"X", "X", Character.valueOf('X'), cryingQuartz});
            GameRegistry.addShapelessRecipe(new ItemStack(cryingPaver, 1), new Object[]{new ItemStack(cryingBrick)});
            GameRegistry.addRecipe(new ItemStack(cryingGlass, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.glass, Character.valueOf('Z'), Items.ghast_tear});
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

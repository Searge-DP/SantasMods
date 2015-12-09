package santa.decor.blocks;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import net.minecraft.item.crafting.IRecipe;
import santa.decor.Config;
import santa.decor.blocks.items.*;

import java.util.ArrayList;

public class BlockHandler {
    public static final ArrayList<String> familiesMain = new ArrayList<String>();

    public static final ArrayList<String> familiesQuartz = new ArrayList<String>();

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

    /*
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

    /**
     * Initializes block families based on the configuration options.
     */
    public static void initializeFamilies() {
        if (Config.enableBlaze) {
            familiesMain.add("blaze");
            familiesQuartz.add("blaze");
        }

        if (Config.enableBone) {
            familiesMain.add("bone");
        }

        if (Config.enableBurnt) {
            familiesMain.add("burnt");
            familiesQuartz.add("burnt");
        }

        if (Config.enableCrying) {
            familiesMain.add("crying");
            familiesQuartz.add("crying");
        }

        if (Config.enableEnder) {
            familiesMain.add("ender");
            familiesQuartz.add("ender");
        }

        if (Config.enableFlesh) {
            familiesMain.add("flesh");
        }

        if (Config.enableIce) {
            familiesMain.add("ice");
            familiesQuartz.add("ice");
        }

        if (Config.enableLeather) {
            familiesMain.add("leather");
        }

        if (Config.enablePorked) {
            familiesMain.add("porked");
            familiesQuartz.add("porked");
        }

        if (Config.enableSlime) {
            familiesMain.add("slime");
            familiesQuartz.add("slime");
        }

        if (Config.enableSnow) {
            familiesMain.add("snow");
        }
    }

    /**
     * Registers and initializes all blocks.
     */
    public static void registerBlocks() {
        /*
        if (Config.enablePumpkin){
            GameRegistry.registerBlock(pumpkin, BlockInfo.PUMPKIN_KEY);
        }
        */

        brick = new Brick();
        GameRegistry.registerBlock(brick, ItemBlockBrick.class, "brick");

        chiseled = new Chiseled();
        GameRegistry.registerBlock(chiseled, ItemBlockChiseled.class, "chiseled");

        cobblestone = new Cobblestone();
        GameRegistry.registerBlock(cobblestone, ItemBlockCobblestone.class, "cobblestone");

        log = new Log();
        GameRegistry.registerBlock(log, ItemBlockLog.class, "log");

        paver = new Paver();
        GameRegistry.registerBlock(paver, ItemBlockPaver.class, "paver");

        plank = new Plank();
        GameRegistry.registerBlock(plank, ItemBlockPlank.class, "plank");

        quartz = new Quartz();
        GameRegistry.registerBlock(quartz, ItemBlockQuartz.class, "quartz");

        quartzChiseled = new QuartzChiseled();
        GameRegistry.registerBlock(quartzChiseled, ItemBlockQuartzChiseled.class, "qchiseled");

        quartzPillar = new QuartzPillar();
        GameRegistry.registerBlock(quartzPillar, ItemBlockQuartzPillar.class, "pillar");

        stone = new Stone();
        GameRegistry.registerBlock(stone, ItemBlockStone.class, "stone");

        glass = new Glass();
        GameRegistry.registerBlock(glass, ItemBlockGlass.class, "glass");

        /*
        GameRegistry.registerBlock(boneGlassPane, BlockInfo.BONEGLASSPANE_KEY);
        GameRegistry.registerBlock(fleshGlassPane, BlockInfo.FLESHGLASSPANE_KEY);
        GameRegistry.registerBlock(slimyGlassPane, BlockInfo.SLIMEGLASSPANE_KEY);
        GameRegistry.registerBlock(enderGlassPane, BlockInfo.ENDERGLASSPANE_KEY);
        GameRegistry.registerBlock(burntGlassPane, BlockInfo.BURNTGLASSPANE_KEY);
        GameRegistry.registerBlock(icyGlassPane, BlockInfo.ICEGLASSPANE_KEY);
        GameRegistry.registerBlock(leatherGlassPane, BlockInfo.LEATHERGLASSPANE_KEY);
        GameRegistry.registerBlock(snowyGlassPane, BlockInfo.SNOWGLASSPANE_KEY);
        GameRegistry.registerBlock(blazeGlassPane, BlockInfo.BLAZEGLASSPANE_KEY);
        */
    }

    private static void doMainRecipes(int metadata, ItemStack resource, String familiaName) {
        doMainRecipes(metadata, resource, familiaName, 8);
    }

    private static void doMainRecipes(int metadata, ItemStack resource, String familiaName, int balancedOutput) {
        if (familiesMain.contains(familiaName)) {
            GameRegistry.addRecipe(new ItemStack(brick, 4, metadata), new Object[]{
              "XX", "XX", 'X', new ItemStack(stone, 1, metadata).getItem()
            });

            GameRegistry.addRecipe(new ItemStack(cobblestone, balancedOutput, metadata), new Object[]{
              "XXX", "XZX", "XXX", 'X', Blocks.cobblestone, 'Z', resource
            });

            GameRegistry.addRecipe(new ItemStack(chiseled, 4, metadata), new Object[]{
              "XX", "XX", 'X', new ItemStack(brick, 1, metadata).getItem()
            });

            GameRegistry.addRecipe(new ItemStack(log, balancedOutput, metadata), new Object[]{
              "XXX", "XZX", "XXX", 'X', Blocks.log, 'Z', resource
            });

            GameRegistry.addShapelessRecipe(new ItemStack(plank, 4, metadata), new Object[]{
              new ItemStack(log, 1, metadata)
            });

            GameRegistry.addRecipe(new ItemStack(stone, balancedOutput, metadata), new Object[]{
              "XXX", "XZX", "XXX", 'X', Blocks.stone, 'Z', resource
            });

            GameRegistry.addShapelessRecipe(new ItemStack(paver, 1, metadata), new Object[]{
              new ItemStack(brick, 1, metadata)
            });

            GameRegistry.addRecipe(new ItemStack(glass, 1, metadata), new Object[]{
              "XXX", "XZX", "XXX", 'X', Blocks.glass, 'Z', resource
            });
        }
    }

    private static void doQuartzRecipes(int metadata, ItemStack resource, String familiaName) {
        doQuartzRecipes(metadata, resource, familiaName, 8);
    }

    private static void doQuartzRecipes(int metadata, ItemStack resource, String familiaName, int balancedOutput) {
        if (familiesQuartz.contains(familiaName)) {
            GameRegistry.addRecipe(new ItemStack(quartz, balancedOutput, metadata), new Object[]{
              "XXX", "XZX", "XXX", 'X', Blocks.quartz_block, 'Z', resource
            });

            GameRegistry.addRecipe(new ItemStack(quartzChiseled, 4, metadata), new Object[]{
              "XX", "XX", 'X', new ItemStack(quartz, 1, metadata)
            });

            GameRegistry.addRecipe(new ItemStack(quartzPillar, 2, metadata), new Object[]{
              "X", "X", 'X', new ItemStack(quartz, 1, metadata)
            });
        }
    }

    /**
     * Registers and initializes all block and item recipes.
     */
    public static void registerRecipes() {
        if (Config.enableBone) {
            doMainRecipes(familiesMain.indexOf("bone"), new ItemStack(Items.bone), "bone");
        }

        if (Config.enableFlesh) {
            doMainRecipes(familiesMain.indexOf("flesh"), new ItemStack(Items.rotten_flesh),
              "flesh");
        }

        if (Config.enableIce) {
            doMainRecipes(familiesMain.indexOf("ice"), new ItemStack(Blocks.ice), "ice");
            doQuartzRecipes(familiesQuartz.indexOf("ice"), new ItemStack(Blocks.ice), "ice");
        }

        if (Config.enableSnow) {
            doMainRecipes(familiesMain.indexOf("snow"), new ItemStack(Items.snowball), "snow");
        }

        if (Config.enableLeather) {
            doMainRecipes(familiesMain.indexOf("leather"), new ItemStack(Items.leather), "leather");
        }

        if (Config.enableBlaze) {
            doMainRecipes(familiesMain.indexOf("blaze"), new ItemStack(Items.blaze_rod), "blaze");
            doQuartzRecipes(familiesQuartz.indexOf("blaze"), new ItemStack(Items.blaze_rod),
              "blaze");
        }

        if (Config.enablePorked) {
            doMainRecipes(familiesMain.indexOf("porked"), new ItemStack(Items.porkchop), "porked");
            doQuartzRecipes(familiesQuartz.indexOf("porked"), new ItemStack(Items.porkchop),
              "porked");
        }

        if (Config.enableEnder) {
            int output;
            if (Config.enderBalance) {
                output = 24;
            } else {
                output = 8;
            }
            doMainRecipes(familiesMain.indexOf("ender"), new ItemStack(Items.ender_pearl),
              "ender", output);
            doQuartzRecipes(familiesQuartz.indexOf("ender"), new ItemStack(Items.ender_pearl),
              "ender", output);
        }

        if (Config.enableBurnt) {
            doMainRecipes(familiesMain.indexOf("burnt"), new ItemStack(Items.coal), "burnt");
            doQuartzRecipes(familiesQuartz.indexOf("burnt"), new ItemStack(Items.coal), "burnt");
        }

        //crying 12
        if (Config.enableCrying) {
            int output;
            if (Config.cryingBalance) {
                output = 12;
            } else {
                output = 8;
            }
            doMainRecipes(familiesMain.indexOf("crying"), new ItemStack(Items.ghast_tear),
              "crying", output);
            doQuartzRecipes(familiesQuartz.indexOf("crying"), new ItemStack(Items.ghast_tear),
              "crying", output);
        }

        if (Config.enableSlime) {
            doMainRecipes(familiesMain.indexOf("slime"), new ItemStack(Items.slime_ball), "slime");
            doQuartzRecipes(familiesQuartz.indexOf("slime"), new ItemStack(Items.slime_ball),
              "slime");
        }

        /*
        GameRegistry.addRecipe(new ItemStack(fleshGlassPane, 16), new Object[]{ "XXX", "XXX", Character.valueOf('X'), fleshGlass});
        GameRegistry.addRecipe(new ItemStack(boneGlassPane, 16), new Object[]{ "XXX", "XXX", Character.valueOf('X'), boneGlass});
        GameRegistry.addRecipe(new ItemStack(slimyGlassPane, 16), new Object[]{ "XXX", "XXX", Character.valueOf('X'), slimyGlass});
        GameRegistry.addRecipe(new ItemStack(enderGlassPane, 16), new Object[]{ "XXX", "XXX", Character.valueOf('X'), enderGlass});
        GameRegistry.addRecipe(new ItemStack(burntGlassPane, 16), new Object[]{ "XXX", "XXX", Character.valueOf('X'), burntGlass});
        GameRegistry.addRecipe(new ItemStack(icyGlassPane, 16), new Object[]{ "XXX", "XXX", Character.valueOf('X'), icyGlass});
        GameRegistry.addRecipe(new ItemStack(leatherGlassPane, 16), new Object[]{ "XXX", "XXX", Character.valueOf('X'), leatherGlass});
        GameRegistry.addRecipe(new ItemStack(snowyGlassPane, 16), new Object[]{ "XXX", "XXX", Character.valueOf('X'), snowyGlass});
        GameRegistry.addRecipe(new ItemStack(blazeGlassPane, 16), new Object[]{ "XXX", "XXX", Character.valueOf('X'), blazeGlass});
        */
    }
}

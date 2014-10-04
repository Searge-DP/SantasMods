package santa.decor.blocks;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import santa.decor.blocks.blaze.*;
import santa.decor.blocks.bone.*;
import santa.decor.blocks.burnt.*;
import santa.decor.blocks.ender.*;
import santa.decor.blocks.flesh.*;
import santa.decor.blocks.ice.*;
import santa.decor.blocks.leather.*;
import santa.decor.blocks.slime.*;
import santa.decor.blocks.snow.*;
import santa.decor.blocks.glass.glass.*;
//import santa.decor.blocks.glass.panes.*;

/**
 * Created by elijahfoster-wysocki on 7/14/14.
 */
public class BlockHandler {

    public static Block boneBrick;
    public static Block boneChiseled;
    public static Block boneCobble;
    public static Block boneSmooth;
    public static Block boneLog;
    public static Block bonePlank;
    public static Block bonePaver;

    public static Block fleshBrick;
    public static Block fleshChiseled;
    public static Block fleshCobble;
    public static Block fleshSmooth;
    public static Block fleshLog;
    public static Block fleshPlank;
    public static Block fleshPaver;

    public static Block icyBrick;
    public static Block icyChiseled;
    public static Block icyCobble;
    public static Block icySmooth;
    public static Block icyLog;
    public static Block icyPlank;
    public static Block icyQuartz;
    public static Block icyQChiseled;
    public static Block icyPillar;
    public static Block icyPaver;

    public static Block blazeBrick;
    public static Block blazeChiseled;
    public static Block blazeCobble;
    public static Block blazeSmooth;
    public static Block blazeQuartz;
    public static Block blazeQChiseled;
    public static Block blazePillar;
    public static Block blazeLog;
    public static Block blazePlank;
    public static Block blazePaver;

    public static Block leatherBrick;
    public static Block leatherChiseled;
    public static Block leatherCobble;
    public static Block leatherSmooth;
    public static Block leatherLog;
    public static Block leatherPlank;
    public static Block leatherPaver;

    public static Block snowyBrick;
    public static Block snowyChiseled;
    public static Block snowyCobble;
    public static Block snowySmooth;
    public static Block snowyLog;
    public static Block snowyPlank;
    public static Block snowyPaver;

    public static Block slimyBrick;
    public static Block slimyChiseled;
    public static Block slimyCobble;
    public static Block slimySmooth;
    public static Block slimyQuartz;
    public static Block slimyQChiseled;
    public static Block slimyPillar;
    public static Block slimyLog;
    public static Block slimyPlank;
    public static Block slimyPaver;

    public static Block enderBrick;
    public static Block enderChiseled;
    public static Block enderCobble;
    public static Block enderSmooth;
    public static Block enderQuartz;
    public static Block enderQChiseled;
    public static Block enderPillar;
    public static Block enderLog;
    public static Block enderPlank;
    public static Block enderPaver;

    public static Block burntSmooth;
    public static Block burntCobble;
    public static Block burntBrick;
    public static Block burntChiseled;
    public static Block burntQuartz;
    public static Block burntQChiseled;
    public static Block burntPillar;
    public static Block burntLog;
    public static Block burntPlank;
    public static Block burntPaver;

    public static Block darkGlass;
    public static Block blazeGlass;
    public static Block boneGlass;
    public static Block fleshGlass;
    public static Block slimyGlass;
    public static Block enderGlass;
    public static Block burntGlass;
    public static Block icyGlass;
    public static Block leatherGlass;
    public static Block snowyGlass;

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

    public static void meet(){
        boneBrick = new BoneBrick();
        boneChiseled = new ChiseledBoneBrick();
        boneCobble = new BoneCobblestone();
        boneSmooth = new BoneStone();
        boneLog = new BoneLog();
        bonePlank = new BonePlank();
        bonePaver = new BonePaver();

        fleshBrick = new FleshBrick();
        fleshChiseled = new ChiseledFleshBrick();
        fleshCobble = new FleshCobblestone();
        fleshSmooth = new FleshStone();
        fleshLog = new FleshLog();
        fleshPlank = new FleshPlank();
        fleshPaver = new FleshPaver();

        icyBrick = new IcyBrick();
        icyChiseled = new ChiseledIcyBrick();
        icyCobble = new IcyCobblestone();
        icySmooth = new IcyStone();
        icyLog = new IcyLog();
        icyPlank = new IcyPlank();
        icyQuartz = new IcyQuartz();
        icyQChiseled = new IcyChiseledQuartz();
        icyPillar = new IcyPillar();
        icyPaver = new IcyPaver();

        blazeBrick = new BlazeBrick();
        blazeChiseled = new ChiseledBlazeBrick();
        blazeCobble = new BlazeCobblestone();
        blazeSmooth = new BlazeStone();
        blazeQuartz = new BlazeQuartz();
        blazeQChiseled = new BlazeChiseledQuartz();
        blazeLog = new BlazeLog();
        blazePlank = new BlazePlank();
        blazePillar = new BlazePillar();
        blazePaver = new BlazePaver();

        leatherBrick = new LeatherBrick();
        leatherChiseled = new ChiseledLeatherBrick();
        leatherCobble = new LeatherCobblestone();
        leatherSmooth = new LeatherStone();
        leatherLog = new LeatherLog();
        leatherPlank = new LeatherPlank();
        leatherPaver = new LeatherPaver();

        snowyBrick = new SnowyBrick();
        snowyChiseled = new ChiseledSnowyBrick();
        snowyCobble = new SnowyCobblestone();
        snowySmooth = new SnowyStone();
        snowyLog = new SnowyLog();
        snowyPlank = new SnowyPlank();
        snowyPaver = new SnowyPaver();

        slimyBrick = new SlimyBrick();
        slimyChiseled = new ChiseledSlimyBrick();
        slimyCobble = new SlimyCobblestone();
        slimySmooth = new SlimyStone();
        slimyLog = new SlimyLog();
        slimyPlank = new SlimyPlank();
        slimyQuartz = new SlimyQuartz();
        slimyQChiseled = new SlimyChiseledQuartz();
        slimyPillar = new SlimyPillar();
        slimyPaver = new SlimyPaver();

        enderBrick = new EnderBrick();
        enderChiseled = new ChiseledEnderBrick();
        enderCobble = new EnderCobblestone();
        enderSmooth = new EnderStone();
        enderQuartz = new EnderQuartz();
        enderQChiseled = new EnderChiseledQuartz();
        enderLog = new EnderLog();
        enderPlank = new EnderPlank();
        enderPillar = new EnderPillar();
        enderPaver = new EnderPaver();

        burntSmooth = new BurntStone();
        burntCobble = new BurntCobble();
        burntBrick = new BurntBrick();
        burntChiseled = new BurntChiseled();
        burntQuartz = new BurntQuartz();
        burntQChiseled = new BurntChiseledQuartz();
        burntPillar = new BurntPillar();
        burntLog = new BurntLog();
        burntPlank = new BurntPlank();
        burntPaver = new BurntPaver();

        blazeGlass = new BlazeGlass();
        boneGlass = new BoneGlass();
        fleshGlass = new FleshGlass();
        slimyGlass = new SlimyGlass();
        enderGlass = new EnderGlass();
        burntGlass = new BurntGlass();
        icyGlass = new IcyGlass();
        leatherGlass = new LeatherGlass();
        snowyGlass = new SnowyGlass();

        /*blazeGlassPane = new BlazeGlassPane();
        boneGlassPane = new BoneGlassPane();
        fleshGlassPane = new FleshGlassPane();
        slimyGlassPane = new SlimyGlassPane();
        enderGlassPane = new EnderGlassPane();
        icyGlassPane = new IcyGlassPane();
        leatherGlassPane = new LeatherGlassPane();
        snowyGlassPane = new SnowyGlassPane();*/
    }

    public static void date(){
        GameRegistry.registerBlock(boneBrick, BlockInfo.BONEBRICK_KEY);
        GameRegistry.registerBlock(boneChiseled, BlockInfo.BONECHISELED_KEY);
        GameRegistry.registerBlock(boneCobble, BlockInfo.BONECOBBLE_KEY);
        GameRegistry.registerBlock(boneSmooth, BlockInfo.BONESTONE_KEY);
        GameRegistry.registerBlock(boneLog, BlockInfo.BONELOG_KEY);
        GameRegistry.registerBlock(bonePlank, BlockInfo.BONEPLANK_KEY);
        GameRegistry.registerBlock(bonePaver, BlockInfo.BONEPAVER_KEY);

        GameRegistry.registerBlock(fleshBrick, BlockInfo.FLESHBRICK_KEY);
        GameRegistry.registerBlock(fleshChiseled, BlockInfo.FLESHCHISELED_KEY);
        GameRegistry.registerBlock(fleshCobble, BlockInfo.FLESHCOBBLE_KEY);
        GameRegistry.registerBlock(fleshSmooth, BlockInfo.FLESHSTONE_KEY);
        GameRegistry.registerBlock(fleshLog, BlockInfo.FLESHLOG_KEY);
        GameRegistry.registerBlock(fleshPlank, BlockInfo.FLESHPLANK_KEY);
        GameRegistry.registerBlock(fleshPaver, BlockInfo.FLESHPAVER_KEY);

        GameRegistry.registerBlock(icyBrick, BlockInfo.ICEBRICK_KEY);
        GameRegistry.registerBlock(icyChiseled, BlockInfo.ICECHISELED_KEY);
        GameRegistry.registerBlock(icyCobble, BlockInfo.ICECOBBLE_KEY);
        GameRegistry.registerBlock(icySmooth, BlockInfo.ICESTONE_KEY);
        GameRegistry.registerBlock(icyLog, BlockInfo.ICELOG_KEY);
        GameRegistry.registerBlock(icyPlank, BlockInfo.ICEPLANK_KEY);
        GameRegistry.registerBlock(icyQuartz, BlockInfo.ICEQUARTZ_KEY);
        GameRegistry.registerBlock(icyQChiseled, BlockInfo.ICECHISELEDQ_KEY);
        GameRegistry.registerBlock(icyPillar, BlockInfo.ICEPILLAR_KEY);
        GameRegistry.registerBlock(icyPaver, BlockInfo.ICEPAVER_KEY);

        GameRegistry.registerBlock(blazeBrick, BlockInfo.BLAZEBRICK_KEY);
        GameRegistry.registerBlock(blazeChiseled, BlockInfo.BLAZECHISELED_KEY);
        GameRegistry.registerBlock(blazeCobble, BlockInfo.BLAZECOBBLE_KEY);
        GameRegistry.registerBlock(blazeSmooth, BlockInfo.BLAZESTONE_KEY);
        GameRegistry.registerBlock(blazeQuartz, BlockInfo.BLAZEQUARTZ_KEY);
        GameRegistry.registerBlock(blazeQChiseled, BlockInfo.BLAZECHISELEDQ_KEY);
        GameRegistry.registerBlock(blazeLog, BlockInfo.BLAZELOG_KEY);
        GameRegistry.registerBlock(blazePlank, BlockInfo.BLAZEPLANK_KEY);
        GameRegistry.registerBlock(blazePillar, BlockInfo.BLAZEPILLAR_KEY);
        GameRegistry.registerBlock(blazePaver, BlockInfo.BLAZEPAVER_KEY);

        GameRegistry.registerBlock(leatherBrick, BlockInfo.LEATHERBRICK_KEY);
        GameRegistry.registerBlock(leatherChiseled, BlockInfo.LEATHERCHISELED_KEY);
        GameRegistry.registerBlock(leatherCobble, BlockInfo.LEATHERCOBBLE_KEY);
        GameRegistry.registerBlock(leatherSmooth, BlockInfo.LEATHERSTONE_KEY);
        GameRegistry.registerBlock(leatherLog, BlockInfo.LEATHERLOG_KEY);
        GameRegistry.registerBlock(leatherPlank, BlockInfo.LEATHERPLANK_KEY);
        GameRegistry.registerBlock(leatherPaver, BlockInfo.LEATHERPAVER_KEY);

        GameRegistry.registerBlock(snowyBrick, BlockInfo.SNOWBRICK_KEY);
        GameRegistry.registerBlock(snowyChiseled, BlockInfo.SNOWCHISELED_KEY);
        GameRegistry.registerBlock(snowyCobble, BlockInfo.SNOWCOBBLE_KEY);
        GameRegistry.registerBlock(snowySmooth, BlockInfo.SNOWSTONE_KEY);
        GameRegistry.registerBlock(snowyLog, BlockInfo.SNOWLOG_KEY);
        GameRegistry.registerBlock(snowyPlank, BlockInfo.SNOWPLANK_KEY);
        GameRegistry.registerBlock(snowyPaver, BlockInfo.SNOWPAVER_KEY);

        GameRegistry.registerBlock(slimyBrick, BlockInfo.SLIMEBRICK_KEY);
        GameRegistry.registerBlock(slimyChiseled, BlockInfo.SLIMECHISELED_KEY);
        GameRegistry.registerBlock(slimyCobble, BlockInfo.SLIMECOBBLE_KEY);
        GameRegistry.registerBlock(slimySmooth, BlockInfo.SLIMESTONE_KEY);
        GameRegistry.registerBlock(slimyQuartz, BlockInfo.SLIMEQUARTZ_KEY);
        GameRegistry.registerBlock(slimyQChiseled, BlockInfo.SLIMECHISELEDQ_KEY);
        GameRegistry.registerBlock(slimyLog, BlockInfo.SLIMELOG_KEY);
        GameRegistry.registerBlock(slimyPlank, BlockInfo.SLIMEPLANK_KEY);
        GameRegistry.registerBlock(slimyPillar, BlockInfo.SLIMEPILLAR_KEY);
        GameRegistry.registerBlock(slimyPaver, BlockInfo.SLIMEPAVER_KEY);

        GameRegistry.registerBlock(enderBrick, BlockInfo.ENDERBRICK_KEY);
        GameRegistry.registerBlock(enderChiseled, BlockInfo.ENDERCHISELED_KEY);
        GameRegistry.registerBlock(enderCobble, BlockInfo.ENDERCOBBLE_KEY);
        GameRegistry.registerBlock(enderSmooth, BlockInfo.ENDERSTONE_KEY);
        GameRegistry.registerBlock(enderQuartz, BlockInfo.ENDERQUARTZ_KEY);
        GameRegistry.registerBlock(enderQChiseled, BlockInfo.ENDERCHISELEDQ_KEY);
        GameRegistry.registerBlock(enderLog, BlockInfo.ENDERLOG_KEY);
        GameRegistry.registerBlock(enderPlank, BlockInfo.ENDERPLANK_KEY);
        GameRegistry.registerBlock(enderPillar, BlockInfo.ENDERPILLAR_KEY);
        GameRegistry.registerBlock(enderPaver, BlockInfo.ENDERPAVER_KEY);

        GameRegistry.registerBlock(burntSmooth, BlockInfo.BURNTSTONE_KEY);
        GameRegistry.registerBlock(burntCobble, BlockInfo.BURNTCOBBLE_KEY);
        GameRegistry.registerBlock(burntBrick, BlockInfo.BURNTBRICK_KEY);
        GameRegistry.registerBlock(burntChiseled, BlockInfo.BURNTCHISELED_KEY);
        GameRegistry.registerBlock(burntQuartz, BlockInfo.BURNTQUARTZ_KEY);
        GameRegistry.registerBlock(burntQChiseled, BlockInfo.BURNTCHISELEDQ_KEY);
        GameRegistry.registerBlock(burntPillar, BlockInfo.BURNTPILLAR_KEY);
        GameRegistry.registerBlock(burntLog, BlockInfo.BURNTLOG_KEY);
        GameRegistry.registerBlock(burntPlank, BlockInfo.BURNTPLANK_KEY);
        GameRegistry.registerBlock(burntPaver, BlockInfo.BURNTPAVER_KEY);

        GameRegistry.registerBlock(blazeGlass, BlockInfo.BLAZEGLASS_KEY);
        GameRegistry.registerBlock(boneGlass, BlockInfo.BONEGLASS_KEY);
        GameRegistry.registerBlock(fleshGlass, BlockInfo.FLESHGLASS_KEY);
        GameRegistry.registerBlock(slimyGlass, BlockInfo.SLIMEGLASS_KEY);
        GameRegistry.registerBlock(enderGlass, BlockInfo.ENDERGLASS_KEY);
        GameRegistry.registerBlock(burntGlass, BlockInfo.BURNTGLASS_KEY);
        GameRegistry.registerBlock(icyGlass, BlockInfo.ICEGLASS_KEY);
        GameRegistry.registerBlock(leatherGlass, BlockInfo.LEATHERGLASS_KEY);
        GameRegistry.registerBlock(snowyGlass, BlockInfo.SNOWGLASS_KEY);

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
        GameRegistry.addRecipe(new ItemStack(boneBrick, 4), new Object[] {"XX", "XX", Character.valueOf('X'), boneSmooth });

        GameRegistry.addRecipe(new ItemStack(boneCobble, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.cobblestone, Character.valueOf('Z'), Items.bone });

        GameRegistry.addRecipe(new ItemStack(boneChiseled, 4), new Object[] { "XX", "XX", Character.valueOf('X'), boneBrick });

        GameRegistry.addRecipe(new ItemStack(boneLog, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.log, Character.valueOf('Z'), Items.bone });

        GameRegistry.addShapelessRecipe(new ItemStack(bonePlank, 4), new Object[] { new ItemStack(boneLog) });

        GameRegistry.addRecipe(new ItemStack(boneSmooth, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.stone, Character.valueOf('Z'), Items.bone });

        GameRegistry.addRecipe(new ItemStack(fleshBrick, 4), new Object[] { "XX", "XX", Character.valueOf('X'), fleshSmooth });

        GameRegistry.addRecipe(new ItemStack(fleshCobble, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.cobblestone, Character.valueOf('Z'), Items.rotten_flesh });

        GameRegistry.addRecipe(new ItemStack(fleshChiseled, 4), new Object[] { "XX", "XX", Character.valueOf('X'), fleshBrick });

        GameRegistry.addRecipe(new ItemStack(fleshLog, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.log, Character.valueOf('Z'), Items.rotten_flesh });

        GameRegistry.addShapelessRecipe(new ItemStack(fleshPlank, 4), new Object[] { new ItemStack(fleshLog) });

        GameRegistry.addRecipe(new ItemStack(fleshSmooth, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.stone, Character.valueOf('Z'), Items.rotten_flesh });

        GameRegistry.addRecipe(new ItemStack(icyBrick, 4), new Object[] { "XX", "XX", Character.valueOf('X'), icySmooth });

        GameRegistry.addRecipe(new ItemStack(icyCobble, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.cobblestone, Character.valueOf('Z'), Blocks.ice });

        GameRegistry.addRecipe(new ItemStack(icyChiseled, 4), new Object[] { "XX", "XX", Character.valueOf('X'), icyBrick });

        GameRegistry.addRecipe(new ItemStack(icyLog, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.log, Character.valueOf('Z'), Blocks.ice });

        GameRegistry.addShapelessRecipe(new ItemStack(icyPlank, 4), new Object[] { new ItemStack(icyLog) });

        GameRegistry.addRecipe(new ItemStack(icySmooth, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.stone, Character.valueOf('Z'), Blocks.ice });

        GameRegistry.addRecipe(new ItemStack(icyQuartz, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.quartz_block, Character.valueOf('Z'), Blocks.ice });

        GameRegistry.addRecipe(new ItemStack(icyQChiseled, 4), new Object[] { "XX", "XX", Character.valueOf('X'), icyQuartz });

        GameRegistry.addRecipe(new ItemStack(icyPillar, 2), new Object[] { "X", "X", Character.valueOf('X'), icyQuartz });

        GameRegistry.addRecipe(new ItemStack(snowyBrick, 4), new Object[] { "XX", "XX", Character.valueOf('X'), snowySmooth });

        GameRegistry.addRecipe(new ItemStack(snowyCobble, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.cobblestone, Character.valueOf('Z'), Items.snowball });

        GameRegistry.addRecipe(new ItemStack(snowyChiseled, 4), new Object[] { "XX", "XX", Character.valueOf('X'), snowyBrick });

        GameRegistry.addRecipe(new ItemStack(snowyLog, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.log, Character.valueOf('Z'), Items.snowball });

        GameRegistry.addShapelessRecipe(new ItemStack(snowyPlank, 4), new Object[] { new ItemStack(snowyLog) });

        GameRegistry.addRecipe(new ItemStack(snowySmooth, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.stone, Character.valueOf('Z'), Items.snowball });

        GameRegistry.addRecipe(new ItemStack(leatherBrick, 4), new Object[] { "XX", "XX", Character.valueOf('X'), leatherSmooth });

        GameRegistry.addRecipe(new ItemStack(leatherCobble, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.cobblestone, Character.valueOf('Z'), Items.leather });

        GameRegistry.addRecipe(new ItemStack(leatherChiseled, 4), new Object[] { "XX", "XX", Character.valueOf('X'), leatherBrick });

        GameRegistry.addRecipe(new ItemStack(leatherLog, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.log, Character.valueOf('Z'), Items.leather });

        GameRegistry.addShapelessRecipe(new ItemStack(leatherPlank, 4), new Object[] { new ItemStack(leatherLog) });

        GameRegistry.addRecipe(new ItemStack(leatherSmooth, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.stone, Character.valueOf('Z'), Items.leather });

        GameRegistry.addRecipe(new ItemStack(blazeBrick, 4), new Object[] { "XX", "XX", Character.valueOf('X'), blazeSmooth });

        GameRegistry.addRecipe(new ItemStack(blazeCobble, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.cobblestone, Character.valueOf('Z'), Items.blaze_rod });

        GameRegistry.addRecipe(new ItemStack(blazeChiseled, 4), new Object[] { "XX", "XX", Character.valueOf('X'), blazeBrick });

        GameRegistry.addRecipe(new ItemStack(blazeLog, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.log, Character.valueOf('Z'), Items.blaze_rod });

        GameRegistry.addShapelessRecipe(new ItemStack(blazePlank, 4), new Object[] { new ItemStack(blazeLog) });

        GameRegistry.addRecipe(new ItemStack(blazeSmooth, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.stone, Character.valueOf('Z'), Items.blaze_rod });

        GameRegistry.addRecipe(new ItemStack(blazeQuartz, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.quartz_block, Character.valueOf('Z'), Items.blaze_rod });

        GameRegistry.addRecipe(new ItemStack(blazeQChiseled, 4), new Object[] { "XX", "XX", Character.valueOf('X'), blazeQuartz });

        GameRegistry.addRecipe(new ItemStack(blazePillar, 2), new Object[] { "X", "X", Character.valueOf('X'), blazeQuartz });

        GameRegistry.addRecipe(new ItemStack(slimyBrick, 4), new Object[] { "XX", "XX", Character.valueOf('X'), slimySmooth });

        GameRegistry.addRecipe(new ItemStack(slimyCobble, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.cobblestone, Character.valueOf('Z'), Items.slime_ball });

        GameRegistry.addRecipe(new ItemStack(slimyChiseled, 4), new Object[] { "XX", "XX", Character.valueOf('X'), slimyBrick });

        GameRegistry.addRecipe(new ItemStack(slimyLog, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.log, Character.valueOf('Z'), Items.slime_ball });

        GameRegistry.addShapelessRecipe(new ItemStack(slimyPlank, 4), new Object[] { new ItemStack(slimyLog) });

        GameRegistry.addRecipe(new ItemStack(slimySmooth, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.stone, Character.valueOf('Z'), Items.slime_ball });

        GameRegistry.addRecipe(new ItemStack(slimyQuartz, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.quartz_block, Character.valueOf('Z'), Items.slime_ball });

        GameRegistry.addRecipe(new ItemStack(slimyQChiseled, 4), new Object[] { "XX", "XX", Character.valueOf('X'), slimyQuartz });

        GameRegistry.addRecipe(new ItemStack(slimyPillar, 2), new Object[] { "X", "X", Character.valueOf('X'), slimyQuartz });

        GameRegistry.addRecipe(new ItemStack(enderBrick, 4), new Object[] { "XX", "XX", Character.valueOf('X'), enderSmooth });

        GameRegistry.addRecipe(new ItemStack(enderCobble, 24), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.cobblestone, Character.valueOf('Z'), Items.ender_pearl });

        GameRegistry.addRecipe(new ItemStack(enderChiseled, 4), new Object[] { "XX", "XX", Character.valueOf('X'), enderBrick });

        GameRegistry.addRecipe(new ItemStack(enderLog, 24), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.log, Character.valueOf('Z'), Items.ender_pearl });

        GameRegistry.addShapelessRecipe(new ItemStack(enderPlank, 4), new Object[] { new ItemStack(enderLog) });

        GameRegistry.addRecipe(new ItemStack(enderSmooth, 24), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.stone, Character.valueOf('Z'), Items.ender_pearl });

        GameRegistry.addRecipe(new ItemStack(enderQuartz, 24), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.quartz_block, Character.valueOf('Z'), Items.ender_pearl });

        GameRegistry.addRecipe(new ItemStack(enderQChiseled, 4), new Object[] { "XX", "XX", Character.valueOf('X'), enderQuartz });

        GameRegistry.addRecipe(new ItemStack(enderPillar, 2), new Object[] { "X", "X", Character.valueOf('X'), enderQuartz });

        GameRegistry.addRecipe(new ItemStack(burntSmooth, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.stone, Character.valueOf('Z'), Items.coal });

        GameRegistry.addRecipe(new ItemStack(burntQuartz, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.quartz_block, Character.valueOf('Z'), Items.coal });

        GameRegistry.addRecipe(new ItemStack(burntBrick, 4), new Object[] { "XX", "XX", Character.valueOf('X'), burntSmooth });

        GameRegistry.addRecipe(new ItemStack(burntChiseled, 4), new Object[] { "XX", "XX", Character.valueOf('X'), burntBrick });

        GameRegistry.addRecipe(new ItemStack(burntQChiseled, 4), new Object[] { "XX", "XX", Character.valueOf('X'), burntQuartz });

        GameRegistry.addRecipe(new ItemStack(burntPillar, 2), new Object[] { "X", "X", Character.valueOf('X'), burntQuartz });

        GameRegistry.addShapelessRecipe(new ItemStack(burntPlank, 4), new Object[] { new ItemStack(burntLog) });

        GameRegistry.addRecipe(new ItemStack(burntCobble, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.cobblestone, Character.valueOf('Z'), Items.coal });

        GameRegistry.addRecipe(new ItemStack(burntLog, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.log, Character.valueOf('Z'), Items.coal });


        GameRegistry.addShapelessRecipe(new ItemStack(bonePaver, 1), new Object[]{ new ItemStack(boneBrick)});
        GameRegistry.addShapelessRecipe(new ItemStack(fleshPaver, 1), new Object[]{ new ItemStack(fleshBrick)});
        GameRegistry.addShapelessRecipe(new ItemStack(slimyPaver, 1), new Object[]{ new ItemStack(slimyBrick)});
        GameRegistry.addShapelessRecipe(new ItemStack(enderPaver, 1), new Object[]{ new ItemStack(enderBrick)});
        GameRegistry.addShapelessRecipe(new ItemStack(burntPaver, 1), new Object[]{ new ItemStack(burntBrick)});
        GameRegistry.addShapelessRecipe(new ItemStack(icyPaver, 1), new Object[]{ new ItemStack(icyBrick)});
        GameRegistry.addShapelessRecipe(new ItemStack(leatherPaver, 1), new Object[]{ new ItemStack(leatherBrick)});
        GameRegistry.addShapelessRecipe(new ItemStack(snowyPaver, 1), new Object[]{ new ItemStack(snowyBrick)});

        GameRegistry.addRecipe(new ItemStack(blazeGlass, 8), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.glass, Character.valueOf('Z'), Items.blaze_rod});
        GameRegistry.addRecipe(new ItemStack(fleshGlass, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.glass, Character.valueOf('Z'), Items.rotten_flesh });
        GameRegistry.addRecipe(new ItemStack(boneGlass, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.glass, Character.valueOf('Z'), Items.bone });
        GameRegistry.addRecipe(new ItemStack(slimyGlass, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.glass, Character.valueOf('Z'), Items.slime_ball });
        GameRegistry.addRecipe(new ItemStack(enderGlass, 24), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.glass, Character.valueOf('Z'), Items.ender_pearl });
        GameRegistry.addRecipe(new ItemStack(burntGlass, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.glass, Character.valueOf('Z'), Items.coal });
        GameRegistry.addRecipe(new ItemStack(icyGlass, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.glass, Character.valueOf('Z'), Blocks.ice });
        GameRegistry.addRecipe(new ItemStack(leatherGlass, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.glass, Character.valueOf('Z'), Items.leather });
        GameRegistry.addRecipe(new ItemStack(snowyGlass, 8), new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), Blocks.glass, Character.valueOf('Z'), Items.snowball });

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

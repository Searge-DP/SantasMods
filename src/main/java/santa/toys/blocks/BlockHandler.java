package santa.toys.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import santa.toys.Config;

/**
 * Created by elijahfoster-wysocki on 8/18/14.
 */
public class BlockHandler {
    public static Block giveADamn;
    public static Block glowstone;
    //public static Block muffler;

    public static void meet(){
        if (Config.enableGiveADamn){
            giveADamn = new GiveADamn();
        }

        if (Config.enableGlowstone){
            glowstone = new HeavyLight();
        }
        /*

        if (Config.enableMuffler){
            muffler = new Muffler();
        }
        */

    }

    public static void date() {
        if (Config.enableGiveADamn){
            GameRegistry.registerBlock(giveADamn, BlockInfo.DAMN_KEY);
        }

        if (Config.enableGlowstone){
            GameRegistry.registerBlock(glowstone, BlockInfo.HEAVY_KEY);
        }
        /*

        if (Config.enableMuffler){
            GameRegistry.registerBlock(muffler, BlockInfo.MUFFLER_KEY);
        }
        */
    }


    public static void useMove(){
        if (Config.enableGiveADamn) {
            GameRegistry.addRecipe(new ItemStack(giveADamn, 1), new Object[]{
                    "X ",
                    "ZX",
                    Character.valueOf('X'), Items.rotten_flesh, Character.valueOf('Z'), Blocks.dirt
            });
        }

        if (Config.enableGlowstone){
            GameRegistry.addRecipe(new ItemStack(glowstone, 1), new Object[]{
                    " X ", "XYX", " X ",
                    Character.valueOf('X'), Items.iron_ingot, Character.valueOf('Y'), Blocks.glowstone
            });
        }
        /*

        if (Config.enableMuffler){
            GameRegistry.addRecipe(new ItemStack(muffler, 1), new Object[]{"XXX", "XXX", "XXX", Character.valueOf('X'), Blocks.wool});
        }
        */

    }

}
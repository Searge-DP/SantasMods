package santa.enderlevers.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import santa.enderlevers.Config;

/**
 * @author SatanicSanta
 */
public class BlockHandler {

    public static Block enderLever;

    public static void registerStuff(){
        if (Config.enableEnderLever){
            enderLever = new EnderLever();
            GameRegistry.registerBlock(enderLever, "enderLever");
        }
    }

    public static void recipes(){
        if (Config.enableEnderLever && Config.harderRecipe){
            GameRegistry.addRecipe(new ItemStack(enderLever, 1), new Object[]{
                    "RXR",
                    "QYQ",
                    "DZD",
                    'X', Items.ender_pearl, 'Y', Blocks.lever, 'Z', Blocks.obsidian, 'R', Blocks.end_stone, 'Q', Items.blaze_rod, 'D', Items.diamond
            });
        }

        if (Config.enableEnderLever && !Config.harderRecipe){
            GameRegistry.addRecipe(new ItemStack(enderLever, 1), new Object[]{
                    "X",
                    "Y",
                    "Z",
                    'X', Blocks.end_stone, 'Y', Blocks.lever, 'Z', Items.ender_pearl
            });
        }
    }
}

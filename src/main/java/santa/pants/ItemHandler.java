package santa.pants;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

/**
 * Created by elijahfoster-wysocki on 7/20/14.
 */
public class ItemHandler {
    public static ItemArmor pantsSparkly;

    public static void meet(){
        pantsSparkly = new SparklyPantsItem(ItemArmor.ArmorMaterial.GOLD, 1, 2);
    }

    public static void date(){
        GameRegistry.registerItem(pantsSparkly, ItemInfo.PANTS_KEY);
    }

    public static void useMove(){
        GameRegistry.addRecipe(new ItemStack(pantsSparkly), new Object[]{
                "XXX",
                "X X",
                "X X",
                'X', Items.sugar
        });

    }

}

package santa.pants;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemHandler {
    public static ItemArmor pantsSparkly;

    public static void initialize() {
        pantsSparkly = new SparklyPantsItem(ItemArmor.ArmorMaterial.GOLD, 1, 2);
        GameRegistry.registerItem(pantsSparkly, ItemInfo.PANTS_KEY);
        GameRegistry.addRecipe(new ItemStack(pantsSparkly), new Object[]{
          "XXX",
          "X X",
          "X X",
          'X', Items.sugar
        });
    }
}

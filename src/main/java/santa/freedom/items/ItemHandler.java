package santa.freedom.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

/**
 * Created by elijahfoster-wysocki on 7/20/14.
 */
public class ItemHandler {

    public static Item flag;
    public static Item freedomBucket;
    public static Item americanFlavor;
    public static ItemFood friedChickenBucket;
    public static ItemFood dewMTN;
    public static ItemFood freedomBread;
    public static ItemFood freedomPie;

    public static void meet(){

        flag = new Flag();
        freedomBucket = new FreedomBucket();
        americanFlavor = new AmericanFlavoring();
        friedChickenBucket = new FriedChickenBucket(6, 2, false);
        dewMTN = new MTNDew(1, 0, false);
        freedomBread = new FreedomBread(7, 1, false);
        freedomPie = new FreedomPie(10, 1, false);
    }

    public static void date(){
        GameRegistry.registerItem(flag, ItemInfo.FLAG_KEY);
        GameRegistry.registerItem(freedomBucket, ItemInfo.BUCKET_KEY);
        GameRegistry.registerItem(americanFlavor, ItemInfo.FLAVOR_KEY);
        GameRegistry.registerItem(friedChickenBucket, ItemInfo.FRIEDCHICKEN_KEY);
        GameRegistry.registerItem(dewMTN, ItemInfo.MTNDEW_KEY);
        GameRegistry.registerItem(freedomBread, ItemInfo.BREAD_KEY);
        GameRegistry.registerItem(freedomPie, ItemInfo.PIE_KEY);
    }

    public static void useMove(){

        GameRegistry.addRecipe(new ItemStack(flag, 1), new Object[]{
                "XYY",
                "ZZZ",
                "YYY",
                'X', new ItemStack(Items.dye, 1, 4), 'Y', new ItemStack(Items.dye, 1, 15), 'Z', new ItemStack(Items.dye, 1, 1)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(freedomBucket, 1), new Object[]{
                new ItemStack(Items.bucket), new ItemStack(flag)
        });

        GameRegistry.addRecipe(new ItemStack(americanFlavor, 1), new Object[]{
                "XXX",
                "XZX",
                "XXX",
                'X', Items.sugar, 'Z', flag
        });

        GameRegistry.addShapelessRecipe(new ItemStack(friedChickenBucket, 1), new Object[]{
                new ItemStack(Items.cooked_chicken), new ItemStack(freedomBucket)
        });

        GameRegistry.addRecipe(new ItemStack(dewMTN, 1), new Object[]{
                "XXX",
                "XZX",
                "XXX",
                'X', Items.sugar, 'Z', freedomBucket
        });

        GameRegistry.addShapelessRecipe(new ItemStack(freedomBread, 1), new Object[]{
                new ItemStack(Items.bread), new ItemStack(americanFlavor)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(freedomPie, 1), new Object[]{
                new ItemStack(Items.pumpkin_pie), new ItemStack(americanFlavor)
        });

    }

}

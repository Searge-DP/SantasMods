package santa.gregfood.fluid;

import gregtech.api.GregTech_API;
import gregtech.api.enums.ItemList;
import gregtech.api.interfaces.internal.IGT_RecipeAdder;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Recipe;
import gregtech.common.items.GT_MetaGenerated_Item_02;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.oredict.OreDictionary;

import static gregtech.api.enums.ItemList.Crop_Drop_Chilly;

/**
 * @author SatanicSanta
 */
public class FluidRecipes implements Runnable {

    public static IGT_RecipeAdder recipe;
    public static GT_OreDictUnificator ore;

    public void run(){

        //fermenter
        recipe.addFermentingRecipe(FluidRegistry.getFluidStack("potion.juicePear", 50), FluidRegistry.getFluidStack("potion.perry", 50), 1024, false);

        //distiller
        recipe.addDistilleryRecipe(ItemList.Circuit_Integrated.getWithDamage(0L, 1L, new Object[0]), FluidRegistry.getFluidStack("potion.wheatyjuice", 50), FluidRegistry.getFluidStack("potion.whiskey", 50), 16, 16, false);
        recipe.addDistilleryRecipe(ItemList.Circuit_Integrated.getWithDamage(0L, 1L, new Object[0]), FluidRegistry.getFluidStack("potion.wine", 50), FluidRegistry.getFluidStack("potion.brandy", 50), 16, 16, false);

        //mixer
        //input1, input2, input3, input,4, fluid input, fluid output, item output, duration, eu
        recipe.addMixerRecipe(new ItemStack(Items.pumpkin_seeds), new ItemStack(Items.pumpkin_seeds), new ItemStack(Items.pumpkin_seeds), new ItemStack(Items.pumpkin_seeds), FluidRegistry.getFluidStack("potion.beer", 50), FluidRegistry.getFluidStack("potion.alePumpkin", 50), null, 16, 16);
        recipe.addMixerRecipe(ore.getFirstOre("listAllBerry", 1), ore.getFirstOre("listAllBerry", 1), ore.getFirstOre("listAllBerry", 1), ore.getFirstOre("listAllBerry", 1), FluidRegistry.getFluidStack("potion.cider", 50), FluidRegistry.getFluidStack("potion.ciderMixed", 50), null, 16, 16);
        recipe.addMixerRecipe(ItemList.Crop_Drop_Chilly.getWithDamage(0L, 0L, new Object[0]), ItemList.Crop_Drop_Chilly.getWithDamage(0L, 0L, new Object[0]), ItemList.Crop_Drop_Chilly.getWithDamage(0L, 0L, new Object[0]), ItemList.Crop_Drop_Chilly.getWithDamage(0L, 0L, new Object[0]), FluidRegistry.getFluidStack("potion.rum", 50), FluidRegistry.getFluidStack("potionrumSpiced", 50), null, 16, 16);
        recipe.addMixerRecipe(ItemList.ThermosCan_Coffee.getWithDamage(0L, 0L, new Object[0]), null, null, null, FluidRegistry.getFluidStack("potion.whiskey", 50), FluidRegistry.getFluidStack("coffeeIrish", 50), null, 16, 16);
        //recipe.addMixerRecipe(ItemList.ThermosCan_Coffee.getWithDamage(0L, 0L, new Object[0]), null, null, null, FluidRegistry.getFluidStack("potion.gin", 50), FluidRegistry.getFluidStack("coffeeEnglish", 50), null, 16, 16);
        recipe.addMixerRecipe(ItemList.ThermosCan_Coffee.getWithDamage(0L, 0L, new Object[0]), null, null, null, FluidRegistry.getFluidStack("potion.rum", 50), FluidRegistry.getFluidStack("coffeeShinShin", 50), null, 16, 16);
        recipe.addMixerRecipe(ItemList.ThermosCan_Coffee.getWithDamage(0L, 0L, new Object[0]), null, null, null, FluidRegistry.getFluidStack("potion.vodka", 50), FluidRegistry.getFluidStack("coffeeRussian", 50), null, 16, 16);


        //brewing machine
        for (Fluid water : new Fluid[] { FluidRegistry.WATER, GT_ModHandler.getDistilledWater(1L).getFluid() }) {
            recipe.addBrewingRecipe(ore.getFirstOre("cropPear", 1), water, FluidRegistry.getFluid("potion.juicePear"), false);

        }
        //fluid canner
    }
}

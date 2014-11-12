package santa.gregfood.fluid;

import gregtech.api.GregTech_API;
import gregtech.api.enums.ItemList;
import gregtech.api.interfaces.internal.IGT_RecipeAdder;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

/**
 * @author SatanicSanta
 */
public class FluidRecipes implements Runnable {

    public static IGT_RecipeAdder recipe;

    public void run(){

        //fermenter
        recipe.addFermentingRecipe(FluidRegistry.getFluidStack("potion.juicePear", 50), FluidRegistry.getFluidStack("potion.perry", 50), 1024, false);

        //distiller
        recipe.addDistilleryRecipe(ItemList.Circuit_Integrated.getWithDamage(0L, 1L, new Object[0]), FluidRegistry.getFluidStack("potion.wheatyjuice", 50), FluidRegistry.getFluidStack("potion.whiskey", 50), 16, 16, false);

        //mixer
        //input1, input2, input3, input,4, fluid input, fluid output, item output, duration, eu
        recipe.addMixerRecipe(new ItemStack(Items.pumpkin_seeds), null, null, null, FluidRegistry.getFluidStack("potion.beer", 50), FluidRegistry.getFluidStack("potion.alePumpkin", 50), null, 16, 16);


    }
}

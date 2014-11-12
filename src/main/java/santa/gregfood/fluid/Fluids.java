package santa.gregfood.fluid;

import gregtech.GT_Mod;
import gregtech.api.enums.ItemList;
import santa.gregfood.item.FoodList;

/**
 * @author SatanicSanta
 */
public class Fluids implements Runnable{

    public void run(){
        GT_Mod.gregtechproxy.addFluid("potion.whiskey", "Whiskey", null, 1, 275, FoodList.Whiskey.get(1L, new Object[0]), ItemList.Bottle_Empty.get(1L, new Object[0]), 250);
        GT_Mod.gregtechproxy.addFluid("potion.perry", "Perry", null, 1, 295, FoodList.Perry.get(1L, new Object[0]), ItemList.Bottle_Empty.get(1L, new Object[0]), 250);
        GT_Mod.gregtechproxy.addFluid("potion.ciderMixed", "Mixed Berry Cider", null, 1, 295, FoodList.Mixed_Berry_Cider.get(1L, new Object[0]), ItemList.Bottle_Empty.get(1L, new Object[0]), 250);
        GT_Mod.gregtechproxy.addFluid("potion.gin", "Gin", null, 1, 275, FoodList.Gin.get(1L, new Object[0]), ItemList.Bottle_Empty.get(1L, new Object[0]), 250);
        GT_Mod.gregtechproxy.addFluid("potion.alePumpkin", "Pumpkin Ale", null, 1, 275, FoodList.Pumpkin_Ale.get(1L, new Object[0]), ItemList.Bottle_Empty.get(1L, new Object[0]), 250);
        GT_Mod.gregtechproxy.addFluid("potion.tequila", "Tequila", null, 1, 275, FoodList.Tequila.get(1L, new Object[0]), ItemList.Bottle_Empty.get(1L, new Object[0]), 250);
        GT_Mod.gregtechproxy.addFluid("potion.everclear", "Everclear", null, 1, 350, FoodList.Everclear.get(1L, new Object[0]), ItemList.Bottle_Empty.get(1L, new Object[0]), 250);
        GT_Mod.gregtechproxy.addFluid("potion.springclear", "Springclear", null, 1, 380, FoodList.Springclear.get(1L, new Object[0]), ItemList.Bottle_Empty.get(1L, new Object[0]), 250);
        GT_Mod.gregtechproxy.addFluid("potion.aleApricot", "Apricot Ale", null, 1, 275, FoodList.Apricot_Ale.get(1L, new Object[0]), ItemList.Bottle_Empty.get(1L, new Object[0]), 250);
        GT_Mod.gregtechproxy.addFluid("potion.margarita", "Margarita", null, 1, 280, FoodList.Margarita.get(1L, new Object[0]), ItemList.Bottle_Empty.get(1L, new Object[0]), 250);
        GT_Mod.gregtechproxy.addFluid("potion.ginLime", "Lime Gin", null, 1, 280, FoodList.Lime_Gin.get(1L, new Object[0]), ItemList.Bottle_Empty.get(1L, new Object[0]), 250);
        GT_Mod.gregtechproxy.addFluid("potion.liquorMalt", "Malt Liquor", null, 1, 275, FoodList.Malt_Liquor.get(1L, new Object[0]), ItemList.Bottle_Empty.get(1L, new Object[0]), 250);
        GT_Mod.gregtechproxy.addFluid("potion.beerDisgusting", "Bum Beer", null, 1, 275, FoodList.Bum_Beer.get(1L, new Object[0]), ItemList.Bottle_Empty.get(1L, new Object[0]), 250);
        GT_Mod.gregtechproxy.addFluid("potion.rumQue", "Rum?", null, 1, 295, FoodList.Rum_.get(1L, new Object[0]), ItemList.Bottle_Empty.get(1L, new Object[0]), 250);
        GT_Mod.gregtechproxy.addFluid("potion.rumSpiced", "Spiced Rum", null, 1, 300, FoodList.Spiced_Rum.get(1L, new Object[0]), ItemList.Bottle_Empty.get(1L, new Object[0]), 250);
        GT_Mod.gregtechproxy.addFluid("potion.liquerOrange", "Orange Liquer", null, 1, 295, FoodList.Orange_Liquer.get(1L, new Object[0]), ItemList.Bottle_Empty.get(1L, new Object[0]), 250);
        GT_Mod.gregtechproxy.addFluid("potion.brandy", "Brandy", null, 1, 295, FoodList.Brandy.get(1L, new Object[0]), ItemList.Bottle_Empty.get(1L, new Object[0]), 250);
        GT_Mod.gregtechproxy.addFluid("potion.absinthe", "Absinthe", null, 1, 295, FoodList.Absinthe.get(1L, new Object[0]), ItemList.Bottle_Empty.get(1L, new Object[0]), 250);

        GT_Mod.gregtechproxy.addFluid("potion.coffeeIrish", "Irish Coffee", null, 1, 295, FoodList.Irish_Coffee.get(1L, new Object[0]), ItemList.ThermosCan_Empty.get(1L, new Object[0]), 250);
        GT_Mod.gregtechproxy.addFluid("potion.coffeeBrandy", "Brandy Coffee", null, 1, 295, FoodList.Brandy_Coffee.get(1L, new Object[0]), ItemList.ThermosCan_Empty.get(1L, new Object[0]), 250);
        GT_Mod.gregtechproxy.addFluid("potion.coffeeEnglish", "English Coffee", null, 1, 295, FoodList.English_Coffee.get(1L, new Object[0]), ItemList.ThermosCan_Empty.get(1L, new Object[0]), 250);
        GT_Mod.gregtechproxy.addFluid("potion.coffeeShinShin", "Shin Shin Coffee", null, 1, 295, FoodList.Shin_Shin_Coffee.get(1L, new Object[0]), ItemList.ThermosCan_Empty.get(1L, new Object[0]), 250);
        GT_Mod.gregtechproxy.addFluid("potion.coffeeRussian", "Russian Coffee", null, 1, 295, FoodList.Russian_Coffee.get(1L, new Object[0]), ItemList.ThermosCan_Empty.get(1L, new Object[0]), 250);

    }
}

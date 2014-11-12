package santa.gregfood.item;

import gregtech.api.GregTech_API;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.interfaces.IIconContainer;
import gregtech.api.items.GT_MetaBase_Item;
import gregtech.api.items.GT_MetaGenerated_Item;
import gregtech.api.util.GT_FoodStat;
import net.minecraft.item.EnumAction;
import net.minecraft.potion.Potion;

/**
 * @author SatanicSanta
 */
public class MetaItem extends GT_MetaGenerated_Item{

    public MetaItem() {
        super("metaitem");
        int lastID = 0;

        //alcoholic drinks
        FoodList.Whiskey.set(addItem(lastID = 0, "Whiskey", "You gaze first, then it's time to drink", new Object[]{new GT_FoodStat(2, 0.3F, EnumAction.drink, ItemList.Bottle_Empty.get(1L, new Object[0]), GregTech_API.sDrinksAlwaysDrinkable, false, false, new int[]{ Potion.confusion.id, 400, 1, 60, Potion.moveSpeed.id, 400, 0, 50, Potion.poison.id, 200, 0, 30 })}));
        FoodList.Perry.set(addItem(lastID = 1, "Perry", "Cider, but with pears", new Object[]{ new GT_FoodStat(2, 0.4F, EnumAction.drink, ItemList.Bottle_Empty.get(1L, new Object[0]), GregTech_API.sDrinksAlwaysDrinkable, false, false, new int[]{Potion.confusion.id, 400, 1, 20, Potion.resistance.id, 300, 0, 30, Potion.poison.id, 200, 0, 2 })}));
        FoodList.Mixed_Berry_Cider.set(addItem(lastID = 2, "Mixed Berry Cider", "Cider with berries", new Object[]{ new GT_FoodStat(2, 0.4F, EnumAction.drink, ItemList.Bottle_Empty.get(1L, new Object[0]), GregTech_API.sDrinksAlwaysDrinkable, false, false, new int[]{ Potion.confusion.id, 400, 1, 20, Potion.resistance.id, 300, 0, 25, Potion.poison.id, 200, 0, 3})}));
        FoodList.Gin.set(addItem(lastID = 3, "Gin", "Is actually a mascara thinner", new Object[]{ new GT_FoodStat(2, 0.2F, EnumAction.drink, ItemList.Bottle_Empty.get(1L, new Object[0]), GregTech_API.sDrinksAlwaysDrinkable, false, false, new int[]{ Potion.confusion.id, 600, 1, 75, Potion.damageBoost.id, 300, 0, 15, Potion.poison.id, 200, 0, 10 })}));
        FoodList.Pumpkin_Ale.set(addItem(lastID = 4, "Pumpkin Ale", "The spookiest of beers", new Object[]{ new GT_FoodStat(2, 0.4F, EnumAction.drink, ItemList.Bottle_Empty.get(1L, new Object[0]), GregTech_API.sDrinksAlwaysDrinkable, false, false, new int[]{ Potion.confusion.id, 400, 1, 20, Potion.nightVision.id, 400, 0, 20, Potion.poison.id, 200, 0, 5 })}));
        FoodList.Tequila.set(addItem(lastID = 5, "Tequila", "Takillya", new Object[]{ new GT_FoodStat(2, 0.3F, EnumAction.drink, ItemList.Bottle_Empty.get(1L, new Object[0]), GregTech_API.sDrinksAlwaysDrinkable, false, false, new int[]{ Potion.confusion.id, 400, 1, 80, Potion.resistance.id, 400, 0, 50, Potion.poison.id, 200, 0, 60})}));
        FoodList.Everclear.set(addItem(lastID = 6, "Everclear", "Ever so clear. You're sure to have 'fun' at 75%ABV", new Object[]{ new GT_FoodStat(1, 0.0F, EnumAction.drink, ItemList.Bottle_Empty.get(1L, new Object[0]), GregTech_API.sDrinksAlwaysDrinkable, false, false, new int[]{ Potion.confusion.id, 400, 1, 85, Potion.poison.id, 200, 0, 85, Potion.blindness.id, 300, 0, 50, Potion.resistance.id, 400, 0, 75, Potion.moveSpeed.id, 600, 0, 80})}));
        FoodList.Springclear.set(addItem(lastID = 7, "Springclear", "Clearer than Everclear at a whopping 95%ABV", new Object[]{ new GT_FoodStat(0, 0.0F, EnumAction.drink, ItemList.Bottle_Empty.get(1L, new Object[0]), GregTech_API.sDrinksAlwaysDrinkable, false, false, new int[]{ Potion.confusion.id, 600, 1, 100, Potion.poison.id, 200, 0, 100, Potion.blindness.id, 300, 0, 100, Potion.resistance.id, 300, 0, 80, Potion.damageBoost.id, 400, 0, 80})}));
        FoodList.Apricot_Ale.set(addItem(lastID = 8, "Apricot Ale", "", new Object[]{ new GT_FoodStat(2, 0.4F, EnumAction.drink, ItemList.Bottle_Empty.get(1L, new Object[0]), GregTech_API.sDrinksAlwaysDrinkable, false, false, new int[]{ Potion.confusion.id, 400, 1, 20, Potion.poison.id, 200, 0, 5, Potion.nightVision.id, 300, 0, 30})}));
        FoodList.Margarita.set(addItem(lastID = 9, "Margarita", "Because Tequila wasn't dangerous enough, we had to disguise the flavor!", new Object[]{ new GT_FoodStat(1, 0.4F, EnumAction.drink, ItemList.Bottle_Empty.get(1L, new Object[0]), GregTech_API.sDrinksAlwaysDrinkable, false, false, new int[]{ Potion.confusion.id, 400, 1, 80, Potion.resistance.id, 400, 0, 50, Potion.poison.id, 200, 0, 60})}));
        FoodList.Lime_Gin.set(addItem(lastID = 10, "Lime Gin", "Like Gin, but tastes even better!", new Object[]{ new GT_FoodStat(2, 0.3F, EnumAction.drink, ItemList.Bottle_Empty.get(1L, new Object[0]), GregTech_API.sDrinksAlwaysDrinkable, false, false, new int[]{ Potion.confusion.id, 600, 1, 75, Potion.damageBoost.id, 300, 0, 15, Potion.poison.id, 200, 1, 30})}));
        FoodList.Malt_Liquor.set(addItem(lastID = 11, "Malt Liquor", "A 40 of liquid courage", new Object[]{ new GT_FoodStat(2, 0.2F, EnumAction.drink, ItemList.Bottle_Empty.get(1L, new Object[0]), GregTech_API.sDrinksAlwaysDrinkable, false, false, new int[]{ Potion.confusion.id, 400, 1, 50, Potion.moveSpeed.id, 400, 0, 75, Potion.poison.id, 200, 0, 15})}));
        FoodList.Space_Bag.set(addItem(lastID = 12, "Space Bag", "A box of wine that you can take to space", new Object[]{ new GT_FoodStat(2, 0.2F, EnumAction.drink, ItemList.Bottle_Empty.get(1L, new Object[0]), GregTech_API.sDrinksAlwaysDrinkable, false, false, new int[]{ Potion.confusion.id, 400, 1, 30, Potion.poison.id, 200, 0, 20, Potion.jump.id, 300, 0, 40})}));
        FoodList.Bum_Beer.set(addItem(lastID = 13, "Bum Beer", "Really?", new Object[]{ new GT_FoodStat(2, 0.1F, EnumAction.drink, ItemList.Bottle_Empty.get(1L, new Object[0]), GregTech_API.sDrinksAlwaysDrinkable, false, false, new int[]{ Potion.confusion.id, 400, 1, 80, Potion.poison.id, 200, 0, 80, Potion.resistance.id, 300, 0, 100, Potion.moveSpeed.id, 400, 0, 60})}));
        FoodList.Rum_.set(addItem(lastID = 14, "Rum?", "A buddle o' rum", new Object[]{ new GT_FoodStat(0, 0F, EnumAction.drink, ItemList.Bottle_Empty.get(1L, new Object[0]), GregTech_API.sDrinksAlwaysDrinkable, false, false, null)}));
        FoodList.Spiced_Rum.set(addItem(lastID = 15, "Spiced Rum", "A buddle o' spiced rum", new Object[]{ new GT_FoodStat(4, 0.4F, EnumAction.drink, ItemList.Bottle_Empty.get(1L, new Object[0]), GregTech_API.sDrinksAlwaysDrinkable, false, false, new int[]{ Potion.confusion.id, 300, 0, 60, Potion.damageBoost.id, 300, 1, 60, Potion.poison.id, 200, 1, 5 })}));
        FoodList.Orange_Liquer.set(addItem(lastID = 16, "Orange Liquer", "Fancy.", new Object[]{ new GT_FoodStat(2, 0.3F, EnumAction.drink, ItemList.Bottle_Empty.get(1L, new Object[0]), GregTech_API.sDrinksAlwaysDrinkable, false, false, new int[]{ Potion.confusion.id, 400, 1, 10, Potion.poison.id, 200, 0, 10, Potion.resistance.id, 400, 0, 30})}));
        FoodList.Brandy.set(addItem(lastID = 17, "Brandy", "You must be a hero to drink this", new Object[]{ new GT_FoodStat(2, 0.3F, EnumAction.drink, ItemList.Bottle_Empty.get(1L, new Object[0]), GregTech_API.sDrinksAlwaysDrinkable, false, false, new int[]{ Potion.confusion.id, 400, 1, 10, Potion.poison.id, 200, 0, 10, Potion.resistance.id, 400, 0, 30 })}));
        FoodList.Absinthe.set(addItem(lastID = 23, "Absinthe", "You will see things as they are", new Object[]{ new GT_FoodStat(4, 0.4F, EnumAction.drink, ItemList.Bottle_Empty.get(1L, new Object[0]), GregTech_API.sDrinksAlwaysDrinkable, false, false, new int[]{ Potion.confusion.id, 600, 1, 70, Potion.poison.id, 200, 0, 60, Potion.digSlowdown.id, 300, 0, 75, Potion.waterBreathing.id, 400, 0, 75, Potion.invisibility.id, 400, 0, 80})}));

        FoodList.Irish_Coffee.set(addItem(lastID = 18, "Irish Coffee", "Just the regular morning Coffee... I swear", new Object[]{ new GT_FoodStat(3, 0.4F, EnumAction.drink, ItemList.ThermosCan_Empty.get(1L, new Object[0]), GregTech_API.sDrinksAlwaysDrinkable, false, false, new int[]{ Potion.confusion.id, 400, 1, 60, Potion.moveSpeed.id, 400, 1, 700, Potion.digSpeed.id, 400, 1, 70, Potion.poison.id, 200, 0, 30 })}));
        FoodList.Brandy_Coffee.set(addItem(lastID = 19, "Brandy Coffee", "Just the regular morning Coffee... I swear", new Object[]{ new GT_FoodStat(3, 0.4F, EnumAction.drink, ItemList.ThermosCan_Empty.get(1L, new Object[0]), GregTech_API.sDrinksAlwaysDrinkable, false, false, new int[]{ Potion.confusion.id, 400, 1, 10, Potion.poison.id, 200, 0, 10, Potion.resistance.id, 400, 0, 30, Potion.moveSpeed.id, 400, 1, 70, Potion.digSpeed.id, 400, 1, 70 })}));
        FoodList.English_Coffee.set(addItem(lastID = 20, "English Coffee", "Just the regular morning Coffee... I swear", new Object[]{ new GT_FoodStat(3, 0.4F, EnumAction.drink, ItemList.ThermosCan_Empty.get(1L, new Object[0]), GregTech_API.sDrinksAlwaysDrinkable, false, false, new int[]{ Potion.confusion.id, 500, 0, 60, Potion.damageBoost.id, 500, 1, 60, Potion.poison.id, 200, 1, 5, Potion.moveSpeed.id, 400, 1, 700, Potion.digSpeed.id, 400, 1, 70 })}));
        FoodList.Shin_Shin_Coffee.set(addItem(lastID = 21, "Shin Shin Coffee", "Just the regular morning Coffee... I swear", new Object[]{ new GT_FoodStat(3, 0.4F, EnumAction.drink, ItemList.ThermosCan_Empty.get(1L, new Object[0]), GregTech_API.sDrinksAlwaysDrinkable, false, false, new int[]{ Potion.confusion.id, 300, 0, 60, Potion.damageBoost.id, 300, 1, 60, Potion.poison.id, 200, 1, 5, Potion.moveSpeed.id, 400, 1, 700, Potion.digSpeed.id, 400, 1, 70 })}));
        FoodList.Russian_Coffee.set(addItem(lastID = 22, "Russian Coffee", "Just the regular morning Coffee... I swear", new Object[]{ new GT_FoodStat(3, 0.4F, EnumAction.drink, ItemList.ThermosCan_Empty.get(1L, new Object[0]), GregTech_API.sDrinksAlwaysDrinkable, false, false, new int[]{ Potion.confusion.id, 600, 1, 75, Potion.damageBoost.id, 300, 0, 15, Potion.poison.id, 200, 0, 10, Potion.moveSpeed.id, 400, 1, 70, Potion.digSpeed.id, 400, 1, 70})}));

        //non-alcoholic drinks

        //food
    }
    @Override
    public IIconContainer getIconContainer(int i, Materials materials) {
        return null;
    }
}

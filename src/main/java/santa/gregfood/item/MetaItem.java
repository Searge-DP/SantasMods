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

        FoodList.Whiskey.set(addItem(lastID = 0, "Whiskey", "You gaze first, then it's time to drink", new Object[]{new GT_FoodStat(2, 0.3F, EnumAction.drink, ItemList.Bottle_Empty.get(1L, new Object[0]), GregTech_API.sDrinksAlwaysDrinkable, false, false, new int[]{ Potion.confusion.id, 300, 0, 60, Potion.moveSpeed.id, 300, 1, 60 })}));
        FoodList.Perry.set(addItem(lastID = 1, "Perry", "Cider, but with pears", new Object[]{ new GT_FoodStat(2, 0.4F, EnumAction.drink, ItemList.Bottle_Empty.get(1L, new Object[0]), GregTech_API.sDrinksAlwaysDrinkable, false, false, new int[]{Potion.confusion.id, 400, 0, 60, Potion.resistance.id, 400, 1, 60, Potion.poison.id, 200, 1, 5 })}));
        FoodList.Mixed_Berry_Cider.set(addItem(lastID = 2, "Mixed Berry Cider", "Cider with berries", new Object[]{ new GT_FoodStat(2, 0.4F, EnumAction.drink, ItemList.Bottle_Empty.get(1L, new Object[0]), GregTech_API.sDrinksAlwaysDrinkable, false, false, new int[]{ Potion.confusion.id, 400, 0, 60, Potion.resistance.id, 400, 1, 60, Potion.poison.id, 200, 1, 5})}));
        FoodList.Gin.set(addItem(lastID = 3, "Gin", "Is actually a mascara thinner", new Object[]{ new GT_FoodStat(2, 0.2F, EnumAction.drink, ItemList.Bottle_Empty.get(1L, new Object[0]), GregTech_API.sDrinksAlwaysDrinkable, false, false, new int[]{ Potion.confusion.id, 500, 0, 60, Potion.damageBoost.id, 500, 1, 60, Potion.poison.id, 200, 1, 5 })}));
        FoodList.Pumpkin_Ale.set(addItem(lastID = 4, "Pumpkin Ale", "The spookiest of beers", new Object[]{ new GT_FoodStat(2, 0.4F, EnumAction.drink, ItemList.Bottle_Empty.get(1L, new Object[0]), GregTech_API.sDrinksAlwaysDrinkable, false, false, new int[]{ Potion.confusion.id, 400, 0, 60, Potion.resistance.id, 400, 1, 60, Potion.poison.id, 200, 1, 5 })}));
        FoodList.Tequila.set(addItem(lastID = 5, "Tequila", "Takillya", new Object[]{ new GT_FoodStat(2, 0.3F, EnumAction.drink, ItemList.Bottle_Empty.get(1L, new Object[0]), GregTech_API.sDrinksAlwaysDrinkable, false, false, new int[]{ Potion.confusion.id, 400, 0, 60, Potion.resistance.id, 300, 1, 60, Potion.poison.id, 300, 1, 5})}));
        FoodList.Everclear.set(addItem(lastID = 6, "Everclear", "Ever so clear. You're sure to have 'fun' at 75%ABV", new Object[]{ new GT_FoodStat(2, 0.1F, EnumAction.drink, ItemList.Bottle_Empty.get(1L, new Object[0]), GregTech_API.sDrinksAlwaysDrinkable, false, false, new int[]{ Potion.confusion.id, 500, 0, 60, Potion.poison.id, 400, 1, 5})}));
    }
    @Override
    public IIconContainer getIconContainer(int i, Materials materials) {
        return null;
    }
}

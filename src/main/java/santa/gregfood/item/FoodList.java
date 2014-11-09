package santa.gregfood.item;

import cpw.mods.fml.common.registry.GameRegistry;
import gregtech.api.interfaces.IItemContainer;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * @author SatanicSanta
 */
public enum FoodList implements IItemContainer{

    //alcohol
    Whiskey,
    Perry,
    Mixed_Berry_Cider,
    Gin,
    Pumpkin_Ale,
    Tequila,
    Everclear,
    Springclear,
    Apricot_Ale,
    Margarita,
    Lime_Gin,
    Malt_Liquor,
    Bourbon,
    Space_Bag,
    Bum_Beer,
    Rum_,
    Spiced_Rum,
    Brandy,
    Orange_Liquer,
    Irish_Coffee,
    English_Coffee,
    Brandy_Coffee,
    Shin_Shin_Coffee,
    Russian_Coffee,
    Absinthe,

    //non-alcohol drinks
    Pumpkin_Spice_Latte,
    Affogato,
    Caffe_Americano,
    Caffe_Marocchino,
    Steamed_Milk,
    Coffee_Milk,
    Decaf,
    Eggnog,
    Espressino,
    Ice_Coffee,

    //food
    Christmas_Cookie,
    Brownie,
    Gingerbread_Man,
    Gingerbread_Man_Demonic;

    private boolean isNotSet = true;
    private ItemStack stack;

    @Override
    public IItemContainer set(Item item){
        this.isNotSet = false;
        if (item == null) return this;
        ItemStack stack0 = new ItemStack(item, 1, 0);
        this.stack = GT_Utility.copyAmount(1L, new Object[]{stack0});
        return this;
    }

    @Override
    public IItemContainer set(ItemStack itemStack){
        this.isNotSet = false;
        this.stack = GT_Utility.copyAmount(1L, new Object[]{itemStack});
        return this;
    }

    @Override
    public boolean isStackEqual(Object stackObj){
        return isStackEqual(stackObj, false, false);
    }

    @Override
    public boolean isStackEqual(Object stackObject, boolean wildcard, boolean ignoreNBT){
        if (GT_Utility.isStackInvalid(stackObject)) return false;
        return GT_Utility.areUnificationsEqual((ItemStack)stackObject, wildcard ? getWildcard(1L, new Object[0]) : get(1L, new Object[0]), ignoreNBT);
    }

    @Override
    public ItemStack getAlmostBroken(long amount, Object[] replacements){
        if (this.isNotSet) throw new IllegalAccessError("The enum " + name() + " has not been set to an item");
        if (GT_Utility.isStackInvalid(this.stack)) return GT_Utility.copyAmount(amount, replacements);
        return GT_Utility.copyAmountAndMetaData(amount, this.stack.getMaxDamage() - 1, new Object[] { GT_OreDictUnificator.get(this.stack) });
    }

    @Override
    public ItemStack getWithCharge(long amount, int energy, Object[] replacements){
        ItemStack itemStack = get(1L, replacements);
        if (GT_Utility.isStackInvalid(itemStack)) return null;
        GT_ModHandler.chargeElectricItem(itemStack, energy, 2147483647, true, false);
        return GT_Utility.copyAmount(amount, new Object[] { itemStack });
    }

    @Override
    public ItemStack getWildcard(long amount, Object[] replacements){
        if (this.isNotSet) throw new IllegalAccessError("The enum " + name() + " has not been set to an item");
        if (GT_Utility.isStackInvalid(this.stack)) return GT_Utility.copyAmount(amount, replacements);
        return GT_Utility.copyAmountAndMetaData(amount, 32767L, new Object[] { GT_OreDictUnificator.get(this.stack) });
    }

    @Override
    public Item getItem(){
        if (this.isNotSet) throw new IllegalAccessError("The enum " + name() + " has not been set to an item");
        if (GT_Utility.isStackInvalid(this.stack)) return null;
        return this.stack.getItem();
    }

    @Override
    public Block getBlock(){
        if (this.isNotSet) throw new IllegalAccessError("The enum " + name() + " has not been set to an item");
        return GT_Utility.getBlockFromStack(getItem());
    }

    @Override
    public final boolean hasBeenSet(){
        return !this.isNotSet;
    }

    @Override
    public IItemContainer registerWildcardAsOre(Object[] ores){
        if (this.isNotSet) throw new IllegalAccessError("The enum " + name() + " has not been set to an item");
        for (Object oreName : ores) GT_OreDictUnificator.registerOre(oreName, getWildcard(1L, new Object[0]));
        return this;
    }

    @Override
    public ItemStack getUndamaged(long amount, Object[] replacements){
        if (this.isNotSet) throw new IllegalAccessError("The enum " + name() + " has not been set to an item");
        if (GT_Utility.isStackInvalid(this.stack)) return GT_Utility.copyAmount(amount, replacements);
        return GT_Utility.copyAmountAndMetaData(amount, 0L, new Object[] { GT_OreDictUnificator.get(this.stack) });
    }

    @Override
    public ItemStack get(long amount, Object[] replacements){
        if (this.isNotSet) throw new IllegalAccessError("The enum " + name() + " has not been set to an item");
        if (GT_Utility.isStackInvalid(this.stack)) return GT_Utility.copyAmount(amount, replacements);
        return GT_Utility.copyAmount(amount, new Object[] { GT_OreDictUnificator.get(this.stack) });
    }

    @Override
    public ItemStack getWithName(long amount, String name, Object[] replacements){
        ItemStack itemStack = get(1L, replacements);
        if (GT_Utility.isStackInvalid(itemStack)) return null;
        itemStack.setStackDisplayName(name);
        return GT_Utility.copyAmount(amount, new Object[] { itemStack });
    }

    @Override
    public ItemStack getWithDamage(long amount, long meta, Object[] replacements)
    {
        if (this.isNotSet) throw new IllegalAccessError("The enum " + name() + " has not been set to an item");
        if (GT_Utility.isStackInvalid(this.stack)) return GT_Utility.copyAmount(amount, replacements);
        return GT_Utility.copyAmountAndMetaData(amount, meta, new Object[] { GT_OreDictUnificator.get(this.stack) });
    }

    @Override
    public IItemContainer registerOre(Object[] oreNames)
    {
        if (this.isNotSet) throw new IllegalAccessError("The enum " + name() + " has not been set to an item");
        for (Object oreName : oreNames) GT_OreDictUnificator.registerOre(oreName, get(1L, new Object[0]));
        return this;
    }
}

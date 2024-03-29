package santa.freedom.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import santa.freedom.Freedom;

public class FriedChickenBucket extends ItemFood {
    public FriedChickenBucket(int hunger, float saturation, boolean wolfFood) {
        super(hunger, saturation, wolfFood);
        this.setMaxStackSize(1);
        this.setTextureName("santafreedom:friedchicken");
        this.setAlwaysEdible();
        this.setUnlocalizedName(ItemInfo.FRIEDCHICKEN_UNLOCALIZED_NAME);
        this.setCreativeTab(Freedom.tabFreedom);
    }

    @Override
    public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player) {
        super.onEaten(stack, world, player);
        return new ItemStack(ItemHandler.freedomBucket);
    }

    @Override
    public int getMaxItemUseDuration(ItemStack par1ItemStack) {
        return 32;
    }

    @Override
    public EnumAction getItemUseAction(ItemStack par1ItemStack) {
        return EnumAction.eat;
    }
}
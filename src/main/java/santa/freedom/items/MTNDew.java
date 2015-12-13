package santa.freedom.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.item.ItemFood;
import santa.freedom.Freedom;

public class MTNDew extends ItemFood{
    public MTNDew(int hunger, float saturation, boolean wolfFood) {
        super(hunger, saturation, wolfFood);
        this.setMaxStackSize(1);
        this.setTextureName("santafreedom:dew");
        this.setAlwaysEdible();
        this.setUnlocalizedName(ItemInfo.MTNDEW_UNLOCALIZED_NAME);
        this.setCreativeTab(Freedom.tabFreedom);

    }

    @Override
    public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player) {
        super.onEaten(stack, world, player);
        return new ItemStack(ItemHandler.freedomComponent, 1, 2);
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

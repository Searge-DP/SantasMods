package santa.freedom.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import santa.freedom.Freedom;

/**
 * Created by elijahfoster-wysocki on 7/20/14.
 */
public class FriedChickenBucket extends ItemFood {

    public FriedChickenBucket(int hunger, float saturation, boolean wolfFood){
        super(hunger, saturation, wolfFood);
        this.setMaxStackSize(1);
        this.setTextureName("santafreedom:friedchicken");
        this.setAlwaysEdible();
        this.setUnlocalizedName(ItemInfo.FRIEDCHICKEN_UNLOCALIZED_NAME);
        this.setCreativeTab(Freedom.tabFreedom);
    }

    public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer){
        super.onEaten(par1ItemStack, par2World, par3EntityPlayer);
        return new ItemStack(ItemHandler.freedomBucket);
    }

    public int getMaxItemUseDuration(ItemStack par1ItemStack){
        return 32;
    }

    public EnumAction getItemUseAction(ItemStack par1ItemStack){
        return EnumAction.eat;
    }
}
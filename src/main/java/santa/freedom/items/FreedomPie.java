package santa.freedom.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import santa.freedom.Freedom;

import java.util.List;

/**
 * Created by elijahfoster-wysocki on 7/20/14.
 */
public class FreedomPie extends ItemFood {

    public FreedomPie(int hunger, float saturation, boolean wolfFood){
        super(hunger, saturation, wolfFood);
        this.setMaxStackSize(1);
        this.setTextureName("santafreedom:freedompie");
        this.setAlwaysEdible();
        this.setUnlocalizedName(ItemInfo.PIE_UNLOCALIZED_NAME);
        this.setCreativeTab(Freedom.tabFreedom);
    }

    public int getMaxItemUseDuration(ItemStack par1ItemStack){
        return 32;
    }

    public EnumAction getItemUseAction(ItemStack par1ItemStack){
        return EnumAction.eat;
    }

    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4){
        par3List.add("What does it taste like? America.");
    }

}

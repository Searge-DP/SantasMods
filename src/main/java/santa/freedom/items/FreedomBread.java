package santa.freedom.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import santa.freedom.Freedom;

import java.util.List;

public class FreedomBread extends ItemFood {
    public FreedomBread(int hunger, float saturation, boolean wolfFood) {
        super(hunger, saturation, wolfFood);
        this.setMaxStackSize(1);
        this.setTextureName("santafreedom:freedombread");
        this.setAlwaysEdible();
        this.setUnlocalizedName(ItemInfo.BREAD_UNLOCALIZED_NAME);
        this.setCreativeTab(Freedom.tabFreedom);
    }

    public int getMaxItemUseDuration(ItemStack stack) {
        return 32;
    }

    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.eat;
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
        list.add("What does it taste like? America.");
    }

}

package santa.holiday.items.christmas;

import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import santa.holiday.SantasHolidays;

/**
 * @author SatanicSanta
 */
public class ChristmasCookie extends ItemFood {

    public ChristmasCookie(int hunger, float saturation, boolean wolfFood){
        super(hunger, saturation, wolfFood);
        this.setTextureName("santaholiday:christmas/cookie");
        this.setAlwaysEdible();
        this.setUnlocalizedName("cookieChristmas");
        this.setCreativeTab(SantasHolidays.tab);
    }

    @Override
    public int getMaxItemUseDuration(ItemStack par1){
        return 32;
    }

    @Override
    public EnumAction getItemUseAction(ItemStack par1){
        return EnumAction.eat;
    }
}

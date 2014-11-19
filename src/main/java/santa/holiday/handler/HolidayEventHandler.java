package santa.holiday.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import santa.holiday.HolidayCrap;

/**
 * @author SatanicSanta
 */
public class HolidayEventHandler {

    @SubscribeEvent
    public void onPlayerSleep(EntityPlayer player){

        if (HolidayCrap.isChristmas()){
            player.inventory.addItemStackToInventory(new ItemStack(Items.coal, 32));
        }

    }
}

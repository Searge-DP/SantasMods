package santa.toys.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import santa.toys.SantasToys;

/**
 * @author SatanicSanta
 */
public class BigPouch extends Item {

    public BigPouch() {
        super();
        this.maxStackSize = 1;
        this.setCreativeTab(SantasToys.tabSantasToys);
        this.setUnlocalizedName(ItemInfo.POUCHBIG_UNLOCALIZED_NAME);
        this.setTextureName("santastoys:bigpouch");
    }

    @Override
    public int getMaxItemUseDuration(ItemStack stack) {
        return 1;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        if (world.isRemote && !player.isSneaking()) {
            player.openGui(SantasToys.instance, ItemInfo.POUCHBIG_GUIID, world, (int) player.posX, (int) player.posY, (int) player.posZ);
        }
        return stack;
    }
}

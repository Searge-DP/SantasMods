package santa.toys.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import santa.toys.SantasToys;
import santa.toys.entity.EntityNetherStarBlast;

import java.util.List;

/**
 * Created by elijahfoster-wysocki on 7/28/14.
 */
public class NetherStarBlaster extends Item {

    public NetherStarBlaster(){
        super();
        this.maxStackSize = 1;
        this.setCreativeTab(SantasToys.tabSantasToys);
        this.setUnlocalizedName(ItemInfo.NETHER_UNLOCALIZED_NAME);
        this.setTextureName("santastoys:netherblaster");
    }

    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,EntityPlayer par3EntityPlayer) {
        if(par3EntityPlayer.capabilities.isCreativeMode||par3EntityPlayer.inventory.consumeInventoryItem(Items.nether_star))
        {
            par2World.spawnEntityInWorld(new EntityNetherStarBlast(par2World, par3EntityPlayer));
        }
        return par1ItemStack;
    }

    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4){
        par3List.add("Similar to the Ender Blaster, but 2 op 4 cows");
    }
}


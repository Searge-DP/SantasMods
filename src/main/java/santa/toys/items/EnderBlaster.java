package santa.toys.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import santa.toys.SantasToys;
import santa.toys.entity.EntityEnderBlast;

import java.util.List;

/**
 * Created by elijahfoster-wysocki on 7/28/14.
 */
public class EnderBlaster extends Item {

    public EnderBlaster(){
        super();
        this.maxStackSize = 1;
        this.setCreativeTab(SantasToys.tabSantasToys);
        this.setUnlocalizedName(ItemInfo.ENDER_UNLOCALIZED_NAME);
        this.setTextureName("santastoys:enderblaster");
    }

    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,EntityPlayer par3EntityPlayer) {
        if(par3EntityPlayer.capabilities.isCreativeMode||par3EntityPlayer.inventory.hasItem(Items.ender_pearl))
        {
            par2World.spawnEntityInWorld(new EntityEnderBlast(par2World, par3EntityPlayer));
        }
        return par1ItemStack;
    }

    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4){
        par3List.add("Used to kill cows because cows.");
    }

}

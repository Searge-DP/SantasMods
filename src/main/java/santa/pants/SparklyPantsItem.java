package santa.pants;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created by elijahfoster-wysocki on 7/20/14.
 */
public class SparklyPantsItem extends ItemArmor {

    public SparklyPantsItem(ArmorMaterial par2ArmorMaterial, int par2, int par3) {
        super(par2ArmorMaterial, par2, par3);
        this.setUnlocalizedName(ItemInfo.PANTS_UNLOCALIZED_NAME);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }

    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4){
        par3List.add("So sparkly, you're practically a pop star!");
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1RegisterIcon){
        this.itemIcon = par1RegisterIcon.registerIcon("sparklypants:pants");
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
        return "sparklypants:textures/models/armor/pants2.png";
    }

    @Override
    public boolean hasEffect(ItemStack par1){
        return true;
    }

    @Override
    public ArmorMaterial getArmorMaterial(){
        return ArmorMaterial.GOLD;
    }

    @Override
    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return false;
    }
}

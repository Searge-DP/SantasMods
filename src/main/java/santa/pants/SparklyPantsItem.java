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

public class SparklyPantsItem extends ItemArmor {
    public SparklyPantsItem(ArmorMaterial par2ArmorMaterial, int par2, int par3) {
        super(par2ArmorMaterial, par2, par3);
        this.setUnlocalizedName(ItemInfo.PANTS_UNLOCALIZED_NAME);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
        list.add("So sparkly, you're practically a pop star!");
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister ir) {
        this.itemIcon = ir.registerIcon("sparklypants:pants");
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        return "sparklypants:textures/models/armor/pants2.png";
    }

    @Override
    public boolean hasEffect(ItemStack stack, int renderPass) {
        return true;
    }

    @Override
    public ArmorMaterial getArmorMaterial() {
        return ArmorMaterial.GOLD;
    }

    @Override
    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2) {
        return false;
    }
}

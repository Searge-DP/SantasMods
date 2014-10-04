package santa.decor.blocks.ice;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;
import santa.decor.SantasDecor;
import santa.decor.blocks.BlockInfo;

/**
 * Created by elijahfoster-wysocki on 7/20/14.
 */
public class IcyQuartz extends Block{
    public IcyQuartz(){
        super(Material.rock);
        this.setBlockName(BlockInfo.ICEQUARTZ_UNLOCALIZED_NAME);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setStepSound(Block.soundTypeStone);
    }

    @SideOnly(Side.CLIENT)
    public static IIcon topIcon;
    @SideOnly(Side.CLIENT)
    public static IIcon bottomIcon;
    @SideOnly(Side.CLIENT)
    public static IIcon sideIcon;

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister icon){
        topIcon = icon.registerIcon("santasdecor:icyquartztop");
        bottomIcon = icon.registerIcon("santasdecor:icyquartzbottom");
        sideIcon = icon.registerIcon("santasdecor:icyquartzside");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta){
        if(side == 1){
            return topIcon;
        } else if(side == 0){
            return bottomIcon;
        } else {
            return sideIcon;
        }
    }

}

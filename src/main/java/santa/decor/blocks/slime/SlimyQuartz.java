package santa.decor.blocks.slime;

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
 * Created by elijahfoster-wysocki on 7/28/14.
 */
public class SlimyQuartz extends Block{
    public SlimyQuartz(){
        super(Material.rock);
        this.setBlockName(BlockInfo.SLIMEQUARTZ_UNLOCALIZED_NAME);
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
        topIcon = icon.registerIcon("santasdecor:slimyquartztop");
        bottomIcon = icon.registerIcon("santasdecor:slimyquartzbottom");
        sideIcon = icon.registerIcon("santasdecor:slimyquartzside");
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

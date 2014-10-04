package santa.decor.blocks.burnt;

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
 * Created by elijahfoster-wysocki on 7/14/14.
 */
public class BurntQuartz extends Block{

    public BurntQuartz(){
        super(Material.rock);
        this.setBlockName(BlockInfo.BURNTQUARTZ_UNLOCALIZED_NAME);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(0.5F);
        this.setResistance(4.0F);
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
        topIcon = icon.registerIcon("santasdecor:burntquartztop");
        bottomIcon = icon.registerIcon("santasdecor:burntquartzbottom");
        sideIcon = icon.registerIcon("santasdecor:burntquartzside");
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

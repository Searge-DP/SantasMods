package santa.decor.blocks.leather;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import santa.decor.SantasDecor;
import santa.decor.blocks.BlockInfo;

/**
 * Created by elijahfoster-wysocki on 7/28/14.
 */
public class LeatherLog extends BlockRotatedPillar {

    @SideOnly(Side.CLIENT)
    private IIcon[] field_111052_c;
    @SideOnly(Side.CLIENT)
    private IIcon[] tree_top;

    public LeatherLog(){
        super(Material.wood);
        this.setBlockName(BlockInfo.LEATHERLOG_UNLOCALIZED_NAME);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(2.0F);
        this.setStepSound(Block.soundTypeStone);
    }

    @SideOnly(Side.CLIENT)
    public static IIcon endIcon;
    @SideOnly(Side.CLIENT)
    public static IIcon sideIcon;

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister icon){
        endIcon = icon.registerIcon("santasdecor:leatherlogtop");

        sideIcon = icon.registerIcon("santasdecor:leatherlog");
    }

    @Override
    protected IIcon getSideIcon(int i) {
        return sideIcon;
    }

    @Override
    protected IIcon getTopIcon(int i){
        return endIcon;
    }

    @Override
    public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z){
        return true;
    }

}

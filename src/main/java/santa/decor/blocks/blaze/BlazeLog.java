package santa.decor.blocks.blaze;

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
 * Created by elijahfoster-wysocki on 7/14/14.
 */
public class BlazeLog extends BlockRotatedPillar {
    public BlazeLog(){
        super(Material.wood);
        this.setBlockName(BlockInfo.BLAZELOG_UNLOCALIZED_NAME);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(2.0F);
        this.setStepSound(Block.soundTypeWood);
    }

    @SideOnly(Side.CLIENT)
    public static IIcon endIcon;
    @SideOnly(Side.CLIENT)
    public static IIcon sideIcon;

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister icon){
        endIcon = icon.registerIcon("santasdecor:blazelogtop");

        sideIcon = icon.registerIcon("santasdecor:blazelog");
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

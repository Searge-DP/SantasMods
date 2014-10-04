package santa.decor.blocks.glass.glass;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.Facing;
import net.minecraft.world.IBlockAccess;
import santa.decor.SantasDecor;
import santa.decor.blocks.BlockHandler;
import santa.decor.blocks.BlockInfo;

/**
 * Created by elijahfoster-wysocki on 9/17/14.
 */
public class SnowyGlass extends Block {

    private boolean field_149996_a;

    public SnowyGlass(){
        super(Material.glass);
        this.setBlockName(BlockInfo.SNOWGLASS_UNLOCALIZED_NAME);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(0.3F);
        this.setStepSound(Block.soundTypeGlass);
        this.setBlockTextureName("santasdecor:snowyglass");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 1;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean isOpaqueCube(){
        return false;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess iBlockAccess, int par2, int par3, int par4, int par5){
        Block block = iBlockAccess.getBlock(par2, par3, par4);

        if (this == BlockHandler.blazeGlass || this == BlockHandler.boneGlass || this == BlockHandler.burntGlass || this == BlockHandler.enderGlass || this == BlockHandler.fleshGlass || this == BlockHandler.icyGlass || this == BlockHandler.leatherGlass || this == BlockHandler.slimyGlass || this == BlockHandler.snowyGlass){
            if (iBlockAccess.getBlockMetadata(par2, par3, par4) != iBlockAccess.getBlockMetadata(par2 - Facing.offsetsXForSide[par5], par3 - Facing.offsetsYForSide[par5], par4 - Facing.offsetsZForSide[par5]))
            {
                return true;
            }

            if (block == this)
            {
                return false;
            }
        }

        return !this.field_149996_a && block == this ? false : super.shouldSideBeRendered(iBlockAccess, par2, par3, par4, par5);

    }
}

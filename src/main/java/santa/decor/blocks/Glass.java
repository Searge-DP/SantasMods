package santa.decor.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.Facing;
import net.minecraft.world.IBlockAccess;
import santa.decor.SantasDecor;

/**
 * @author SatanicSanta
 */
public class Glass extends Block {

    public Glass() {
        super(Material.glass);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(0.3F);
        this.setStepSound(Block.soundTypeGlass);
    }

    private void setBlockTextureName() {
        for (int i = 0; i < BlockHandler.familiesMain.length; i++) {
            this.setBlockTextureName("santasdecor:glass_" + BlockHandler.familiesMain[i]);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass() {
        return 1;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int side) {
        Block block = world.getBlock(x, y, z);

        if (world.getBlockMetadata(x, y, z) != world.getBlockMetadata(x -
          Facing.offsetsXForSide[side], y - Facing.offsetsYForSide[side], z -
          Facing.offsetsZForSide[side])) {
            return true;
        }

        if (block == this) {
            return false;
        }

        return block == this ? false : super.shouldSideBeRendered(world, x, y, z, side);
    }
}

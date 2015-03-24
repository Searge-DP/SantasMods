package santa.decor.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Facing;
import net.minecraft.world.IBlockAccess;
import santa.decor.SantasDecor;

import java.util.List;

/**
 * @author SatanicSanta
 */
public class Glass extends Block {

    public Glass() {
        super(Material.glass);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(0.3F);
        this.setStepSound(Block.soundTypeGlass);
        this.setBlockTextureName(textureName);
    }

    private String setTextureName() {
        for (int i = 0; i < BlockHandler.familiesMain.length; i++) {
            return textureName = ("santasdecor:glass_" + BlockHandler.familiesMain[i]);
        }
        return null;
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

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tabs, List subBlocks) {
        for (int i = 0; i < BlockHandler.familiesMain.length; i++) {
            subBlocks.add(new ItemStack(this, 1, i));
        }
    }
}

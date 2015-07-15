package santa.decor.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Facing;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import santa.decor.SantasDecor;

import java.util.List;

/**
 * @author SatanicSanta
 */
public class Glass extends Block {

    private IIcon[] texture;

    public Glass() {
        super(Material.rock);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setStepSound(Block.soundTypeGlass);
        this.setBlockName("glass");
    }

    @Override
    public void registerBlockIcons(IIconRegister ir) {
        texture = new IIcon[BlockHandler.familiesMain.length];
        for (int i = 0; i < texture.length; i++) {
            textureName = "santasdecor:glass_" + BlockHandler.familiesMain[i];
            texture[i] = ir.registerIcon(textureName);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        switch (meta) {
            case 0:
                return texture[0];
            case 1:
                return texture[1];
            case 2:
                return texture[2];
            case 3:
                return texture[3];
            case 4:
                return texture[4];
            case 5:
                return texture[5];
            case 6:
                return texture[6];
            case 7:
                return texture[7];
            case 8:
                return texture[8];
            case 9:
                return texture[9];
            case 10:
                return texture[10];
            case 11:
                return texture[11];
            case 12:
                return texture[12];
            case 13:
                return texture[13];
            case 14:
                return texture[14];
            case 15:
                return texture[15];
            default:
                return texture[0];
        }
    }

    @Override
    public int damageDropped(int meta){
        return meta;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
        for (int i = 0; i < texture.length; i++) {
            list.add(new ItemStack(item, 1, i));
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

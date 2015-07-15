package santa.chests;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

/**
 * @author SatanicSanta
 */
public class BlockSortedChest extends BlockContainer {

    public BlockSortedChest() {
        super(Material.rock);
        this.setBlockName("chest");
        this.setHardness(3.0F);
        this.setBlockBounds(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
        this.setCreativeTab(SortedChests.tabSortedChests);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int i) {
        return new TileEntitySortedChest();
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public int getRenderType() {
        return 22;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta) {
        return null; // TODO
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float hitX, float hitY, float hitZ) {
        if (world.isRemote) {
            if (world.getTileEntity(x, y, z) != null) {
                if (player.isSneaking()) {
                    player.openGui(SortedChests.instance, GUIs.CONFIG.ordinal(), world, x, y, z);
                } else {
                    player.openGui(SortedChests.instance, GUIs.INV.ordinal(), world, x, y, z);
                }
            }
        }
        return true;
    }
}

package santa.decor.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import santa.decor.SantasDecor;

import java.util.List;

/**
 * Created by elijahfoster-wysocki on 10/20/14.
 */
public class Logs extends BlockRotatedPillar {

    private static final String[] families = new String[]{"blaze", "bone", "burnt", "ender", "flesh", "ice", "leather", "slime", "snow"};
    private IIcon[] textures;
    private IIcon[] topTextures;

    public Logs(){
        super(Material.wood);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(2.0F);
        this.setStepSound(Block.soundTypeWood);
        this.setResistance(5.0F);
        this.setHarvestLevel("axe", 0);
    }

    @SideOnly(Side.CLIENT)
    public static IIcon endIcon;
    @SideOnly(Side.CLIENT)
    public static IIcon sideIcon;

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister icon){
        endIcon = icon.registerIcon("santasdecor:" + families + "logtop");

        sideIcon = icon.registerIcon("santasdecor:" + families + "log");
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

    @Override
    public void getSubBlocks(Item block, CreativeTabs creativeTabs, List list){
        for (int i = 0; i < 4; ++i){
            list.add(new ItemStack(this, 1, i));
        }
    }

    @Override
    public void breakBlock(World world, int x, int y, int z, Block block0, int par6){
        byte radius = 4;
        int bounds = radius + 1;

        if (world.checkChunksExist(x - bounds, y - bounds, z - bounds, x + bounds, y + bounds, z + bounds)){
            for (int i = -radius; i <= radius; ++i){
                for (int j = -radius; j <= radius; ++j){
                    for (int k = -radius; k <= radius; ++j){
                        Block block1 = world.getBlock(x + i, y + j, z + k);

                        if (block0.isLeaves(world, x, y, z)){
                            block0.beginLeavesDecay(world, x + i, y + j, z + k);
                        }
                    }
                }
            }
        }
    }

    @Override
    public int onBlockPlaced(World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int meta){
        int type = getTypeFromMeta(meta);
        byte orientation = 0;

        switch (side){
            case 0:
            case 1:
                orientation = 0;
                break;
            case 2:
            case 3:
                orientation = 8;
                break;
            case 4:
            case 5:
                orientation = 4;
        }
        return type | orientation;
    }

    @Override
    public boolean isFlammable(IBlockAccess world, int x, int y, int z, ForgeDirection face){
        return true;
    }

    @Override
    public int damageDropped(int meta){
        return getTypeFromMeta(meta);
    }

    @Override
    protected ItemStack createStackedBlock(int meta){
        return new ItemStack(this, 1, getTypeFromMeta(meta));
    }

    @Override
    public boolean isWood(IBlockAccess world, int x, int y, int z){
        return true;
    }

    public String getWoodType(int meta){
        return families[getTypeFromMeta(meta) * 4];
    }

    public static int getTypeFromMeta(int meta){
        return meta & 3;
    }
}

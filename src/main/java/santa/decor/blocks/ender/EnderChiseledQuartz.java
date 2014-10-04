package santa.decor.blocks.ender;

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
public class EnderChiseledQuartz extends Block {
    public EnderChiseledQuartz(){
        super(Material.rock);
        this.setBlockName(BlockInfo.ENDERCHISELEDQ_UNLOCALIZED_NAME);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setStepSound(Block.soundTypeStone);
    }

    @SideOnly(Side.CLIENT)
    public static IIcon endIcon;
    @SideOnly(Side.CLIENT)
    public static IIcon sideIcon;

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister icon){
        endIcon = icon.registerIcon("santasdecor:enderqchiseledtop");
        sideIcon = icon.registerIcon("santasdecor:enderqchiseled");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta){
        if(side == 0){
            return endIcon;
        }else if(side == 1){
            return endIcon;
        }else{
            return sideIcon;
        }
    }
}

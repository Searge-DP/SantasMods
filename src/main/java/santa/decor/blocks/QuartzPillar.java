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
import santa.decor.SantasDecor;

import java.util.List;

/**
 * @author SatanicSanta
 */
public class QuartzPillar extends BlockRotatedPillar {

    private IIcon[] topTexture;
    private IIcon[] sideTexture;

    public QuartzPillar() {
        super(Material.rock);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setStepSound(Block.soundTypeStone);
        this.setBlockName("pillar");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister ir) {
        sideTexture = new IIcon[BlockHandler.familiesQuartz.length];
        topTexture = new IIcon[BlockHandler.familiesQuartz.length];
        
        for (int i = 0; i < BlockHandler.familiesQuartz.length; i++) {
            topTexture[i] = ir.registerIcon("santasdecor:pillartop_" + BlockHandler.familiesQuartz[i]);
            sideTexture[i] = ir.registerIcon("santasdecor:pillar_" + BlockHandler.familiesQuartz[i]);
        }
    }

    @Override
    public IIcon getSideIcon(int par1) {
        for (int i = 0; i < BlockHandler.familiesQuartz.length; i++) {
            return sideTexture[i];
        }
        return null;
    }

    @Override
    public IIcon getTopIcon(int par1) {
        for (int i = 0; i < BlockHandler.familiesQuartz.length; i++) {
            return topTexture[i];
        }
        return null;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tabs, List subBlocks) {
        for (int i = 0; i < BlockHandler.familiesQuartz.length; i++) {
            subBlocks.add(new ItemStack(this, 1, i));
        }
    }
}

package santa.decor.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import santa.decor.SantasDecor;

import java.util.List;

public class QuartzChiseled extends Block {
    @SideOnly(Side.CLIENT)
    private IIcon[] topTexture = new IIcon[BlockHandler.familiesQuartz.size()];

    @SideOnly(Side.CLIENT)
    private IIcon[] sideTexture = new IIcon[BlockHandler.familiesQuartz.size()];

    public QuartzChiseled() {
        super(Material.rock);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setStepSound(Block.soundTypeStone);
        this.setBlockName("qchiseled");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister ir) {
        int i = 0;
        for (String s : BlockHandler.familiesMain) {
            topTexture[i] = ir.registerIcon("santasdecor:qchiseledtop_" + s);
            sideTexture[i] = ir.registerIcon("santasdecor:qchiseled_" + s);
            i++;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (side == 0) {
            return topTexture[meta];
        } else {
            return sideTexture[meta];
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tabs, List subBlocks) {
        for (int i = 0; i < BlockHandler.familiesQuartz.size(); i++) {
            subBlocks.add(new ItemStack(this, 1, i));
        }
    }
}

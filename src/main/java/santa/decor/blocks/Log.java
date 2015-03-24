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
public class Log extends BlockRotatedPillar {

    private IIcon[] sideTexture;
    private IIcon[] topTexture;

    public Log() {
        super(Material.wood);
        this.setHardness(2.0F);
        this.setStepSound(Block.soundTypeWood);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister ir) {
        sideTexture = new IIcon[BlockHandler.familiesMain.length];
        topTexture = new IIcon[BlockHandler.familiesMain.length];

        for (int i = 0; i < BlockHandler.familiesMain.length; i++) {
            sideTexture[i] = ir.registerIcon("santasdecor:log_" + BlockHandler.familiesMain[i]);
            topTexture[i] = ir.registerIcon("santasdecor:logtop_" + BlockHandler.familiesMain[i]);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getSideIcon(int i) {
        for (int it = 0; i < BlockHandler.familiesMain.length; i++) {
            return sideTexture[it];
        }
        return null;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getTopIcon(int i) {
        for (int it = 0; i < BlockHandler.familiesMain.length; i++) {
            return topTexture[it];
        }
        return null;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tabs, List subBlocks) {
        for (int i = 0; i < BlockHandler.familiesMain.length; i++) {
            subBlocks.add(new ItemStack(this, 1, i));
        }
    }
}

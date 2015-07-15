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
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setStepSound(Block.soundTypeStone);
        this.setBlockName("log");
    }

    @Override
    public void registerBlockIcons(IIconRegister ir) {
        sideTexture = new IIcon[BlockHandler.familiesMain.length];
        topTexture = new IIcon[BlockHandler.familiesMain.length];
        for (int i = 0; i < sideTexture.length; i++) {
            sideTexture[i] = ir.registerIcon("santasdecor:log_" + BlockHandler.familiesMain[i]);
            topTexture[i] = ir.registerIcon("santasdecor:logtop_" + BlockHandler.familiesMain[i]);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getSideIcon(int par1) {
        for (int i = 0; i < BlockHandler.familiesMain.length; i++) {
            return sideTexture[i];
        }
        return null;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getTopIcon(int par1) {
        for (int i = 0; i < BlockHandler.familiesMain.length; i++) {
            return topTexture[i];
        }
        return null;
    }

    @Override
    public int damageDropped(int meta){
        return meta;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
        for (int i = 0; i < BlockHandler.familiesMain.length; i++) {
            list.add(new ItemStack(item, 1, i));
        }
    }
}

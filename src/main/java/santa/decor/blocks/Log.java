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
import org.apache.commons.lang3.tuple.MutablePair;
import santa.decor.SantasDecor;

import java.util.HashMap;
import java.util.List;

public class Log extends Block {
    private IIcon[] sideTexture = new IIcon[BlockHandler.familiesMain.size()];
    private IIcon[] topTexture = new IIcon[BlockHandler.familiesMain.size()];

    public Log() {
        super(Material.wood);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setStepSound(Block.soundTypeStone);
        this.setBlockName("log");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister ir) {
        int i = 0;
        for (String s : BlockHandler.familiesMain) {
            sideTexture[i] = ir.registerIcon("santasdecor:log_" + s);
            topTexture[i] = ir.registerIcon("santasdecor:logtop_" + s);
            i++;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (side == 0 || side == 1) {
            return topTexture[meta];
        } else {
            return sideTexture[meta];
        }
    }

    @Override
    public int damageDropped(int meta){
        return meta;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
        for (int i = 0; i < BlockHandler.familiesMain.size(); i++) {
            list.add(new ItemStack(item, 1, i));
        }
    }
}

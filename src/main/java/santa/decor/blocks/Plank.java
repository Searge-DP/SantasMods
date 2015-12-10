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

public class Plank extends Block {
    @SideOnly(Side.CLIENT)
    private IIcon[] texture = new IIcon[BlockHandler.familiesMain.size()];

    public Plank() {
        super(Material.rock);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setStepSound(Block.soundTypeStone);
        this.setBlockName("plank");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister ir) {
        int i = 0;
        for (String s : BlockHandler.familiesMain) {
            texture[i] = ir.registerIcon("santasdecor:plank_" + s);
            i++;
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
}

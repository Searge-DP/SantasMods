package santa.decor.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import santa.decor.SantasDecor;

/**
 * @author SatanicSanta
 */
public class Quartz extends Block {

    public Quartz() {
        super(Material.rock);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setStepSound(Block.soundTypeStone);
    }

    private IIcon topIcon;
    private IIcon bottomIcon;
    private IIcon sideIcon;

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister ir) {
        for (int i = 0; i < BlockHandler.familiesQuartz.length; i++) {
            topIcon = ir.registerIcon("santasdecor:quartztop_" + BlockHandler.familiesQuartz[i]);
            bottomIcon = ir.registerIcon("santasdecor:quartzbottom_" + BlockHandler.familiesQuartz[i]);
            sideIcon = ir.registerIcon("santasdecor:quartzside_" + BlockHandler.familiesQuartz[i]);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (side == 1) {
            return topIcon;
        }
        if (side == 0) {
            return bottomIcon;
        }
        return sideIcon;
    }
}

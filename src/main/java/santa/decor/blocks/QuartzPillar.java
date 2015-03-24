package santa.decor.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import santa.decor.SantasDecor;

/**
 * @author SatanicSanta
 */
public class QuartzPillar extends BlockRotatedPillar {

    private IIcon topIcon;
    private IIcon sideIcon;

    public QuartzPillar() {
        super(Material.rock);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setStepSound(Block.soundTypeStone);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister ir) {
        for (int i = 0; i < BlockHandler.familiesQuartz.length; i++) {
            topIcon = ir.registerIcon("santasdecor:pillartop_" + BlockHandler.familiesQuartz[i]);
            sideIcon = ir.registerIcon("santasdecor:pillar_" + BlockHandler.familiesQuartz[i]);
        }
    }

    @Override
    public IIcon getSideIcon(int i) {
        return sideIcon;
    }

    @Override
    public IIcon getTopIcon(int i) {
        return topIcon;
    }
}

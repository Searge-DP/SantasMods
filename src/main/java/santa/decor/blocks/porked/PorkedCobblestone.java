package santa.decor.blocks.porked;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import santa.decor.SantasDecor;
import santa.decor.blocks.BlockInfo;

/**
 * Created by elijahfoster-wysocki on 7/14/14.
 */
public class PorkedCobblestone extends Block{

    public PorkedCobblestone(){
        super(Material.rock);
        this.setBlockName(BlockInfo.PORKEDCOBBLE_UNLOCALIZED_NAME);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(2.0F);
        this.setResistance(10.0F);
        this.setStepSound(Block.soundTypeStone);
        this.setBlockTextureName("santasdecor:porkedcobble");
    }
}

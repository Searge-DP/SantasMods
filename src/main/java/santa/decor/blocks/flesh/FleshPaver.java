package santa.decor.blocks.flesh;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import santa.decor.SantasDecor;
import santa.decor.blocks.BlockInfo;

/**
 * Created by elijahfoster-wysocki on 9/17/14.
 */
public class FleshPaver extends Block {

    public FleshPaver(){
        super(Material.rock);
        this.setBlockName(BlockInfo.FLESHPAVER_UNLOCALIZED_NAME);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setStepSound(Block.soundTypeStone);
        this.setBlockTextureName("santasdecor:fleshpaver");
    }
}
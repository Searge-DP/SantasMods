package santa.decor.blocks.burnt;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import santa.decor.SantasDecor;
import santa.decor.blocks.BlockInfo;

/**
 * Created by elijahfoster-wysocki on 9/17/14.
 */
public class BurntPaver extends Block {

    public BurntPaver(){
        super(Material.rock);
        this.setBlockName(BlockInfo.BURNTPAVER_UNLOCALIZED_NAME);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setStepSound(Block.soundTypeStone);
        this.setBlockTextureName("santasdecor:burntpaver");
    }
}
package santa.decor.blocks.burnt;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import santa.decor.SantasDecor;
import santa.decor.blocks.BlockInfo;

/**
 * Created by elijahfoster-wysocki on 7/14/14.
 */
public class BurntBrick extends Block{

    public BurntBrick(){
        super(Material.rock);
        this.setBlockName(BlockInfo.BURNTBRICK_UNLOCALIZED_NAME);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(0.5F);
        this.setResistance(4.0F);
        this.setStepSound(Block.soundTypeStone);
        this.setBlockTextureName("santasdecor:burntbricks");
    }
}

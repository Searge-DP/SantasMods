package santa.decor.blocks.burnt;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import santa.decor.SantasDecor;
import santa.decor.blocks.BlockInfo;

/**
 * Created by elijahfoster-wysocki on 7/14/14.
 */
public class BurntPlank extends Block {

    public BurntPlank(){
        super(Material.wood);
        this.setBlockName(BlockInfo.BURNTPLANK_UNLOCALIZED_NAME);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(2.0F);
        this.setStepSound(Block.soundTypeWood);
        this.setBlockTextureName("santasdecor:burntplank");
    }
}

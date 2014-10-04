package santa.decor.blocks.leather;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import santa.decor.SantasDecor;
import santa.decor.blocks.BlockInfo;

/**
 * Created by elijahfoster-wysocki on 7/28/14.
 */
public class LeatherPlank extends Block{

    public LeatherPlank(){
        super(Material.wood);
        this.setBlockName(BlockInfo.LEATHERPLANK_UNLOCALIZED_NAME);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(2.0F);
        this.setStepSound(Block.soundTypeWood);
        this.setBlockTextureName("santasdecor:leatherplank");
    }

}

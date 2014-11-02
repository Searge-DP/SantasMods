package santa.decor.blocks.porked;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import santa.decor.SantasDecor;
import santa.decor.blocks.BlockInfo;

/**
 * Created by elijahfoster-wysocki on 7/14/14.
 */
public class PorkedPlank extends Block{

    public PorkedPlank(){
        super(Material.wood);
        this.setBlockName(BlockInfo.PORKEDPLANK_UNLOCALIZED_NAME);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(2.0F);
        this.setStepSound(Block.soundTypeWood);
        this.setBlockTextureName("santasdecor:porkedplank");
    }
}

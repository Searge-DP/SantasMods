package santa.decor.blocks.ice;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import santa.decor.SantasDecor;
import santa.decor.blocks.BlockInfo;

/**
 * Created by elijahfoster-wysocki on 7/20/14.
 */
public class IcyPlank extends Block{

    public IcyPlank(){
        super(Material.wood);
        this.setBlockName(BlockInfo.ICEPLANK_UNLOCALIZED_NAME);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(2.0F);
        this.setStepSound(Block.soundTypeWood);
        this.setBlockTextureName("santasdecor:icyplank");
    }

}

package santa.decor.blocks.blaze;

import net.minecraft.block.material.Material;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import santa.decor.SantasDecor;
import santa.decor.blocks.BlockInfo;

/**
 * Created by elijahfoster-wysocki on 7/14/14.
 */
public class BlazeBrick extends Block{

    public BlazeBrick(){
        super(Material.rock);
        this.setBlockName(BlockInfo.BLAZEBRICK_UNLOCALIZED_NAME);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setStepSound(Block.soundTypeStone);
        this.setBlockTextureName("santasdecor:blazebrick");
    }
}

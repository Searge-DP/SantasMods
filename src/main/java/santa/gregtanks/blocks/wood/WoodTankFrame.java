package santa.gregtanks.blocks.wood;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import santa.gregtanks.GregTanks;
import santa.gregtanks.blocks.BlockInfo;

/**
 * Created by elijahfoster-wysocki on 9/22/14.
 */
public class WoodTankFrame extends Block {

    public WoodTankFrame(){
        super(Material.wood);
        this.setBlockTextureName("gregtanks:woodtankframe");
        this.setResistance(10.0F);
        this.setBlockName(BlockInfo.WOODTANKFRAME_UNLOCALIZED_NAME);
        this.setCreativeTab(GregTanks.tabGregTanks);
        this.setStepSound(soundTypeWood);
        this.setHardness(1.5F);
    }
}

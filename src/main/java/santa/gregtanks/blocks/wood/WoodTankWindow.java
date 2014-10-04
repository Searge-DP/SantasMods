package santa.gregtanks.blocks.wood;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import santa.gregtanks.GregTanks;
import santa.gregtanks.blocks.BlockInfo;

/**
 * Created by elijahfoster-wysocki on 9/22/14.
 */
public class WoodTankWindow extends Block {

    public WoodTankWindow(){
        super(Material.wood);
        this.setBlockTextureName("gregtanks:woodtankwindow");
        this.setResistance(10.0F);
        this.setBlockName(BlockInfo.WOODTANKWINDOW_UNLOCALIZED_NAME);
        this.setCreativeTab(GregTanks.tabGregTanks);
        this.setStepSound(soundTypeGlass);
        this.setHardness(1.5F);
    }

    @Override
    public boolean isOpaqueCube(){
        return false;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 1;
    }
}

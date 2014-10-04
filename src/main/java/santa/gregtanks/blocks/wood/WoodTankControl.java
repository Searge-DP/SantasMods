package santa.gregtanks.blocks.wood;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import santa.gregtanks.GregTanks;
import santa.gregtanks.blocks.BlockInfo;
import santa.gregtanks.tileentity.TileEntityWood;

/**
 * Created by elijahfoster-wysocki on 9/22/14.
 */
public class WoodTankControl extends Block {

    public WoodTankControl(){
        super(Material.iron);
        this.setBlockTextureName("gregtanks:woodtankcontrol");
        this.setResistance(10.0F);
        this.setBlockName(BlockInfo.WOODTANKCONTROL_UNLOCALIZED_NAME);
        this.setCreativeTab(GregTanks.tabGregTanks);
        this.setStepSound(soundTypeMetal);
        this.setHardness(1.5F);
    }

    public TileEntity createNewTileEntity(World world, int meta){
        return new TileEntityWood();
    }
}

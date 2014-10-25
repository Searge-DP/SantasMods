package santa.resurrection.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by elijahfoster-wysocki on 10/25/14.
 */
public class Trophy extends BlockContainer {

    public Trophy(){
        super(Material.iron);
        this.setBlockName("trophy");
        this.setHardness(5.0F);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setResistance(5.0F);
        this.setStepSound(Block.soundTypeMetal);
        this.setBlockTextureName("minecraft:gold_block");
    }

    @Override
    public TileEntity createNewTileEntity(World var1, int var2){
        return new TileEntityTrophyMulti();
    }


}

package santa.decor.blocks.misc;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import santa.decor.SantasDecor;
import santa.decor.blocks.BlockInfo;
import santa.decor.tileentity.TileEntityPumpkin;

public class Pumpkin extends Block {
    public Pumpkin() {
        super(Material.wood);
        this.setBlockName(BlockInfo.PUMPKIN_UNLOCALIZED_NAME);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(1F);
        this.setStepSound(Block.soundTypeWood);
        this.setLightLevel(1F);
    }

    @Override
    public TileEntity createTileEntity(World world, int meta){
        return new TileEntityPumpkin();
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }
}

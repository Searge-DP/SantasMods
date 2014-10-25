package santa.resurrection.block;

import net.minecraft.tileentity.TileEntity;

/**
 * Created by elijahfoster-wysocki on 10/25/14.
 */
public class TileEntityTrophy extends TileEntity {

    private int levels = -1;

    public TileEntityTrophy(){
        super();
    }

    public void update(){
        this.markDirty();
        worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
    }

    @Override
    public void updateEntity(){
        int x = this.xCoord;
        int y = this.yCoord;
        int z = this.zCoord;
        int i = this.levels;

        if (this.worldObj.getBlock(x + 1, y, z).equals(BlockHandler.trophy))
        {
            if (this.worldObj.getBlock(x, y, z + 1).equals(BlockHandler.trophy))
            {
                if (this.worldObj.getBlock(x + 1, y, z + 1).equals(BlockHandler.trophy))
                {
                    if (this.worldObj.getBlock(x - 1, y, z + 1).equals(BlockHandler.trophy))
                    {
                        if (this.worldObj.getBlock(x, y + 1, z).equals(BlockHandler.trophy))
                        {
                            if (this.worldObj.getBlock(x + 1, y + 1, z).equals(BlockHandler.trophy))
                            {
                                if (this.worldObj.getBlock(x, y + 1, z + 1).equals(BlockHandler.trophy))
                                {
                                    if (this.worldObj.getBlock(x + 1, y + 1, z + 1).equals(BlockHandler.trophy))
                                    {
                                        if (this.worldObj.getBlock(x - 1, y + 1, z + 1).equals(BlockHandler.trophy)){
                                            this.worldObj.setTileEntity(x, y, z, new TileEntityTrophyMulti());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

package santa.gregtanks.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import santa.gregtanks.blocks.BlockHandler;

/**
 * Created by elijahfoster-wysocki on 9/22/14.
 */
public class TileEntityWood extends TileEntity {
    public static final int updateRate = 100;

    public TileEntityWood(){
        super();
    }

    public void update(){
        this.markDirty();
        worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
    }

    @Override
    public Packet getDescriptionPacket(){
        NBTTagCompound nbtTag = new NBTTagCompound();
        writeToNBT(nbtTag);
        return new S35PacketUpdateTileEntity(xCoord, yCoord, zCoord, 1, nbtTag);
    }

    @Override
    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt){
        readFromNBT(pkt.func_148857_g());
    }

    @Override
    public void updateEntity()
    {
        int x = this.xCoord;
        int y = this.yCoord;
        int z = this.zCoord;

        if (this.worldObj.isRemote)
        {
            if (this.worldObj.getBlock(x + 1, y, z).equals(BlockHandler.woodTankFrame) && this.worldObj.getBlock(x - 1, y, z).equals(BlockHandler.woodTankFrame))
            {
                if (this.worldObj.getBlock(x, y, z + 1).equals(BlockHandler.woodTankFrame) && this.worldObj.getBlock(x, y, z - 1).equals(BlockHandler.woodTankFrame))
                {
                    if (this.worldObj.getBlock(x + 1, y, z + 1).equals(BlockHandler.woodTankFrame) && this.worldObj.getBlock(x - 1, y, z - 1).equals(BlockHandler.woodTankFrame))
                    {
                        if (this.worldObj.getBlock(x - 1, y, z + 1).equals(BlockHandler.woodTankFrame) && this.worldObj.getBlock(x + 1, y, z - 1).equals(BlockHandler.woodTankFrame))
                        {
                            if (this.worldObj.getBlock(x, y + 1, z).equals(BlockHandler.woodTankFrame))
                            {
                                if (this.worldObj.getBlock(x + 1, y + 1, z).equals(BlockHandler.woodTankWindow) && this.worldObj.getBlock(x - 1, y + 1, z).equals(BlockHandler.woodTankWindow))
                                {
                                    if (this.worldObj.getBlock(x, y + 1, z + 1).equals(BlockHandler.woodTankWindow) && this.worldObj.getBlock(x, y + 1, z - 1).equals(BlockHandler.woodTankWindow))
                                    {
                                        if (this.worldObj.getBlock(x + 1, y + 1, z + 1).equals(BlockHandler.woodTankWindow) && this.worldObj.getBlock(x - 1, y + 1, z - 1).equals(BlockHandler.woodTankWindow))
                                        {
                                            if (this.worldObj.getBlock(x - 1, y + 1, z + 1).equals(BlockHandler.woodTankWindow) && this.worldObj.getBlock(x + 1, y + 1, z - 1).equals(BlockHandler.woodTankWindow))
                                            {
                                                if (this.worldObj.getBlock(x, y + 2, z).equals(BlockHandler.woodTankFrame))
                                                {
                                                    if (this.worldObj.getBlock(x + 1, y + 2, z).equals(BlockHandler.woodTankFrame) && this.worldObj.getBlock(x - 1, y + 2, z).equals(BlockHandler.woodTankFrame))
                                                    {
                                                        if (this.worldObj.getBlock(x, y + 2, z + 1).equals(BlockHandler.woodTankFrame) && this.worldObj.getBlock(x, y + 2, z - 1).equals(BlockHandler.woodTankFrame))
                                                        {
                                                            if (this.worldObj.getBlock(x + 1, y + 2, z + 1).equals(BlockHandler.woodTankFrame) && this.worldObj.getBlock(x - 1, y + 2, z - 1).equals(BlockHandler.woodTankFrame))
                                                            {
                                                                if (this.worldObj.getBlock(x - 1, y + 2, z + 1).equals(BlockHandler.woodTankFrame) && this.worldObj.getBlock(x + 1, y + 2, z - 1).equals(BlockHandler.woodTankFrame))
                                                                {
                                                                    this.worldObj.setTileEntity(x, y, z, new TileEntityWood());
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
                    }
                }
            }
        }

    }

}

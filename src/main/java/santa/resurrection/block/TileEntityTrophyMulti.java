package santa.resurrection.block;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by elijahfoster-wysocki on 10/25/14.
 */
public class TileEntityTrophyMulti extends TileEntity {


    private int x, y, z;

    @Override
    public  void updateEntity(){
        super.updateEntity();
    }

    public void reset(){
        x = 0;
        y = 0;
        z = 0;
    }

    public boolean checkFor(){
        TileEntity tile = worldObj.getTileEntity(x, y, z);
        return (tile != null && (tile instanceof TileEntityTrophyMulti));
    }

    @Override
    public void writeToNBT(NBTTagCompound nbt){
        nbt.setString("id", "TileEntityCombustionGeneratorMulti");
        nbt.setInteger("x", this.xCoord);
        nbt.setInteger("y", this.yCoord);
        nbt.setInteger("z", this.zCoord);
    }

    @Override
    public void readFromNBT(NBTTagCompound nbt){
        super.readFromNBT(nbt);
    }
}

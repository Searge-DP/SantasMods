package santa.resurrection.block;

import net.minecraft.entity.item.EntityFireworkRocket;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import santa.resurrection.LogHelper;

/**
 * Created by elijahfoster-wysocki on 10/25/14.
 */
public class TileEntityTrophyMulti extends TileEntity {


    private int x, y, z;
    private double motionX, motionY, motionZ;
    private boolean wiresProvidePower;


    @Override
    public  void updateEntity(){
        super.updateEntity();
    }

    public void onChange(EntityFireworkRocket rocket, EntityPlayer player, World world){

        /*
        ItemStack itemstack = EntityFireworkRocket.dataWatcher.getWatchableObjectItemStack(8);
        NBTTagCompound nbttag = null;

        nbttag = itemstack.getTagCompound().getCompoundTag("Fireworks");
        */

        rocket.posX = player.posX;
        rocket.posY = player.posY + 1.0D;
        rocket.posZ = player.posZ;

        if(world.isBlockIndirectlyGettingPowered(x, y, z)){
            //this.worldObj.makeFireworks(this.x, this.y, this.z, this.motionX, this.motionY, this.motionZ, nbttag);
            world.spawnEntityInWorld(rocket);
            LogHelper.info("TE activated");
        }
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
        nbt.setString("id", "TileEntityTrophyMulti");
        nbt.setInteger("x", this.xCoord);
        nbt.setInteger("y", this.yCoord);
        nbt.setInteger("z", this.zCoord);
    }

    @Override
    public void readFromNBT(NBTTagCompound nbt){
        super.readFromNBT(nbt);
    }
}

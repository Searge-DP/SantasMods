package santa.toys.entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

/**
 * @author SatanicSanta
 */
public class EntitySapling extends EntityThrowable {

    private static final String __OBFID = "CL_00001722";

    public EntitySapling(World par1){
        super(par1);
        this.setSize(0.25F, 0.25F);
    }

    public EntitySapling(World par1, EntityPlayer par3EntityPlayer){
        super(par1, par3EntityPlayer);
    }

    public EntitySapling(World par1, double par2, double par3, double par4){
        super(par1, par2, par3, par4);
    }

    @Override
    protected void onImpact(MovingObjectPosition movingobjpos){

    }

    protected float getGravityVelocity()
    {
        return 0.01F;
    }

    @SideOnly(Side.CLIENT)
    public float getShadowSize()
    {
        return 0.2F;
    }
}

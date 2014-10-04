package santa.gregtanks.entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

/**
 * Created by elijahfoster-wysocki on 9/20/14.
 */
public class GregBomb extends EntityThrowable {

    private int explosionRadius = 1; //make this configurable

    public GregBomb(World par1){
        super(par1);
        this.setSize(0.25F, 0.25F);
    }

    public GregBomb(World par1, EntityPlayer par3EntityPlayer){
        super(par1, par3EntityPlayer);
    }

    public GregBomb(World par1, double par2, double par3, double par4){
        super(par1, par2, par3, par4);
    }

    @Override
    protected void onImpact(MovingObjectPosition movingobjpos){
        if (movingobjpos.entityHit != null)
        {
            byte b0 = 5;

            if (movingobjpos.entityHit instanceof EntityWither)
            {
                b0 = 10;
            }

            movingobjpos.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)b0);
        }
        this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, (float)this.explosionRadius, true);
        this.setDead();
    }

    protected float getGravityVelocity()
    {
        return 100F;
    }

    @SideOnly(Side.CLIENT)
    public float getShadowSize()
    {
        return 15.0F;
    }
}

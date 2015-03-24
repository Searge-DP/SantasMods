package santa.toys.entity;

import net.minecraft.dispenser.BehaviorProjectileDispense;
import net.minecraft.dispenser.IPosition;
import net.minecraft.entity.IProjectile;
import net.minecraft.tileentity.TileEntityDispenser;
import net.minecraft.world.World;

/**
 * @author SatanicSanta
 */
public class DispenserBehaviorNether extends BehaviorProjectileDispense {

    @Override
    protected IProjectile getProjectileEntity(World world, IPosition pos) {
        return new EntityNetherStarBlast(world);
    }
}

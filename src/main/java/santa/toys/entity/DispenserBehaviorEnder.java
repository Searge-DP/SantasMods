package santa.toys.entity;

import net.minecraft.dispenser.BehaviorProjectileDispense;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.dispenser.IPosition;
import net.minecraft.entity.IProjectile;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityDispenser;
import net.minecraft.world.World;
import santa.toys.items.ItemHandler;

/**
 * @author SatanicSanta
 */
public class DispenserBehaviorEnder extends BehaviorProjectileDispense {

    @Override
    public ItemStack dispenseStack(IBlockSource source, ItemStack stack) {
        return stack;
    }

    @Override
    protected IProjectile getProjectileEntity(World world, IPosition pos) {
        return new EntityEnderBlast(world, pos.getX(), pos.getY(), pos.getZ());
    }
}

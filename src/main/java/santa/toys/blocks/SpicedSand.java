package santa.toys.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import santa.toys.SantasToys;

/**
 * @author Eli Foster
 */
public class SpicedSand extends Block {
    public SpicedSand() {
        super(Material.sand);
        this.setBlockName(BlockInfo.SAND_UNLOCALIZED_NAME);
        this.setCreativeTab(SantasToys.tabSantasToys);
        this.setStepSound(Block.soundTypeSand);
        this.setHardness(0.6F);
        this.setBlockTextureName("minecraft:spicedsand");
    }

    @Override
    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
        if (entity instanceof EntityLivingBase) {
            int damage = 1;
            entity.setFire(1);
            if (entity.fallDistance > 0) {
                damage += ((entity.fallDistance) * 1.5 + 2);
            }
            entity.attackEntityFrom(DamageSource.onFire, damage);
            ((EntityLivingBase) entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 20, 1));
        }
    }
}

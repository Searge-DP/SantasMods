package santa.toys.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import santa.toys.Config;

import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import santa.toys.SantasToys;

/**
 * @author Eli Foster
 */
public class SpicedSand extends Block {
    private static PotionEffect slowness = new PotionEffect(Potion.moveSlowdown.id, 20, 1);
    private static float damage = (float) Config.damageDealtBySand;
    public SpicedSand() {
        super(Material.sand);
        this.setBlockName(BlockInfo.SAND_UNLOCALIZED_NAME);
        this.setCreativeTab(SantasToys.tabSantasToys);
        this.setStepSound(Block.soundTypeSand);
        this.setHardness(0.6F);
        this.setBlockTextureName("santastoys:spicedsand");
    }

    @Override
    public boolean isCollidable() {
        return true;
    }

    @Override
    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
        System.out.println("HHHHHHHHHHHHHHHHHH");
        damageEntity(entity, DamageSource.cactus, damage, world, x, y, z);
        poisonEntity(entity, slowness, world);
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float hitX, float hitY, float hitZ) {
        if (player.getCurrentEquippedItem() == null) {
            damageEntity(player, DamageSource.cactus, damage, world, x, y, z);
            return true;
        } else {
            return false;
        }
    }

    private void damageEntity(Entity entity, DamageSource damageSource, float damage, World world, int x, int y, int z) {
        System.out.println("KKKKKKKKKKKKKKKKKK");
        if (entity instanceof EntityLivingBase) {
            if (!world.isRemote) {
                System.out.println("LLLLLLLLLLLLLL");
                entity.setFire(1);
                entity.attackEntityFrom(damageSource, damage);
            }

            System.out.println("ZZZZZZZZZZZZZ");
            world.spawnParticle("largesmoke", x, y, z, 0.0D, 0.0D, 0.0D);
        }
    }

    private void poisonEntity(Entity entity, PotionEffect potion, World world) {
        System.out.println("LLLLLLLLLLLLLLLLL");
        if (entity instanceof EntityLivingBase && !world.isRemote) {
            ((EntityLivingBase) entity).addPotionEffect(potion);
        }
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        return AxisAlignedBB.getBoundingBox((float) x, y, (float) z, (float) (x + 1), (float) (y + 1), (float) (z + 1));
    }
}

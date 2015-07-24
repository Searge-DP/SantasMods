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
import santa.toys.SantasToys;

/**
 * @author Eli Foster
 */
public class SpicedSand extends Block {

    private static PotionEffect slowness = new PotionEffect(Potion.moveSlowdown.id, 20, 1);
    private static int damage = Config.damageDealtBySand;
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
        if (!(entity instanceof EntityItem)) {
            damageEntity(entity, DamageSource.cactus, damage, world, slowness, x, y, z);
        }
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float hitX, float hitY, float hitZ) {
        if (player.getCurrentEquippedItem() == null) {
            damageEntity(player, DamageSource.cactus, damage, world, slowness, x, y, z);
            return true;
        } else {
            return false;
        }
    }

    private void damageEntity(Entity entity, DamageSource damageSource, int damage, World world, PotionEffect potion, int x, int y, int z) {
        entity.setFire(1);
        entity.attackEntityFrom(damageSource, damage); //Generic to allow for more mobs
        ((EntityLivingBase) entity).addPotionEffect(potion);
        world.spawnParticle("largesmoke", x, y, z, 0.0D, 1.0D, 0.0D);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        return AxisAlignedBB.getBoundingBox((float) x, y, (float) z, (float) (x + 1), (float) (y + 1), (float) (z + 1));
    }
}

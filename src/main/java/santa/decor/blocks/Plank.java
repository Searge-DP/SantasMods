package santa.decor.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import santa.decor.SantasDecor;

import java.util.List;

/**
 * @author SatanicSanta
 */
public class Plank extends Block {

    public Plank() {
        super(Material.wood);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(2.0F);
        this.setStepSound(Block.soundTypeWood);
        this.setBlockTextureName(textureName);
    }

    private String setTextureName() {
        for (int i = 0; i < BlockHandler.familiesMain.length; i++) {
            return textureName = "santasdecor:plank_" + BlockHandler.familiesMain[i];
        }
        return null;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tabs, List subBlocks) {
        for (int i = 0; i < BlockHandler.familiesMain.length; i++) {
            subBlocks.add(new ItemStack(this, 1, i));
        }
    }
}

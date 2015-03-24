package santa.decor.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import santa.decor.SantasDecor;

/**
 * @author SatanicSanta
 */
public class Chiseled extends Block {

    public Chiseled() {
        super(Material.rock);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setStepSound(Block.soundTypeStone);
        this.setBlockTextureName(textureName);
    }

    private String setTextureName() {
        for (int i = 0; i < BlockHandler.familiesMain.length; i++) {
            return textureName = "santasdecor:chiseled_" + BlockHandler.familiesMain[i];
        }
        return null;
    }
}

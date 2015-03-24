package santa.decor.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import santa.decor.SantasDecor;

/**
 * @author SatanicSanta
 */
public class Brick extends Block {

    public Brick() {
        super(Material.rock);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setStepSound(Block.soundTypeStone);
        this.setBlockTextureName(textureName);
    }

    private String setTextureName() {
        for (int i = 0; i < BlockHandler.familiesMain.length; i++) {
            return textureName = "santasdecor:brick_" + BlockHandler.familiesMain[i];
        }
        return null;
    }
}

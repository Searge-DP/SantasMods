package santa.decor.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import santa.decor.SantasDecor;

/**
 * @author SatanicSanta
 */
public class Paver extends Block {

    private String[] textureName;

    public Paver() {
        super(Material.rock);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setStepSound(Block.soundTypeStone);
    }

    private void setTextureName() {
        for (int i = 0; i < BlockHandler.familiesMain.length; i++) {
            textureName[i] = "santasdecor:paver_" + BlockHandler.familiesMain[i];
            this.setBlockTextureName(textureName[i]);
        }
    }
}

package santa.decor.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import santa.decor.SantasDecor;

/**
 * @author SatanicSanta
 */
public class Plank extends Block {

    private String[] textureName;

    public Plank() {
        super(Material.wood);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(2.0F);
        this.setStepSound(Block.soundTypeWood);
    }

    private void setTextureName() {
        for (int i = 0; i < BlockHandler.familiesMain.length; i++) {
            textureName[i] = "santasdecor:plank_" + BlockHandler.familiesMain[i];
            this.setBlockTextureName(textureName[i]);
        }
    }
}

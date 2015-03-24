package santa.decor.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import santa.decor.SantasDecor;

/**
 * @author SatanicSanta
 */
public class Cobblestone extends Block {

    private static final String[] families = {
            "blaze",   //0
            "bone",    //1
            "burnt",   //2
            "crying",  //3
            "ender",   //4
            "flesh",   //5
            "ice",     //6
            "leather", //7
            "porked",  //8
            "slime",   //9
            "snow"     //10
    };

    private String[] textureName;

    public Cobblestone() {
        super(Material.rock);
        this.setCreativeTab(SantasDecor.tabSantasDecor);
        this.setHardness(2.0F);
        this.setResistance(1.0F);
        this.setStepSound(Block.soundTypeStone);
    }

    private void setTextureName() {
        for (int i = 0; i < families.length; i++) {
            textureName[i] = "santasdecor:cobblestone_" + families[i];
            this.setBlockTextureName(textureName[i]);
        }
    }
}

package santa.decor.blocks.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

/**
 * @author SatanicSanta
 */
public class ItemBlockCobblestone extends ItemBlock {

    public ItemBlockCobblestone(Block block) {
        super(block);
        this.setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int meta) {
        return meta;
    }
}

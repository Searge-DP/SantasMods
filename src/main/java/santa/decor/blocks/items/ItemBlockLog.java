package santa.decor.blocks.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

/**
 * @author SatanicSanta
 */
public class ItemBlockLog extends ItemBlock {

    public ItemBlockLog(Block block) {
        super(block);
        this.setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int meta) {
        return meta;
    }
}

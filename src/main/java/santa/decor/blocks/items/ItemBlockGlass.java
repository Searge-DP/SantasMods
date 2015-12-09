package santa.decor.blocks.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import santa.decor.blocks.BlockHandler;

public class ItemBlockGlass extends ItemBlock {
    public ItemBlockGlass(Block block) {
        super(block);
        this.setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int meta) {
        return meta;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return getUnlocalizedName() + "." + BlockHandler.familiesMain.get(stack.getItemDamage());
    }
}

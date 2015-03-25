package santa.decor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import santa.decor.blocks.BlockHandler;

/**
 * @author SatanicSanta
 */
public class SantasDecorTab extends CreativeTabs {

    public SantasDecorTab(String tabLabel) {
        super(tabLabel);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
        return new ItemStack(BlockHandler.brick, 1, 9).getItem();
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }

}
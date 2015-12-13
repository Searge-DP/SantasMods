package santa.freedom;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import santa.freedom.items.ItemHandler;

public class FreedomTab extends CreativeTabs {
    public FreedomTab(String tabLabel) {
        super(tabLabel);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
        return new ItemStack(ItemHandler.freedomComponent, 1, 0).getItem();
    }

    @Override
    public boolean hasSearchBar(){
        return true;
    }
}
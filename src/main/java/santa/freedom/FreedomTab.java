package santa.freedom;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import santa.freedom.items.ItemHandler;

/**
 * Created by elijahfoster-wysocki on 7/29/14.
 */
public class FreedomTab extends CreativeTabs {

    public FreedomTab(String tabLabel)
    {
        super(tabLabel);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem()
    {
        return ItemHandler.flag;
    }

}
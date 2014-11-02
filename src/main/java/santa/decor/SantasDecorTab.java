package santa.decor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import santa.decor.blocks.BlockHandler;

/**
 * Created by elijahfoster-wysocki on 7/29/14.
 */
public class SantasDecorTab extends CreativeTabs {

    public SantasDecorTab(String tabLabel)
    {
        super(tabLabel);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem()
    {
        return Item.getItemFromBlock(BlockHandler.slimyBrick);
    }

    @Override
    public boolean hasSearchBar(){
        return true;
    }

}
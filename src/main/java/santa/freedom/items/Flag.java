package santa.freedom.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import santa.freedom.Freedom;

/**
 * Created by elijahfoster-wysocki on 7/20/14.
 */
public class Flag extends Item {

    public Flag() {
        super();
        this.setTextureName("santafreedom:flag");
        this.setUnlocalizedName(ItemInfo.FLAG_UNLOCALIZED_NAME);
        this.setCreativeTab(Freedom.tabFreedom);
    }

}
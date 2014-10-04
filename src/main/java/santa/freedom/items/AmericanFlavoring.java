package santa.freedom.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import santa.freedom.Freedom;

/**
 * Created by elijahfoster-wysocki on 7/20/14.
 */
public class AmericanFlavoring extends Item {

    public AmericanFlavoring() {
        super();
        this.setTextureName("santafreedom:flavoring");
        this.setUnlocalizedName(ItemInfo.FLAVOR_UNLOCALIZED_NAME);
        this.setCreativeTab(Freedom.tabFreedom);
    }

}

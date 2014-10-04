package santa.freedom.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import santa.freedom.Freedom;

/**
 * Created by elijahfoster-wysocki on 7/20/14.
 */
public class FreedomBucket extends Item {

    public FreedomBucket(){
        super();
        this.setMaxStackSize(64);
        this.setTextureName("santafreedom:freedombucket");
        this.setCreativeTab(Freedom.tabFreedom);
        this.setUnlocalizedName(ItemInfo.BUCKET_UNLOCALIZED_NAME);

    }
}
package santa.freedom.items;

import net.minecraft.item.Item;
import santa.freedom.Freedom;

public class FreedomBucket extends Item {
    public FreedomBucket() {
        super();
        this.setMaxStackSize(64);
        this.setTextureName("santafreedom:freedombucket");
        this.setCreativeTab(Freedom.tabFreedom);
        this.setUnlocalizedName(ItemInfo.BUCKET_UNLOCALIZED_NAME);
    }
}
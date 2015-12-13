package santa.freedom.items;

import net.minecraft.item.Item;
import santa.freedom.Freedom;

public class Flag extends Item {
    public Flag() {
        super();
        this.setTextureName("santafreedom:flag");
        this.setUnlocalizedName(ItemInfo.FLAG_UNLOCALIZED_NAME);
        this.setCreativeTab(Freedom.tabFreedom);
    }

}
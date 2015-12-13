package santa.freedom.items;

import net.minecraft.item.Item;
import santa.freedom.Freedom;

public class AmericanFlavoring extends Item {
    public AmericanFlavoring() {
        super();
        this.setTextureName("santafreedom:flavoring");
        this.setUnlocalizedName(ItemInfo.FLAVOR_UNLOCALIZED_NAME);
        this.setCreativeTab(Freedom.tabFreedom);
    }
}

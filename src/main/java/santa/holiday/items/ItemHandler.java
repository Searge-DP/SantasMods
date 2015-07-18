package santa.holiday.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import santa.holiday.Config;
import santa.holiday.items.christmas.*;

/**
 * @author SatanicSanta
 */
public class ItemHandler {

    public static Item cookieChristmas;

    public static void registerStuff(){

        if (Config.enableChristmasCookies) {
            cookieChristmas = new ChristmasCookie(1, 1, false);
            GameRegistry.registerItem(cookieChristmas, "cookieChristmas");
        }
    }

    public static void recipes(){

    }
}

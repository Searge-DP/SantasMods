package santa.resurrection.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

/**
 * Created by elijahfoster-wysocki on 10/25/14.
 */
public class BlockHandler {

    public static Block trophy;

    public static void newStuff() {
        trophy = new Trophy();
    }

    public static void registerStuff(){
        GameRegistry.registerBlock(trophy, "trophy");
    }


}

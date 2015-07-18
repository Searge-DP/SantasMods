package santa.toys.proxies;


import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import santa.toys.gui.ContainerBigPouch;
import santa.toys.gui.GuiBigPouch;
import santa.toys.gui.InventoryBigPouch;
import santa.toys.items.ItemInfo;

/**
 * @author Eli Foster
 */
public class Common implements IGuiHandler{


    public void initRenderers() {}

    public void initSounds() {}

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == ItemInfo.POUCHBIG_GUIID) {
            return new ContainerBigPouch(player.inventory, new InventoryBigPouch(player.getHeldItem()));
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == ItemInfo.POUCHBIG_GUIID) {
            return new GuiBigPouch(new ContainerBigPouch(player.inventory, new InventoryBigPouch(player.getHeldItem())));
        }
        return null;
    }
}

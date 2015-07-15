package santa.chests;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * @author SatanicSanta
 */
public class GuiHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        if (id == GUIs.CONFIG.ordinal()) {
            return new GuiConfig(player, world, x, y, z);
        } else if (id == GUIs.INV.ordinal()) {
            return new GuiInventory(player, world, x, y, z);
        } else {
            return null;
        }
    }
}

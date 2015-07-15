package santa.chests;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

/**
 * @author SatanicSanta
 */
public class GuiConfig extends GuiScreen {

    private int x, y, z, xSize, ySize;
    private EntityPlayer player;
    private World world;

    public GuiConfig(EntityPlayer player, World world, int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.player = player;
        this.world = world;
        xSize = 176;
        ySize = 100;
    }

    private ResourceLocation backgroundimage = new ResourceLocation("sortedchests:textures/client/gui/config.png"); //TODO make this

}

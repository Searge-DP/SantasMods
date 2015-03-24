package santa.decor;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;
import org.lwjgl.util.glu.Sphere;
import santa.decor.blocks.BlockHandler;
import santa.decor.render.RenderPumpkin;
import santa.decor.tileentity.TileEntityPumpkin;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * @author SatanicSanta
 */
public class Client extends Common {

    public static int sphereID;

    @Override
    public int sphereID() {
        return sphereID;
    }

    @Override
    public void renderingRegistry() {
        Sphere pumpkin = new Sphere();
        pumpkin.setDrawStyle(GLU.GLU_FILL);
        pumpkin.setNormals(GLU.GLU_SMOOTH);
        pumpkin.setOrientation(GLU.GLU_OUTSIDE);

        BufferedImage bi = new BufferedImage(1, 1 /*change these to 32, 32 eventually*/, BufferedImage.TYPE_INT_ARGB_PRE);
        bi.setRGB(0, 0, Color.red.getRGB());
        sphereID = GL11.glGenLists(1);
        GL11.glNewList(sphereID, GL11.GL_COMPILE);
        GL11.glTranslatef(0.5F, 0.5F, 0.5F);
        pumpkin.draw(0.5F, 32, 32);
        GL11.glEndList();

        TileEntitySpecialRenderer renderPumpkin = new RenderPumpkin();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPumpkin.class, renderPumpkin);
    }
}

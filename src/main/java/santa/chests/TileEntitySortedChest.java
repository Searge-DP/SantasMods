package santa.chests;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

/**
 * @author SatanicSanta
 */
public class TileEntitySortedChest extends TileEntity {

    private String whatToDisplay;

    public TileEntitySortedChest() {
        if ((this.whatToDisplay == null) || (this.whatToDisplay == "")) {
            this.whatToDisplay = Block.blockRegistry.getNameForObject(BlockSortedChest.class);
        }
        render(this.whatToDisplay);
    }

    private void render(String text) {
        FontRenderer fontRenderer = Minecraft.getMinecraft().fontRenderer;
        Tessellator tess = Tessellator.instance;
        byte byte0 = 0;
        GL11.glDisable(3553);
        tess.disableColor();
        tess.startDrawingQuads();
        int j = fontRenderer.getStringWidth(text) / 2;
        tess.setColorRGBA_F(0.0F, 0.0F, 0.0F, 0.35F);
        tess.addVertex(-j - 1, -1 + byte0, 0.0D);
        tess.addVertex(-j - 1, 8 + byte0, 0.0D);
        tess.addVertex(j + 1, 8 + byte0, 0.0D);
        tess.addVertex(j + 1, -1 + byte0, 0.0D);
        tess.draw();
        GL11.glEnable(3553);
        fontRenderer.drawString(text, -j, byte0, 553648127);
        GL11.glEnable(2929);
        GL11.glDepthMask(true);
        fontRenderer.drawString(text, -j, byte0, -1);
        GL11.glEnable(2896);
        GL11.glDisable(3042);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glPopMatrix();
    }
}

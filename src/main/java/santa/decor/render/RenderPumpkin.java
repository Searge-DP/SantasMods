package santa.decor.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;
import santa.decor.Client;
import santa.decor.tileentity.TileEntityPumpkin;

public class RenderPumpkin extends TileEntitySpecialRenderer {
    @Override
    public void renderTileEntityAt(TileEntity te, double par1, double par2, double par3, float par4) {
        TileEntityPumpkin pumpkinte = (TileEntityPumpkin) te;

        GL11.glPushMatrix();
        GL11.glTranslatef((float) par1, (float) par2, (float) par3);
        GL11.glCallList(Client.sphereID);
        GL11.glPopMatrix();
    }


}

package santa.decor.render;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.util.ForgeDirection;
import org.lwjgl.opengl.GL11;
import santa.decor.Client;
import santa.decor.SantasDecor;
import santa.decor.blocks.BlockHandler;
import santa.decor.blocks.misc.Pumpkin;
import santa.decor.tileentity.TileEntityPumpkin;

import java.util.ArrayList;

/**
 * @author SatanicSanta
 */
public class RenderPumpkin extends TileEntitySpecialRenderer {

    @Override
    public void renderTileEntityAt(TileEntity te, double dos, double tres, double cuatro, float morePoop) {
        TileEntityPumpkin pumpkinte = (TileEntityPumpkin) te;

        GL11.glPushMatrix();
        GL11.glTranslatef((float) dos, (float) tres, (float) cuatro);
        GL11.glCallList(Client.sphereID);
        GL11.glPopMatrix();
    }


}

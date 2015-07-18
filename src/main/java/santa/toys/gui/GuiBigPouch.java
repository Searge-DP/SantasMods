package santa.toys.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * @author Eli Foster
 */
public class GuiBigPouch extends GuiContainer {

    private static final ResourceLocation resourceLocation = new ResourceLocation("textures/gui/container/generic_54.png");
    private IInventory inventory;
    private int inventoryRows;

    public GuiBigPouch(ContainerBigPouch bigPouch) {
        super(bigPouch);
        this.inventory = bigPouch.inventory;
        this.inventoryRows = inventory.getSizeInventory() / 9;
    }

    @Override
    public void drawGuiContainerForegroundLayer(int par2, int par3) {
        this.fontRendererObj.drawString(this.inventory.hasCustomInventoryName() ? this.inventory.getInventoryName() : I18n.format(this.inventory.getInventoryName(), new Object[0]), 8, 6, 4210752);
    }

    @Override
    public void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(resourceLocation);
        int k = (width - xSize) / 2;
        int l = (height - ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, xSize, ySize);
    }
}

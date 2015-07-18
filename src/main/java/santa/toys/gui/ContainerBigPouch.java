package santa.toys.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import santa.toys.items.ItemInfo;

/**
 * @author Eli Foster
 */
public class ContainerBigPouch extends Container {

    protected final InventoryBigPouch inventory;
    private static final int INV_START = ItemInfo.POUCHBIG_SIZE;
    private static final int INV_END = INV_START+26;
    private static final int HOTBAR_START = INV_END+1;
    private static final int HOTBAR_END = HOTBAR_START+8;

    public ContainerBigPouch(InventoryPlayer invPlayer, InventoryBigPouch pouch) {
        this.inventory = pouch;
        int i;

        for (i = 0; i < INV_START; ++i) {
            this.addSlotToContainer(new PouchSlot(this.inventory, i, 80 + (18 * (i/4)), 8 + (18*(i%4))));
        }

        for (i = 0; i < 3; ++i) {
            for (int k = 0; k < 9; ++k) {
                this.addSlotToContainer(new Slot(invPlayer, k + i * 9 + 9, 8 + k * 18, 84 + i * 18));
            }
        }

        for (i = 0; i < 9; ++i) {
            this.addSlotToContainer(new Slot(invPlayer, i, 8 + i * 18, 142));
        }
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        if (inventory.isUseableByPlayer(player)) {
             return true;
        } else {
            return false;
        }
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int par2) {
        ItemStack stack = null;
        Slot slot = (Slot) this.inventorySlots.get(par2);

        if (slot != null && slot.getHasStack()) {
            ItemStack stack1 = slot.getStack();
            stack = stack1.copy();

            if (par2 > INV_START) {
                if (!this.mergeItemStack(stack1, INV_START, HOTBAR_END + 1, true)) {
                    return null;
                }
                slot.onSlotChange(stack1, stack);
            } else if (par2 >= INV_START && !this.mergeItemStack(stack1, 0, INV_START, false)) {
                return null;
            }

            if (stack1.stackSize == 0) {
                slot.putStack((ItemStack)null);
            } else {
                slot.onSlotChanged();
            }

            slot.onPickupFromSlot(player, stack1);
        }
        return stack;
    }

    @Override
    public void onContainerClosed(EntityPlayer player) {
        super.onContainerClosed(player);
        this.inventory.closeInventory();
    }
}

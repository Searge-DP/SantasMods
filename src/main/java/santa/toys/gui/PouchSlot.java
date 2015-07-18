package santa.toys.gui;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import santa.toys.items.BigPouch;

/**
 * @author Eli Foster
 */
public class PouchSlot extends Slot {

    public PouchSlot(IInventory inv, int index, int xPos, int yPos) {
        super(inv, index, xPos, yPos);
    }

    @Override
    public boolean isItemValid(ItemStack stack) {
        if (stack.getItem() instanceof BigPouch) {
            return false;
        } else {
            return true;
        }
    }
}

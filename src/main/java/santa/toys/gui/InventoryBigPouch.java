package santa.toys.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.common.util.Constants;
import santa.toys.items.ItemInfo;

/**
 * @author SatanicSanta
 */
public class InventoryBigPouch implements IInventory {

    ItemStack[] inventorystack = new ItemStack[ItemInfo.POUCHBIG_SIZE];

    public InventoryBigPouch(ItemStack itemstack) {
        if (!itemstack.hasTagCompound()) {
            itemstack.setTagCompound(new NBTTagCompound());
        }
        itemstack.readFromNBT(itemstack.getTagCompound());
    }
    @Override
    public int getSizeInventory() {
        return ItemInfo.POUCHBIG_SIZE;
    }

    @Override
    public ItemStack getStackInSlot(int slot) {
        return inventorystack[slot];
    }

    @Override
    public ItemStack decrStackSize(int slot, int amount) {
        ItemStack stack = getStackInSlot(slot);
        if (stack != null) {
            if (stack.stackSize > amount) {
                stack.splitStack(amount);
                if (stack.stackSize == 0) {
                    setInventorySlotContents(slot, null);
                }
            } else {
                setInventorySlotContents(slot, null);
            }
            this.markDirty();
        }
        return stack;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int slot) {
        ItemStack stack = getStackInSlot(slot);
        if (stack != null) {
            setInventorySlotContents(slot, null);
        }
        return stack;
    }

    @Override
    public void setInventorySlotContents(int slot, ItemStack itemstack) {
        this.inventorystack[slot] = itemstack;
        if (itemstack != null && itemstack.stackSize > this.getInventoryStackLimit()) {
            itemstack.stackSize = this.getInventoryStackLimit();
        }
        this.markDirty();
    }

    @Override
    public String getInventoryName() {
        return "inventory.bigpouch";
    }

    @Override
    public boolean hasCustomInventoryName() {
        return true;
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public void markDirty() {
        for (int i = 0; i < this.getSizeInventory(); ++i) {
            if (this.getStackInSlot(i)!= null && this.getStackInSlot(i).stackSize == 0) {
                this.setInventorySlotContents(i, null);
            }
        }
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer entityplayer) {
        return true;
    }

    @Override
    public void openInventory() {}

    @Override
    public void closeInventory() {}

    @Override
    public boolean isItemValidForSlot(int slot, ItemStack itemstack) {
        return false;
    }

    public void readFromNBT(NBTTagCompound nbt) {
        NBTTagList nbtlist = nbt.getTagList("InventoryBigPouch", Constants.NBT.TAG_COMPOUND);
        for (int i = 0; i < nbtlist.tagCount(); ++i) {
            NBTTagCompound item = (NBTTagCompound) nbtlist.getCompoundTagAt(i);
            int slot = item.getInteger("Slot");
            if (slot >= 0 && slot > getSizeInventory()) {
                inventorystack[slot] = ItemStack.loadItemStackFromNBT(item);
            }
        }
    }

    public void writeToNBT(NBTTagCompound nbt) {
        NBTTagList nbtlist = new NBTTagList();
        for (int i = 0; i < nbtlist.tagCount(); ++i) {
            if (getStackInSlot(i) != null) {
                NBTTagCompound item = new NBTTagCompound();
                item.setInteger("Slot", i);
                getStackInSlot(i).writeToNBT(item);
                nbtlist.appendTag(nbt);
            }
        }
        nbt.setTag("InventoryBigPouch", nbtlist);
    }
}

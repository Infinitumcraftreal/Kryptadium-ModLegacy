package net.mcreator.kryptonite.block.entity;

import net.minecraftforge.items.wrapper.SidedInvWrapper;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.WorldlyContainer;
import net.minecraft.world.ContainerHelper;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.NonNullList;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.kryptonite.world.inventory.KryptoniteChestGUIMenu;
import net.mcreator.kryptonite.init.KryptadiumModBlockEntities;

import javax.annotation.Nullable;

import java.util.stream.IntStream;

import io.netty.buffer.Unpooled;

public class KryptoniteChestBlockEntity extends RandomizableContainerBlockEntity implements WorldlyContainer {
	private NonNullList<ItemStack> stacks = NonNullList.<ItemStack>withSize(90, ItemStack.EMPTY);
	private final LazyOptional<? extends IItemHandler>[] handlers = SidedInvWrapper.create(this, Direction.values());

	public KryptoniteChestBlockEntity(BlockPos position, BlockState state) {
		super(KryptadiumModBlockEntities.KRYPTONITE_CHEST.get(), position, state);
	}

	@Override
	public void load(CompoundTag compound) {
		super.load(compound);
		if (!this.tryLoadLootTable(compound))
			this.stacks = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
		ContainerHelper.loadAllItems(compound, this.stacks);
	}

	@Override
	public void saveAdditional(CompoundTag compound) {
		super.saveAdditional(compound);
		if (!this.trySaveLootTable(compound)) {
			ContainerHelper.saveAllItems(compound, this.stacks);
		}
	}

	@Override
	public ClientboundBlockEntityDataPacket getUpdatePacket() {
		return ClientboundBlockEntityDataPacket.create(this);
	}

	@Override
	public CompoundTag getUpdateTag() {
		return this.saveWithFullMetadata();
	}

	@Override
	public int getContainerSize() {
		return stacks.size();
	}

	@Override
	public boolean isEmpty() {
		for (ItemStack itemstack : this.stacks)
			if (!itemstack.isEmpty())
				return false;
		return true;
	}

	@Override
	public Component getDefaultName() {
		return Component.literal("kryptonite_chest");
	}

	@Override
	public int getMaxStackSize() {
		return 64;
	}

	@Override
	public AbstractContainerMenu createMenu(int id, Inventory inventory) {
		return new KryptoniteChestGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(this.worldPosition));
	}

	@Override
	public Component getDisplayName() {
		return Component.literal("Kryptonite Chest");
	}

	@Override
	protected NonNullList<ItemStack> getItems() {
		return this.stacks;
	}

	@Override
	protected void setItems(NonNullList<ItemStack> stacks) {
		this.stacks = stacks;
	}

	@Override
	public boolean canPlaceItem(int index, ItemStack stack) {
		return true;
	}

	@Override
	public int[] getSlotsForFace(Direction side) {
		return IntStream.range(0, this.getContainerSize()).toArray();
	}

	@Override
	public boolean canPlaceItemThroughFace(int index, ItemStack stack, @Nullable Direction direction) {
		return this.canPlaceItem(index, stack);
	}

	@Override
	public boolean canTakeItemThroughFace(int index, ItemStack stack, Direction direction) {
		if (index == 0)
			return false;
		if (index == 1)
			return false;
		if (index == 2)
			return false;
		if (index == 3)
			return false;
		if (index == 4)
			return false;
		if (index == 5)
			return false;
		if (index == 6)
			return false;
		if (index == 7)
			return false;
		if (index == 8)
			return false;
		if (index == 9)
			return false;
		if (index == 10)
			return false;
		if (index == 11)
			return false;
		if (index == 12)
			return false;
		if (index == 13)
			return false;
		if (index == 14)
			return false;
		if (index == 15)
			return false;
		if (index == 16)
			return false;
		if (index == 17)
			return false;
		if (index == 18)
			return false;
		if (index == 19)
			return false;
		if (index == 20)
			return false;
		if (index == 21)
			return false;
		if (index == 22)
			return false;
		if (index == 23)
			return false;
		if (index == 24)
			return false;
		if (index == 25)
			return false;
		if (index == 26)
			return false;
		if (index == 27)
			return false;
		if (index == 28)
			return false;
		if (index == 29)
			return false;
		if (index == 30)
			return false;
		if (index == 31)
			return false;
		if (index == 32)
			return false;
		if (index == 33)
			return false;
		if (index == 34)
			return false;
		if (index == 35)
			return false;
		if (index == 36)
			return false;
		if (index == 37)
			return false;
		if (index == 38)
			return false;
		if (index == 39)
			return false;
		if (index == 40)
			return false;
		if (index == 41)
			return false;
		if (index == 42)
			return false;
		if (index == 43)
			return false;
		if (index == 44)
			return false;
		if (index == 45)
			return false;
		if (index == 46)
			return false;
		if (index == 47)
			return false;
		if (index == 48)
			return false;
		if (index == 49)
			return false;
		if (index == 50)
			return false;
		if (index == 51)
			return false;
		if (index == 52)
			return false;
		if (index == 53)
			return false;
		if (index == 54)
			return false;
		if (index == 55)
			return false;
		if (index == 56)
			return false;
		if (index == 57)
			return false;
		if (index == 58)
			return false;
		if (index == 59)
			return false;
		if (index == 60)
			return false;
		if (index == 61)
			return false;
		if (index == 62)
			return false;
		if (index == 63)
			return false;
		if (index == 64)
			return false;
		if (index == 65)
			return false;
		if (index == 66)
			return false;
		if (index == 67)
			return false;
		if (index == 68)
			return false;
		if (index == 69)
			return false;
		if (index == 70)
			return false;
		if (index == 71)
			return false;
		if (index == 72)
			return false;
		if (index == 73)
			return false;
		if (index == 74)
			return false;
		if (index == 75)
			return false;
		if (index == 76)
			return false;
		if (index == 77)
			return false;
		if (index == 78)
			return false;
		if (index == 79)
			return false;
		if (index == 80)
			return false;
		if (index == 81)
			return false;
		if (index == 82)
			return false;
		if (index == 83)
			return false;
		if (index == 84)
			return false;
		if (index == 85)
			return false;
		if (index == 86)
			return false;
		if (index == 87)
			return false;
		if (index == 88)
			return false;
		if (index == 89)
			return false;
		return true;
	}

	@Override
	public <T> LazyOptional<T> getCapability(Capability<T> capability, @Nullable Direction facing) {
		if (!this.remove && facing != null && capability == ForgeCapabilities.ITEM_HANDLER)
			return handlers[facing.ordinal()].cast();
		return super.getCapability(capability, facing);
	}

	@Override
	public void setRemoved() {
		super.setRemoved();
		for (LazyOptional<? extends IItemHandler> handler : handlers)
			handler.invalidate();
	}
}

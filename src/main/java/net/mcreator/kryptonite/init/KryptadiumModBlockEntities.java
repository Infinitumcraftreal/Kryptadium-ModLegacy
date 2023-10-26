
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kryptonite.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.kryptonite.block.entity.KryptoniteChestBlockEntity;
import net.mcreator.kryptonite.KryptadiumMod;

public class KryptadiumModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, KryptadiumMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> KRYPTONITE_CHEST = register("kryptonite_chest", KryptadiumModBlocks.KRYPTONITE_CHEST, KryptoniteChestBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}

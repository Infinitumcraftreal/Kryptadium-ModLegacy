
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kryptonite.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.kryptonite.block.RadarCooldownBlock;
import net.mcreator.kryptonite.block.RadarBlock;
import net.mcreator.kryptonite.block.Kryptonitetntblowup2Block;
import net.mcreator.kryptonite.block.Kryptonitetntblowup1Block;
import net.mcreator.kryptonite.block.KryptoniteTorchBlock;
import net.mcreator.kryptonite.block.KryptoniteTntBlock;
import net.mcreator.kryptonite.block.KryptoniteOreBlock;
import net.mcreator.kryptonite.block.KryptoniteLanternBlock;
import net.mcreator.kryptonite.block.KryptoniteChestBlock;
import net.mcreator.kryptonite.block.KryptoniteBlockBlock;
import net.mcreator.kryptonite.KryptadiumMod;

public class KryptadiumModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, KryptadiumMod.MODID);
	public static final RegistryObject<Block> KRYPTONITE_ORE = REGISTRY.register("kryptonite_ore", () -> new KryptoniteOreBlock());
	public static final RegistryObject<Block> KRYPTONITE_BLOCK = REGISTRY.register("kryptonite_block", () -> new KryptoniteBlockBlock());
	public static final RegistryObject<Block> KRYPTONITE_TNT = REGISTRY.register("kryptonite_tnt", () -> new KryptoniteTntBlock());
	public static final RegistryObject<Block> RADAR = REGISTRY.register("radar", () -> new RadarBlock());
	public static final RegistryObject<Block> KRYPTONITETNTBLOWUP_1 = REGISTRY.register("kryptonitetntblowup_1", () -> new Kryptonitetntblowup1Block());
	public static final RegistryObject<Block> KRYPTONITETNTBLOWUP_2 = REGISTRY.register("kryptonitetntblowup_2", () -> new Kryptonitetntblowup2Block());
	public static final RegistryObject<Block> KRYPTONITE_TORCH = REGISTRY.register("kryptonite_torch", () -> new KryptoniteTorchBlock());
	public static final RegistryObject<Block> KRYPTONITE_LANTERN = REGISTRY.register("kryptonite_lantern", () -> new KryptoniteLanternBlock());
	public static final RegistryObject<Block> RADAR_COOLDOWN = REGISTRY.register("radar_cooldown", () -> new RadarCooldownBlock());
	public static final RegistryObject<Block> KRYPTONITE_CHEST = REGISTRY.register("kryptonite_chest", () -> new KryptoniteChestBlock());
}

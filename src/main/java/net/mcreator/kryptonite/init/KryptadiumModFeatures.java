
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kryptonite.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.kryptonite.world.features.ores.KryptoniteOreFeature;
import net.mcreator.kryptonite.KryptadiumMod;

@Mod.EventBusSubscriber
public class KryptadiumModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, KryptadiumMod.MODID);
	public static final RegistryObject<Feature<?>> KRYPTONITE_ORE = REGISTRY.register("kryptonite_ore", KryptoniteOreFeature::new);
}

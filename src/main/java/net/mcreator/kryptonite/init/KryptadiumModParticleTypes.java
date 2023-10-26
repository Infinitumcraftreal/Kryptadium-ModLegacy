
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kryptonite.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.kryptonite.KryptadiumMod;

public class KryptadiumModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, KryptadiumMod.MODID);
	public static final RegistryObject<SimpleParticleType> KRYPTONITE_TORCH_PARTICLE = REGISTRY.register("kryptonite_torch_particle", () -> new SimpleParticleType(true));
}

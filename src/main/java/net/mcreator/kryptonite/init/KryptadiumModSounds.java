
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kryptonite.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.kryptonite.KryptadiumMod;

public class KryptadiumModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, KryptadiumMod.MODID);
	public static final RegistryObject<SoundEvent> RADAR_SOUND = REGISTRY.register("radar_sound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("kryptadium", "radar_sound")));
	public static final RegistryObject<SoundEvent> KRYPTONITEBOSSDIESOUND = REGISTRY.register("kryptonitebossdiesound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("kryptadium", "kryptonitebossdiesound")));
	public static final RegistryObject<SoundEvent> KRYPTONITEBOSSHURTSOUND = REGISTRY.register("kryptonitebosshurtsound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("kryptadium", "kryptonitebosshurtsound")));
	public static final RegistryObject<SoundEvent> KRYPTONITEBOSSSTEPSOUND = REGISTRY.register("kryptonitebossstepsound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("kryptadium", "kryptonitebossstepsound")));
}

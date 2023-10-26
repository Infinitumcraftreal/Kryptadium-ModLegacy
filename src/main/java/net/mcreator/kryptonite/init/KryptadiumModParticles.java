
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kryptonite.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.kryptonite.client.particle.KryptoniteTorchParticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class KryptadiumModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(KryptadiumModParticleTypes.KRYPTONITE_TORCH_PARTICLE.get(), KryptoniteTorchParticleParticle::provider);
	}
}

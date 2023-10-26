
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kryptonite.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.kryptonite.client.renderer.KryptoniteBossRenderer;
import net.mcreator.kryptonite.client.renderer.KryptaxoRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class KryptadiumModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(KryptadiumModEntities.KRYPTONITE_DYNAMITE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(KryptadiumModEntities.KRYPTONITE_BOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(KryptadiumModEntities.KRYPTONITE_BOSS.get(), KryptoniteBossRenderer::new);
		event.registerEntityRenderer(KryptadiumModEntities.KRYPTAXO.get(), KryptaxoRenderer::new);
	}
}

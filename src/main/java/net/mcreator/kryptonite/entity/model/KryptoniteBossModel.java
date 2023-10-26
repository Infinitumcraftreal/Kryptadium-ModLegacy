package net.mcreator.kryptonite.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.kryptonite.entity.KryptoniteBossEntity;

public class KryptoniteBossModel extends GeoModel<KryptoniteBossEntity> {
	@Override
	public ResourceLocation getAnimationResource(KryptoniteBossEntity entity) {
		return new ResourceLocation("kryptadium", "animations/kryptoniteboss.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(KryptoniteBossEntity entity) {
		return new ResourceLocation("kryptadium", "geo/kryptoniteboss.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(KryptoniteBossEntity entity) {
		return new ResourceLocation("kryptadium", "textures/entities/" + entity.getTexture() + ".png");
	}

}

package net.mcreator.kryptonite.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.kryptonite.entity.KryptaxoEntity;

public class KryptaxoModel extends GeoModel<KryptaxoEntity> {
	@Override
	public ResourceLocation getAnimationResource(KryptaxoEntity entity) {
		return new ResourceLocation("kryptadium", "animations/kryptaxo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(KryptaxoEntity entity) {
		return new ResourceLocation("kryptadium", "geo/kryptaxo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(KryptaxoEntity entity) {
		return new ResourceLocation("kryptadium", "textures/entities/" + entity.getTexture() + ".png");
	}

}

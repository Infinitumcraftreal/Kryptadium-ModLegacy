
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kryptonite.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.kryptonite.entity.KryptoniteDynamiteEntity;
import net.mcreator.kryptonite.entity.KryptoniteBowEntity;
import net.mcreator.kryptonite.entity.KryptoniteBossEntity;
import net.mcreator.kryptonite.entity.KryptaxoEntity;
import net.mcreator.kryptonite.KryptadiumMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class KryptadiumModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, KryptadiumMod.MODID);
	public static final RegistryObject<EntityType<KryptoniteDynamiteEntity>> KRYPTONITE_DYNAMITE = register("projectile_kryptonite_dynamite", EntityType.Builder.<KryptoniteDynamiteEntity>of(KryptoniteDynamiteEntity::new, MobCategory.MISC)
			.setCustomClientFactory(KryptoniteDynamiteEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KryptoniteBowEntity>> KRYPTONITE_BOW = register("projectile_kryptonite_bow",
			EntityType.Builder.<KryptoniteBowEntity>of(KryptoniteBowEntity::new, MobCategory.MISC).setCustomClientFactory(KryptoniteBowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KryptoniteBossEntity>> KRYPTONITE_BOSS = register("kryptonite_boss",
			EntityType.Builder.<KryptoniteBossEntity>of(KryptoniteBossEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KryptoniteBossEntity::new)

					.sized(1f, 3f));
	public static final RegistryObject<EntityType<KryptaxoEntity>> KRYPTAXO = register("kryptaxo",
			EntityType.Builder.<KryptaxoEntity>of(KryptaxoEntity::new, MobCategory.UNDERGROUND_WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(20).setUpdateInterval(3).setCustomClientFactory(KryptaxoEntity::new)

					.sized(0.75f, 0.42f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			KryptoniteBossEntity.init();
			KryptaxoEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(KRYPTONITE_BOSS.get(), KryptoniteBossEntity.createAttributes().build());
		event.put(KRYPTAXO.get(), KryptaxoEntity.createAttributes().build());
	}
}

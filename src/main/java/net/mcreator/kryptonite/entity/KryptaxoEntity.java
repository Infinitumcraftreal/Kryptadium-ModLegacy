
package net.mcreator.kryptonite.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.monster.Guardian;
import net.minecraft.world.entity.monster.ElderGuardian;
import net.minecraft.world.entity.monster.Drowned;
import net.minecraft.world.entity.animal.frog.Tadpole;
import net.minecraft.world.entity.animal.TropicalFish;
import net.minecraft.world.entity.animal.Squid;
import net.minecraft.world.entity.animal.Salmon;
import net.minecraft.world.entity.animal.Pufferfish;
import net.minecraft.world.entity.animal.Cod;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.GlowSquid;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.FluidTags;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.mcreator.kryptonite.procedures.KryptaxoEntityDiesProcedure;
import net.mcreator.kryptonite.init.KryptadiumModEntities;

public class KryptaxoEntity extends PathfinderMob {
	public KryptaxoEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(KryptadiumModEntities.KRYPTAXO.get(), world);
	}

	public KryptaxoEntity(EntityType<KryptaxoEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 0;
		setNoAi(false);
		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (KryptaxoEntity.this.isInWater())
					KryptaxoEntity.this.setDeltaMovement(KryptaxoEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !KryptaxoEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - KryptaxoEntity.this.getX();
					double dy = this.wantedY - KryptaxoEntity.this.getY();
					double dz = this.wantedZ - KryptaxoEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * KryptaxoEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					KryptaxoEntity.this.setYRot(this.rotlerp(KryptaxoEntity.this.getYRot(), f, 10));
					KryptaxoEntity.this.yBodyRot = KryptaxoEntity.this.getYRot();
					KryptaxoEntity.this.yHeadRot = KryptaxoEntity.this.getYRot();
					if (KryptaxoEntity.this.isInWater()) {
						KryptaxoEntity.this.setSpeed((float) KryptaxoEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						KryptaxoEntity.this.setXRot(this.rotlerp(KryptaxoEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(KryptaxoEntity.this.getXRot() * (float) (Math.PI / 180.0));
						KryptaxoEntity.this.setZza(f3 * f1);
						KryptaxoEntity.this.setYya((float) (f1 * dy));
					} else {
						KryptaxoEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					KryptaxoEntity.this.setSpeed(0);
					KryptaxoEntity.this.setYya(0);
					KryptaxoEntity.this.setZza(0);
				}
			}
		};
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new WaterBoundPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 3, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(5, new RandomSwimmingGoal(this, 3, 40));
		this.goalSelector.addGoal(6, new PanicGoal(this, 3));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, ElderGuardian.class, false, false));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, Cod.class, false, false));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, GlowSquid.class, false, false));
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, Guardian.class, false, false));
		this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, Pufferfish.class, false, false));
		this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, Salmon.class, false, false));
		this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, Squid.class, false, false));
		this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, Tadpole.class, false, false));
		this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, TropicalFish.class, false, false));
		this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, Drowned.class, false, false));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public double getMyRidingOffset() {
		return -0.35D;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.axolotl.idle_water"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.axolotl.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.axolotl.death"));
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		KryptaxoEntityDiesProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
	}

	@Override
	public boolean canBreatheUnderwater() {
		return true;
	}

	@Override
	public boolean checkSpawnObstruction(LevelReader world) {
		return world.isUnobstructed(this);
	}

	@Override
	public boolean isPushedByFluid() {
		return false;
	}

	public static void init() {
		SpawnPlacements.register(KryptadiumModEntities.KRYPTAXO.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
			return world.getFluidState(pos.below()).is(FluidTags.WATER) && world.getBlockState(pos.above()).is(Blocks.WATER) && pos.getY() >= (world.getSeaLevel() - 13) && pos.getY() <= world.getSeaLevel();
		});
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 3);
		builder = builder.add(Attributes.MAX_HEALTH, 14);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 2);
		builder = builder.add(Attributes.FOLLOW_RANGE, 10);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 1);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 3);
		return builder;
	}
}

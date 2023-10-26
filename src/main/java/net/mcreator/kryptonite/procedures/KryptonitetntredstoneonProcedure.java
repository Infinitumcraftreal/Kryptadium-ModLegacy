package net.mcreator.kryptonite.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.kryptonite.init.KryptadiumModBlocks;
import net.mcreator.kryptonite.KryptadiumMod;

import java.util.Map;

public class KryptonitetntredstoneonProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			BlockPos _bp = BlockPos.containing(x, y, z);
			BlockState _bs = KryptadiumModBlocks.KRYPTONITETNTBLOWUP_2.get().defaultBlockState();
			BlockState _bso = world.getBlockState(_bp);
			for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
				Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
				if (_property != null && _bs.getValue(_property) != null)
					try {
						_bs = _bs.setValue(_property, (Comparable) entry.getValue());
					} catch (Exception e) {
					}
			}
			world.setBlock(_bp, _bs, 3);
		}
		KryptadiumMod.queueServerWork(10, () -> {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = KryptadiumModBlocks.KRYPTONITETNTBLOWUP_1.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			KryptadiumMod.queueServerWork(10, () -> {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = KryptadiumModBlocks.KRYPTONITETNTBLOWUP_2.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				KryptadiumMod.queueServerWork(10, () -> {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = KryptadiumModBlocks.KRYPTONITETNTBLOWUP_1.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					KryptadiumMod.queueServerWork(10, () -> {
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = KryptadiumModBlocks.KRYPTONITETNTBLOWUP_2.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
						KryptadiumMod.queueServerWork(10, () -> {
							{
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockState _bs = KryptadiumModBlocks.KRYPTONITETNTBLOWUP_1.get().defaultBlockState();
								BlockState _bso = world.getBlockState(_bp);
								for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
									Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
									if (_property != null && _bs.getValue(_property) != null)
										try {
											_bs = _bs.setValue(_property, (Comparable) entry.getValue());
										} catch (Exception e) {
										}
								}
								world.setBlock(_bp, _bs, 3);
							}
							KryptadiumMod.queueServerWork(5, () -> {
								{
									BlockPos _bp = BlockPos.containing(x, y, z);
									BlockState _bs = Blocks.AIR.defaultBlockState();
									BlockState _bso = world.getBlockState(_bp);
									for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
										Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
										if (_property != null && _bs.getValue(_property) != null)
											try {
												_bs = _bs.setValue(_property, (Comparable) entry.getValue());
											} catch (Exception e) {
											}
									}
									world.setBlock(_bp, _bs, 3);
								}
								KryptadiumMod.queueServerWork(5, () -> {
									if (world instanceof Level _level && !_level.isClientSide())
										_level.explode(null, x, y, z, 8, Level.ExplosionInteraction.TNT);
								});
							});
						});
					});
				});
			});
		});
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kryptonite.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.kryptonite.KryptadiumMod;

public class KryptadiumModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KryptadiumMod.MODID);
	public static final RegistryObject<CreativeModeTab> MINE_NOOBS = REGISTRY.register("mine_noobs",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.kryptadium.mine_noobs")).icon(() -> new ItemStack(KryptadiumModBlocks.KRYPTONITE_ORE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(KryptadiumModBlocks.KRYPTONITE_ORE.get().asItem());
				tabData.accept(KryptadiumModItems.KRYPTONITE.get());
				tabData.accept(KryptadiumModItems.KRYPTONITE_SWORD.get());
				tabData.accept(KryptadiumModItems.KRYPTONITE_SHOVEL.get());
				tabData.accept(KryptadiumModItems.KRYPTONITE_AXE.get());
				tabData.accept(KryptadiumModItems.KRYPTONITE_PICKAXE.get());
				tabData.accept(KryptadiumModItems.KRYPTONITE_HOE.get());
				tabData.accept(KryptadiumModItems.KRYPTONITE_ARMOR_HELMET.get());
				tabData.accept(KryptadiumModItems.KRYPTONITE_ARMOR_CHESTPLATE.get());
				tabData.accept(KryptadiumModItems.KRYPTONITE_ARMOR_LEGGINGS.get());
				tabData.accept(KryptadiumModItems.KRYPTONITE_ARMOR_BOOTS.get());
				tabData.accept(KryptadiumModBlocks.KRYPTONITE_BLOCK.get().asItem());
				tabData.accept(KryptadiumModItems.KRYPTONITE_APPLE.get());
				tabData.accept(KryptadiumModItems.KRYPTO_KNIFE.get());
				tabData.accept(KryptadiumModItems.CORNET_DE_GLACE.get());
				tabData.accept(KryptadiumModItems.GLACE_CHOCOLATE.get());
				tabData.accept(KryptadiumModItems.BAR_DE_CHOCOLAT.get());
				tabData.accept(KryptadiumModBlocks.KRYPTONITE_TNT.get().asItem());
				tabData.accept(KryptadiumModItems.KRYPTONITE_DYNAMITE.get());
				tabData.accept(KryptadiumModItems.KRYPTONITE_BOW.get());
				tabData.accept(KryptadiumModBlocks.RADAR.get().asItem());
				tabData.accept(KryptadiumModBlocks.KRYPTONITE_TORCH.get().asItem());
				tabData.accept(KryptadiumModItems.KRYPTONITE_NUGGETS.get());
				tabData.accept(KryptadiumModBlocks.KRYPTONITE_LANTERN.get().asItem());
				tabData.accept(KryptadiumModItems.KRYPTONITE_BOSS_SPAWN_EGG.get());
				tabData.accept(KryptadiumModItems.KRYPTAXO_SPAWN_EGG.get());
				tabData.accept(KryptadiumModItems.KRYPTONITE_HAMMER.get());
				tabData.accept(KryptadiumModBlocks.KRYPTONITE_CHEST.get().asItem());
			}).withSearchBar().build());
}

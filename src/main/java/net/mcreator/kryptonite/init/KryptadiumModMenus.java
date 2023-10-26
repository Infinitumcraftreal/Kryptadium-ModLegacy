
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kryptonite.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.kryptonite.world.inventory.KryptoniteChestGUIMenu;
import net.mcreator.kryptonite.KryptadiumMod;

public class KryptadiumModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, KryptadiumMod.MODID);
	public static final RegistryObject<MenuType<KryptoniteChestGUIMenu>> KRYPTONITE_CHEST_GUI = REGISTRY.register("kryptonite_chest_gui", () -> IForgeMenuType.create(KryptoniteChestGUIMenu::new));
}

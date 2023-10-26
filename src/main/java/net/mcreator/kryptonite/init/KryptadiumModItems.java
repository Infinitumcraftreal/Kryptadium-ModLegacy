
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kryptonite.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.kryptonite.item.KryptonitedynamiteneedItem;
import net.mcreator.kryptonite.item.KryptoniteSwordItem;
import net.mcreator.kryptonite.item.KryptoniteShovelItem;
import net.mcreator.kryptonite.item.KryptonitePickaxeItem;
import net.mcreator.kryptonite.item.KryptoniteNuggetsItem;
import net.mcreator.kryptonite.item.KryptoniteItem;
import net.mcreator.kryptonite.item.KryptoniteHoeItem;
import net.mcreator.kryptonite.item.KryptoniteHammerItem;
import net.mcreator.kryptonite.item.KryptoniteDynamiteItem;
import net.mcreator.kryptonite.item.KryptoniteBowItem;
import net.mcreator.kryptonite.item.KryptoniteAxeItem;
import net.mcreator.kryptonite.item.KryptoniteArmorItem;
import net.mcreator.kryptonite.item.KryptoniteAppleItem;
import net.mcreator.kryptonite.item.KryptoKnifeItem;
import net.mcreator.kryptonite.item.GlaceChocolateItem;
import net.mcreator.kryptonite.item.CornetDeGlaceItem;
import net.mcreator.kryptonite.item.BarDeChocolatItem;
import net.mcreator.kryptonite.KryptadiumMod;

public class KryptadiumModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, KryptadiumMod.MODID);
	public static final RegistryObject<Item> KRYPTONITE_ORE = block(KryptadiumModBlocks.KRYPTONITE_ORE);
	public static final RegistryObject<Item> KRYPTONITE = REGISTRY.register("kryptonite", () -> new KryptoniteItem());
	public static final RegistryObject<Item> KRYPTONITE_SWORD = REGISTRY.register("kryptonite_sword", () -> new KryptoniteSwordItem());
	public static final RegistryObject<Item> KRYPTONITE_SHOVEL = REGISTRY.register("kryptonite_shovel", () -> new KryptoniteShovelItem());
	public static final RegistryObject<Item> KRYPTONITE_AXE = REGISTRY.register("kryptonite_axe", () -> new KryptoniteAxeItem());
	public static final RegistryObject<Item> KRYPTONITE_PICKAXE = REGISTRY.register("kryptonite_pickaxe", () -> new KryptonitePickaxeItem());
	public static final RegistryObject<Item> KRYPTONITE_HOE = REGISTRY.register("kryptonite_hoe", () -> new KryptoniteHoeItem());
	public static final RegistryObject<Item> KRYPTONITE_ARMOR_HELMET = REGISTRY.register("kryptonite_armor_helmet", () -> new KryptoniteArmorItem.Helmet());
	public static final RegistryObject<Item> KRYPTONITE_ARMOR_CHESTPLATE = REGISTRY.register("kryptonite_armor_chestplate", () -> new KryptoniteArmorItem.Chestplate());
	public static final RegistryObject<Item> KRYPTONITE_ARMOR_LEGGINGS = REGISTRY.register("kryptonite_armor_leggings", () -> new KryptoniteArmorItem.Leggings());
	public static final RegistryObject<Item> KRYPTONITE_ARMOR_BOOTS = REGISTRY.register("kryptonite_armor_boots", () -> new KryptoniteArmorItem.Boots());
	public static final RegistryObject<Item> KRYPTONITE_BLOCK = block(KryptadiumModBlocks.KRYPTONITE_BLOCK);
	public static final RegistryObject<Item> KRYPTONITE_APPLE = REGISTRY.register("kryptonite_apple", () -> new KryptoniteAppleItem());
	public static final RegistryObject<Item> KRYPTO_KNIFE = REGISTRY.register("krypto_knife", () -> new KryptoKnifeItem());
	public static final RegistryObject<Item> CORNET_DE_GLACE = REGISTRY.register("cornet_de_glace", () -> new CornetDeGlaceItem());
	public static final RegistryObject<Item> GLACE_CHOCOLATE = REGISTRY.register("glace_chocolate", () -> new GlaceChocolateItem());
	public static final RegistryObject<Item> BAR_DE_CHOCOLAT = REGISTRY.register("bar_de_chocolat", () -> new BarDeChocolatItem());
	public static final RegistryObject<Item> KRYPTONITE_TNT = block(KryptadiumModBlocks.KRYPTONITE_TNT);
	public static final RegistryObject<Item> KRYPTONITEDYNAMITENEED = REGISTRY.register("kryptonitedynamiteneed", () -> new KryptonitedynamiteneedItem());
	public static final RegistryObject<Item> KRYPTONITE_DYNAMITE = REGISTRY.register("kryptonite_dynamite", () -> new KryptoniteDynamiteItem());
	public static final RegistryObject<Item> KRYPTONITE_BOW = REGISTRY.register("kryptonite_bow", () -> new KryptoniteBowItem());
	public static final RegistryObject<Item> RADAR = block(KryptadiumModBlocks.RADAR);
	public static final RegistryObject<Item> KRYPTONITETNTBLOWUP_1 = block(KryptadiumModBlocks.KRYPTONITETNTBLOWUP_1);
	public static final RegistryObject<Item> KRYPTONITETNTBLOWUP_2 = block(KryptadiumModBlocks.KRYPTONITETNTBLOWUP_2);
	public static final RegistryObject<Item> KRYPTONITE_TORCH = block(KryptadiumModBlocks.KRYPTONITE_TORCH);
	public static final RegistryObject<Item> KRYPTONITE_NUGGETS = REGISTRY.register("kryptonite_nuggets", () -> new KryptoniteNuggetsItem());
	public static final RegistryObject<Item> KRYPTONITE_LANTERN = block(KryptadiumModBlocks.KRYPTONITE_LANTERN);
	public static final RegistryObject<Item> RADAR_COOLDOWN = block(KryptadiumModBlocks.RADAR_COOLDOWN);
	public static final RegistryObject<Item> KRYPTONITE_HAMMER = REGISTRY.register("kryptonite_hammer", () -> new KryptoniteHammerItem());
	public static final RegistryObject<Item> KRYPTONITE_CHEST = block(KryptadiumModBlocks.KRYPTONITE_CHEST);
	public static final RegistryObject<Item> KRYPTONITE_BOSS_SPAWN_EGG = REGISTRY.register("kryptonite_boss_spawn_egg", () -> new ForgeSpawnEggItem(KryptadiumModEntities.KRYPTONITE_BOSS, -13369549, -16724941, new Item.Properties()));
	public static final RegistryObject<Item> KRYPTAXO_SPAWN_EGG = REGISTRY.register("kryptaxo_spawn_egg", () -> new ForgeSpawnEggItem(KryptadiumModEntities.KRYPTAXO, -13369549, -16724992, new Item.Properties()));

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}

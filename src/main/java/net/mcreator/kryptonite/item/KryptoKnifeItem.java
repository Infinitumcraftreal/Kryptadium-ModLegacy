
package net.mcreator.kryptonite.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.kryptonite.init.KryptadiumModItems;

public class KryptoKnifeItem extends SwordItem {
	public KryptoKnifeItem() {
		super(new Tier() {
			public int getUses() {
				return 2524;
			}

			public float getSpeed() {
				return 14f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(KryptadiumModItems.KRYPTONITE.get()));
			}
		}, 3, -0.25f, new Item.Properties());
	}
}

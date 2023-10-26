
package net.mcreator.kryptonite.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.kryptonite.init.KryptadiumModItems;

public class KryptoniteHoeItem extends HoeItem {
	public KryptoniteHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 2014;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 18;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(KryptadiumModItems.KRYPTONITE.get()));
			}
		}, 0, 0f, new Item.Properties());
	}
}


package net.mcreator.kryptonite.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.kryptonite.init.KryptadiumModItems;

public class KryptoniteSwordItem extends SwordItem {
	public KryptoniteSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 2100;
			}

			public float getSpeed() {
				return 11f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 16;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(KryptadiumModItems.KRYPTONITE.get()));
			}
		}, 3, -2.4f, new Item.Properties());
	}
}

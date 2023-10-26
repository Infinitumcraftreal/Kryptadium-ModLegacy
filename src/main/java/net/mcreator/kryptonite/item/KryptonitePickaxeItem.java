
package net.mcreator.kryptonite.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.kryptonite.init.KryptadiumModItems;

public class KryptonitePickaxeItem extends PickaxeItem {
	public KryptonitePickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 3200;
			}

			public float getSpeed() {
				return 13f;
			}

			public float getAttackDamageBonus() {
				return 4f;
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
		}, 1, -2.8f, new Item.Properties());
	}
}

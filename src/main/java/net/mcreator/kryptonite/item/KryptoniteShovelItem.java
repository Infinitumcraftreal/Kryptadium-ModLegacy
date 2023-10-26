
package net.mcreator.kryptonite.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.kryptonite.init.KryptadiumModItems;

public class KryptoniteShovelItem extends ShovelItem {
	public KryptoniteShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 2125;
			}

			public float getSpeed() {
				return 11f;
			}

			public float getAttackDamageBonus() {
				return 1.75f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 17;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(KryptadiumModItems.KRYPTONITE.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}

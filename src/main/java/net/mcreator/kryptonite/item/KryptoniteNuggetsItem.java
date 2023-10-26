
package net.mcreator.kryptonite.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class KryptoniteNuggetsItem extends Item {
	public KryptoniteNuggetsItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}

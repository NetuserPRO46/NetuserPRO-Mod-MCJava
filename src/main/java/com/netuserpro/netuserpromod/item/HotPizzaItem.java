
package com.netuserpro.netuserpromod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import com.netuserpro.netuserpromod.itemgroup.NetuserPROModItemGroup;
import com.netuserpro.netuserpromod.NetuserproModModElements;

@NetuserproModModElements.ModElement.Tag
public class HotPizzaItem extends NetuserproModModElements.ModElement {
	@ObjectHolder("netuserpro_mod:hot_pizza")
	public static final Item block = null;
	public HotPizzaItem(NetuserproModModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(NetuserPROModItemGroup.tab).maxStackSize(7)
					.food((new Food.Builder()).hunger(6).saturation(0.5f).build()));
			setRegistryName("hot_pizza");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}

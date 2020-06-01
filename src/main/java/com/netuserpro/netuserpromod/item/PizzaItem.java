
package com.netuserpro.netuserpromod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import com.netuserpro.netuserpromod.itemgroup.NetuserPROModItemGroup;
import com.netuserpro.netuserpromod.NetuserproModModElements;

@NetuserproModModElements.ModElement.Tag
public class PizzaItem extends NetuserproModModElements.ModElement {
	@ObjectHolder("netuserpro_mod:pizza")
	public static final Item block = null;
	public PizzaItem(NetuserproModModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(NetuserPROModItemGroup.tab).maxStackSize(7)
					.food((new Food.Builder()).hunger(4).saturation(0.3f).build()));
			setRegistryName("pizza");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}

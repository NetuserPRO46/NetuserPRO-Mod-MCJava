
package com.netuserpro.netuserpromod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import com.netuserpro.netuserpromod.itemgroup.NetuserPROModItemGroup;
import com.netuserpro.netuserpromod.NetuserproModModElements;

@NetuserproModModElements.ModElement.Tag
public class MoneyItem extends NetuserproModModElements.ModElement {
	@ObjectHolder("netuserpro_mod:money")
	public static final Item block = null;
	public MoneyItem(NetuserproModModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(NetuserPROModItemGroup.tab).maxStackSize(64));
			setRegistryName("money");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}

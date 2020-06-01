
package com.netuserpro.netuserpromod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import com.netuserpro.netuserpromod.item.PizzaItem;
import com.netuserpro.netuserpromod.NetuserproModModElements;

@NetuserproModModElements.ModElement.Tag
public class NetuserPROModItemGroup extends NetuserproModModElements.ModElement {
	public NetuserPROModItemGroup(NetuserproModModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabnetuser_pro_mod") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(PizzaItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}

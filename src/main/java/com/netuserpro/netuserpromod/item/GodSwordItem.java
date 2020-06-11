
package com.netuserpro.netuserpromod.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.netuserpro.netuserpromod.itemgroup.NetuserPROModItemGroup;
import com.netuserpro.netuserpromod.NetuserproModModElements;

@NetuserproModModElements.ModElement.Tag
public class GodSwordItem extends NetuserproModModElements.ModElement {
	@ObjectHolder("netuserpro_mod:god_sword")
	public static final Item block = null;
	public GodSwordItem(NetuserproModModElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 99999;
			}

			public float getEfficiency() {
				return 9999f;
			}

			public float getAttackDamage() {
				return 9997f;
			}

			public int getHarvestLevel() {
				return 9999;
			}

			public int getEnchantability() {
				return 9999;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.GOLD_INGOT, (int) (1)), new ItemStack(Items.DIAMOND, (int) (1)),
						new ItemStack(Items.GOLDEN_SWORD, (int) (1)));
			}
		}, 3, 96f, new Item.Properties().group(NetuserPROModItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public boolean hasEffect(ItemStack itemstack) {
				return true;
			}
		}.setRegistryName("god_sword"));
	}
}

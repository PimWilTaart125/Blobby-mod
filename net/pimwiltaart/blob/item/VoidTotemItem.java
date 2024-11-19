
package net.pimwiltaart.blob.item;

import net.minecraft.class_1297;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1814;
import net.minecraft.class_1836;
import net.minecraft.class_1937;
import net.minecraft.class_2561;
import net.pimwiltaart.blob.procedures.VoidTotemItemInInventoryTickProcedure;
import java.util.List;

public class VoidTotemItem extends class_1792 {
	public VoidTotemItem() {
		super(new class_1792.class_1793().method_7889(1).method_7894(class_1814.field_8907));
	}

	@Override
	public int method_7881(class_1799 itemstack) {
		return 0;
	}

	@Override
	public void method_7851(class_1799 itemstack, class_1937 world, List<class_2561> list, class_1836 flag) {
		super.method_7851(itemstack, world, list, flag);
		list.add(class_2561.method_43470("Fall In The Void"));
	}

	@Override
	public void method_7888(class_1799 itemstack, class_1937 world, class_1297 entity, int slot, boolean selected) {
		super.method_7888(itemstack, world, entity, slot, selected);
		VoidTotemItemInInventoryTickProcedure.execute(entity.method_23318(), entity);
	}
}

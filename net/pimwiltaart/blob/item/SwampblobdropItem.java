
package net.pimwiltaart.blob.item;

import net.pimwiltaart.blob.procedures.SwampblobdropItemInHandTickProcedure;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.class_1297;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1814;
import net.minecraft.class_1836;
import net.minecraft.class_1937;
import net.minecraft.class_2561;
import net.minecraft.class_7706;
import java.util.List;

public class SwampblobdropItem extends class_1792 {
	public SwampblobdropItem() {
		super(new class_1792.class_1793().method_7889(1).method_7894(class_1814.field_8907));
		ItemGroupEvents.modifyEntriesEvent(class_7706.field_41062).register(content -> content.method_45421(this));
	}

	@Override
	public int method_7881(class_1799 itemstack) {
		return 0;
	}

	@Override
	public void method_7851(class_1799 itemstack, class_1937 world, List<class_2561> list, class_1836 flag) {
		super.method_7851(itemstack, world, list, flag);
	}

	@Override
	public void method_7888(class_1799 itemstack, class_1937 world, class_1297 entity, int slot, boolean selected) {
		super.method_7888(itemstack, world, entity, slot, selected);
		SwampblobdropItemInHandTickProcedure.execute(entity);
	}
}

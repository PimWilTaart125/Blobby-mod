package net.pimwiltaart.blob.procedures;

import net.minecraft.class_1282;
import net.minecraft.class_1297;
import net.minecraft.class_1936;
import net.minecraft.class_7924;
import net.minecraft.class_8111;

public class VoidBossWaterThingProcedure {
	public static void execute(class_1936 world, class_1297 entity) {
		if (entity == null)
			return;
		if (entity.method_5637()) {
			entity.method_5643(new class_1282(world.method_30349().method_30530(class_7924.field_42534).method_40290(class_8111.field_42352)), 1);
		}
	}
}

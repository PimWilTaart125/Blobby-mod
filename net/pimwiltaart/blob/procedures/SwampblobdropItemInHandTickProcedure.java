package net.pimwiltaart.blob.procedures;

import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1309;

public class SwampblobdropItemInHandTickProcedure {
	public static void execute(class_1297 entity) {
		if (entity == null)
			return;
		if (entity instanceof class_1309 _entity && !_entity.method_37908().method_8608())
			_entity.method_6092(new class_1293(class_1294.field_5913, 1, 5));
	}
}

package net.pimwiltaart.blob.procedures;

import net.minecraft.class_1293;
import net.minecraft.class_1297;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2668;
import net.minecraft.class_2673;
import net.minecraft.class_2696;
import net.minecraft.class_2783;
import net.minecraft.class_2960;
import net.minecraft.class_3218;
import net.minecraft.class_3222;
import net.minecraft.class_5321;
import net.minecraft.class_7924;

public class VoidTotemItemInInventoryTickProcedure {
	public static void execute(double y, class_1297 entity) {
		if (entity == null)
			return;
		if (y <= -65) {
			if (entity instanceof class_3222 _player && !_player.method_37908().method_8608()) {
				class_5321<class_1937> destinationType = class_5321.method_29179(class_7924.field_41223, new class_2960("blob:voiddimension"));
				if (_player.method_37908().method_27983() == destinationType)
					return;
				class_3218 nextLevel = _player.field_13995.method_3847(destinationType);
				if (nextLevel != null) {
					_player.field_13987.method_14364(new class_2668(class_2668.field_25649, 0));
					_player.method_14251(nextLevel, _player.method_23317(), _player.method_23318(), _player.method_23321(), _player.method_36454(), _player.method_36455());
					_player.field_13987.method_14364(new class_2696(_player.method_31549()));
					for (class_1293 _effectinstance : _player.method_6026())
						_player.field_13987.method_14364(new class_2783(_player.method_5628(), _effectinstance));
					_player.field_13987.method_14364(new class_2673(1032, class_2338.field_10980, 0, false));
				}
			}
		}
	}
}

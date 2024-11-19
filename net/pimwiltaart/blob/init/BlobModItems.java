/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.pimwiltaart.blob.init;

import net.pimwiltaart.blob.item.VoidTotemItem;
import net.pimwiltaart.blob.item.SwampblobdropItem;
import net.pimwiltaart.blob.BlobMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_1826;
import net.minecraft.class_2378;
import net.minecraft.class_2960;
import net.minecraft.class_5272;
import net.minecraft.class_6395;
import net.minecraft.class_7706;
import net.minecraft.class_7923;

public class BlobModItems {
	public static class_1792 SWAMPBLOB_SPAWN_EGG;
	public static class_1792 SWAMPBLOBDROP;
	public static class_1792 VOID_BOSS_SPAWN_EGG;
	public static class_1792 VOID_TOTEM;

	public static void load() {
		SWAMPBLOB_SPAWN_EGG = register("swampblob_spawn_egg", new class_1826(BlobModEntities.SWAMPBLOB, -3355648, -26368, new class_1792.class_1793()));
		ItemGroupEvents.modifyEntriesEvent(class_7706.field_40205).register(content -> content.method_45421(SWAMPBLOB_SPAWN_EGG));
		SWAMPBLOBDROP = register("swampblobdrop", new SwampblobdropItem());
		VOID_BOSS_SPAWN_EGG = register("void_boss_spawn_egg", new class_1826(BlobModEntities.VOID_BOSS, -65281, -16777216, new class_1792.class_1793()));
		ItemGroupEvents.modifyEntriesEvent(class_7706.field_40205).register(content -> content.method_45421(VOID_BOSS_SPAWN_EGG));
		VOID_TOTEM = register("void_totem", new VoidTotemItem());
	}

	public static void clientLoad() {
	}

	private static class_1792 register(String registryName, class_1792 item) {
		return class_2378.method_10230(class_7923.field_41178, new class_2960(BlobMod.MODID, registryName), item);
	}

	private static void registerBlockingProperty(class_1792 item) {
		class_5272.method_27879(item, new class_2960("blocking"), (class_6395) class_5272.method_27878(class_1802.field_8255, new class_2960("blocking")));
	}
}

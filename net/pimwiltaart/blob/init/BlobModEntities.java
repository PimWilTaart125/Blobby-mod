
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.pimwiltaart.blob.init;

import net.pimwiltaart.blob.entity.VoidBossEntity;
import net.pimwiltaart.blob.entity.SwampblobEntity;
import net.pimwiltaart.blob.BlobMod;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1311;
import net.minecraft.class_2378;
import net.minecraft.class_2960;
import net.minecraft.class_4048;
import net.minecraft.class_7923;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class BlobModEntities {
	public static class_1299<SwampblobEntity> SWAMPBLOB;
	public static class_1299<VoidBossEntity> VOID_BOSS;

	public static void load() {
		SWAMPBLOB = class_2378.method_10230(class_7923.field_41177, new class_2960(BlobMod.MODID, "swampblob"),
				FabricEntityTypeBuilder.create(class_1311.field_6302, SwampblobEntity::new).dimensions(new class_4048(2f, 2f, true)).trackRangeBlocks(128).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		SwampblobEntity.init();
		FabricDefaultAttributeRegistry.register(SWAMPBLOB, SwampblobEntity.createAttributes());
		VOID_BOSS = class_2378.method_10230(class_7923.field_41177, new class_2960(BlobMod.MODID, "void_boss"),
				FabricEntityTypeBuilder.create(class_1311.field_6302, VoidBossEntity::new).dimensions(new class_4048(1f, 7f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		VoidBossEntity.init();
		FabricDefaultAttributeRegistry.register(VOID_BOSS, VoidBossEntity.createAttributes());
	}

	private static <T extends class_1297> class_1299<T> createArrowEntityType(class_1299.class_4049<T> factory) {
		return FabricEntityTypeBuilder.create(class_1311.field_17715, factory).dimensions(class_4048.method_18385(0.5f, 0.5f)).trackRangeBlocks(1).trackedUpdateRate(64).build();
	}
}


/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.pimwiltaart.blob.init;

import net.pimwiltaart.blob.BlobMod;
import net.minecraft.class_1959;
import net.minecraft.class_2378;
import net.minecraft.class_2874;
import net.minecraft.class_2960;
import net.minecraft.class_5321;
import net.minecraft.class_5363;
import net.minecraft.class_7924;
import net.minecraft.server.MinecraftServer;

public class BlobModBiomes {
	public static class_5321<class_1959> VOIDBIOME = class_5321.method_29179(class_7924.field_41236, new class_2960(BlobMod.MODID, "voidbiome"));

	public static void loadEndBiomes() {
	}

	public static void load(MinecraftServer server) {
		class_2378<class_2874> dimensionTypeRegistry = server.method_30611().method_30530(class_7924.field_41241);
		class_2378<class_5363> levelStemTypeRegistry = server.method_30611().method_30530(class_7924.field_41224);
		class_2378<class_1959> biomeRegistry = server.method_30611().method_30530(class_7924.field_41236);
		for (class_5363 levelStem : levelStemTypeRegistry.method_10220().toList()) {
			class_2874 dimensionType = levelStem.comp_1012().comp_349();

		}
	}
}

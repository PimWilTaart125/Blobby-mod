
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.pimwiltaart.blob.init;

import net.minecraft.class_2248;
import net.minecraft.class_2378;
import net.minecraft.class_2960;
import net.minecraft.class_7923;
import net.pimwiltaart.blob.BlobMod;

public class BlobModBlocks {
	public static void load() {
	}

	public static void clientLoad() {
	}

	private static class_2248 register(String registryName, class_2248 block) {
		return class_2378.method_10230(class_7923.field_41175, new class_2960(BlobMod.MODID, registryName), block);
	}
}

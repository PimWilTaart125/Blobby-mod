
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.pimwiltaart.blob.init;

import net.pimwiltaart.blob.client.renderer.VoidBossRenderer;
import net.pimwiltaart.blob.client.renderer.SwampblobRenderer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class BlobModEntityRenderers {
	public static void load() {
		EntityRendererRegistry.register(BlobModEntities.SWAMPBLOB, SwampblobRenderer::new);
		EntityRendererRegistry.register(BlobModEntities.VOID_BOSS, VoidBossRenderer::new);
	}
}

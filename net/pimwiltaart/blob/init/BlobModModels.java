
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.pimwiltaart.blob.init;

import net.pimwiltaart.blob.client.model.Modelvoidboss;
import net.pimwiltaart.blob.client.model.Modelswamp_blob;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class BlobModModels {
	public static void load() {
		EntityModelLayerRegistry.registerModelLayer(Modelvoidboss.LAYER_LOCATION, Modelvoidboss::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelswamp_blob.LAYER_LOCATION, Modelswamp_blob::createBodyLayer);
	}
}

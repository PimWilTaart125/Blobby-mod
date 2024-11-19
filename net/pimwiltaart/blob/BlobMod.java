/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.pimwiltaart.blob;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.pimwiltaart.blob.init.BlobModSounds;
import net.pimwiltaart.blob.init.BlobModProcedures;
import net.pimwiltaart.blob.init.BlobModItems;
import net.pimwiltaart.blob.init.BlobModEntities;
import net.pimwiltaart.blob.init.BlobModBlocks;
import net.pimwiltaart.blob.init.BlobModBiomes;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.api.ModInitializer;

public class BlobMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "blob";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing BlobMod");

		BlobModEntities.load();
		BlobModBlocks.load();
		BlobModItems.load();

		BlobModProcedures.load();

		BlobModSounds.load();

		BlobModBiomes.loadEndBiomes();
		ServerLifecycleEvents.SERVER_STARTING.register((server) -> {
			BlobModBiomes.load(server);
		});
	}
}

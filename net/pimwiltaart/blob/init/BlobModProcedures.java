
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.pimwiltaart.blob.init;

import net.pimwiltaart.blob.procedures.VoidTotemItemInInventoryTickProcedure;
import net.pimwiltaart.blob.procedures.VoidBossWaterThingProcedure;
import net.pimwiltaart.blob.procedures.SwampblobdropItemInHandTickProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class BlobModProcedures {
	public static void load() {
		new SwampblobdropItemInHandTickProcedure();
		new VoidBossWaterThingProcedure();
		new VoidTotemItemInInventoryTickProcedure();
	}
}

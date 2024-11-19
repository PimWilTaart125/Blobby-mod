
package net.pimwiltaart.blob.client.renderer;

import net.pimwiltaart.blob.entity.SwampblobEntity;
import net.minecraft.class_2960;
import net.minecraft.class_5617;
import net.minecraft.class_927;
import net.pimwiltaart.blob.client.model.Modelswamp_blob;

public class SwampblobRenderer extends class_927<SwampblobEntity, Modelswamp_blob<SwampblobEntity>> {
	public SwampblobRenderer(class_5617.class_5618 context) {
		super(context, new Modelswamp_blob(context.method_32167(Modelswamp_blob.LAYER_LOCATION)), 1.5f);
	}

	@Override
	public class_2960 getTextureLocation(SwampblobEntity entity) {
		return new class_2960("blob:textures/entities/swamp_blob.png");
	}

}

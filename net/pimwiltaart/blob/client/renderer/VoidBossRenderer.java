
package net.pimwiltaart.blob.client.renderer;

import net.pimwiltaart.blob.entity.VoidBossEntity;
import net.minecraft.class_2960;
import net.minecraft.class_5617;
import net.minecraft.class_927;
import net.pimwiltaart.blob.client.model.Modelvoidboss;

public class VoidBossRenderer extends class_927<VoidBossEntity, Modelvoidboss<VoidBossEntity>> {
	public VoidBossRenderer(class_5617.class_5618 context) {
		super(context, new Modelvoidboss(context.method_32167(Modelvoidboss.LAYER_LOCATION)), 5f);
	}

	@Override
	public class_2960 getTextureLocation(VoidBossEntity entity) {
		return new class_2960("blob:textures/entities/texture.png");
	}

}

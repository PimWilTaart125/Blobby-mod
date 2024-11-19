package net.pimwiltaart.blob.client.model;

import net.minecraft.class_1297;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_5601;
import net.minecraft.class_5603;
import net.minecraft.class_5605;
import net.minecraft.class_5606;
import net.minecraft.class_5607;
import net.minecraft.class_5609;
import net.minecraft.class_5610;
import net.minecraft.class_583;
import net.minecraft.class_630;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelvoidboss<T extends class_1297> extends class_583<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final class_5601 LAYER_LOCATION = new class_5601(new class_2960("blob", "modelvoidboss"), "main");
	public final class_630 nek;
	public final class_630 body;
	public final class_630 headnhorns;
	public final class_630 been1;
	public final class_630 been2;
	public final class_630 arm2;
	public final class_630 arm1;

	public Modelvoidboss(class_630 root) {
		this.nek = root.method_32086("nek");
		this.body = root.method_32086("body");
		this.headnhorns = root.method_32086("headnhorns");
		this.been1 = root.method_32086("been1");
		this.been2 = root.method_32086("been2");
		this.arm2 = root.method_32086("arm2");
		this.arm1 = root.method_32086("arm1");
	}

	public static class_5607 createBodyLayer() {
		class_5609 meshdefinition = new class_5609();
		class_5610 partdefinition = meshdefinition.method_32111();
		class_5610 nek = partdefinition.method_32117("nek", class_5606.method_32108().method_32101(46, 0).method_32098(-13.0F, -2.0F, -1.0F, 14.0F, 2.0F, 13.0F, new class_5605(0.0F)), class_5603.method_32090(6.0F, -64.0F, -11.0F));
		class_5610 body = partdefinition.method_32117("body", class_5606.method_32108().method_32101(0, 0).method_32098(-14.0F, 0.0F, 4.0F, 16.0F, 40.0F, 7.0F, new class_5605(0.0F)), class_5603.method_32090(6.0F, -64.0F, -11.0F));
		class_5610 headnhorns = partdefinition.method_32117("headnhorns",
				class_5606.method_32108().method_32101(100, 53).method_32098(13.0F, 32.0F, 1.0F, 1.0F, 1.0F, 2.0F, new class_5605(0.0F)).method_32101(36, 51).method_32098(16.0F, 31.0F, 1.0F, 2.0F, 2.0F, 2.0F, new class_5605(0.0F)).method_32101(36, 47)
						.method_32098(9.0F, 31.0F, 1.0F, 3.0F, 2.0F, 2.0F, new class_5605(0.0F)).method_32101(52, 94).method_32098(7.0F, 32.0F, 1.0F, 1.0F, 1.0F, 2.0F, new class_5605(0.0F)).method_32101(52, 87)
						.method_32098(14.0F, 28.0F, 1.0F, 1.0F, 5.0F, 2.0F, new class_5605(0.0F)).method_32101(30, 47).method_32098(12.0F, 26.0F, 1.0F, 1.0F, 7.0F, 2.0F, new class_5605(0.0F)).method_32101(110, 53)
						.method_32098(6.0F, 28.0F, 1.0F, 1.0F, 5.0F, 2.0F, new class_5605(0.0F)).method_32101(60, 69).method_32098(18.0F, 17.0F, 1.0F, 1.0F, 16.0F, 13.0F, new class_5605(0.0F)).method_32101(0, 77)
						.method_32098(5.0F, 17.0F, 1.0F, 1.0F, 16.0F, 13.0F, new class_5605(0.0F)).method_32101(110, 60).method_32098(11.0F, 29.0F, 1.0F, 1.0F, 4.0F, 2.0F, new class_5605(0.0F)).method_32101(88, 45)
						.method_32098(6.0F, 17.0F, 1.0F, 12.0F, 7.0F, 1.0F, new class_5605(0.0F)).method_32101(88, 53).method_32098(6.0F, 24.0F, 1.0F, 2.0F, 2.0F, 1.0F, new class_5605(0.0F)).method_32101(112, 33)
						.method_32098(8.0F, 24.0F, 1.0F, 1.0F, 5.0F, 1.0F, new class_5605(0.0F)).method_32101(114, 49).method_32098(9.0F, 24.0F, 1.0F, 1.0F, 2.0F, 1.0F, new class_5605(0.0F)).method_32101(84, 112)
						.method_32098(10.0F, 24.0F, 1.0F, 1.0F, 3.0F, 1.0F, new class_5605(0.0F)).method_32101(94, 53).method_32098(11.0F, 24.0F, 1.0F, 1.0F, 1.0F, 2.0F, new class_5605(0.0F)).method_32101(112, 39)
						.method_32098(16.0F, 24.0F, 1.0F, 1.0F, 5.0F, 1.0F, new class_5605(0.0F)).method_32101(88, 115).method_32098(15.0F, 24.0F, 1.0F, 1.0F, 2.0F, 1.0F, new class_5605(0.0F)).method_32101(110, 66)
						.method_32098(17.0F, 24.0F, 1.0F, 1.0F, 1.0F, 2.0F, new class_5605(0.0F)).method_32101(114, 45).method_32098(13.0F, 24.0F, 1.0F, 1.0F, 3.0F, 1.0F, new class_5605(0.0F)).method_32101(60, 57)
						.method_32098(6.0F, 17.0F, 3.0F, 12.0F, 1.0F, 11.0F, new class_5605(0.0F)).method_32101(0, 106).method_32098(24.0F, -8.0F, -1.0F, 2.0F, 8.0F, 7.0F, new class_5605(0.0F)).method_32101(-5, -5)
						.method_32098(-1.0F, -8.0F, -1.0F, 2.0F, 8.0F, 7.0F, new class_5605(0.0F)),
				class_5603.method_32090(-12.0F, -99.0F, -13.0F));
		class_5610 cube_r1 = headnhorns.method_32117("cube_r1", class_5606.method_32108().method_32101(-8, -6).method_32098(-3.0F, -7.0F, -1.0F, 4.0F, 7.0F, 8.0F, new class_5605(0.0F)),
				class_5603.method_32091(2.0F, 7.0F, 1.0F, 0.0F, 0.0F, -0.1309F));
		class_5610 cube_r2 = headnhorns.method_32117("cube_r2", class_5606.method_32108().method_32101(-9, -6).method_32098(-4.0F, -116.0F, -1.0F, 5.0F, 8.0F, 8.0F, new class_5605(0.0F)),
				class_5603.method_32091(28.0F, 120.0F, 3.0F, 0.0F, 0.0F, -0.2182F));
		class_5610 cube_r3 = headnhorns.method_32117("cube_r3", class_5606.method_32108().method_32101(-10, -6).method_32098(10.0F, -7.0F, 0.0F, 6.0F, 10.0F, 8.0F, new class_5605(0.0F)),
				class_5603.method_32091(-6.0F, 26.0F, 4.0F, 0.0F, 0.0F, -0.3927F));
		class_5610 cube_r4 = headnhorns.method_32117("cube_r4", class_5606.method_32108().method_32101(100, 0).method_32098(-3.0F, -7.0F, -1.0F, 4.0F, 7.0F, 8.0F, new class_5605(0.0F)),
				class_5603.method_32091(25.0F, 7.0F, 1.0F, 0.0F, 0.0F, 0.1309F));
		class_5610 cube_r5 = headnhorns.method_32117("cube_r5", class_5606.method_32108().method_32101(104, 87).method_32098(-4.0F, -8.0F, -1.0F, 5.0F, 8.0F, 8.0F, new class_5605(0.0F)),
				class_5603.method_32091(23.0F, 15.0F, 3.0F, 0.0F, 0.0F, 0.2182F));
		class_5610 cube_r6 = headnhorns.method_32117("cube_r6", class_5606.method_32108().method_32101(88, 69).method_32098(-5.0F, -10.0F, -1.0F, 6.0F, 10.0F, 8.0F, new class_5605(0.0F)),
				class_5603.method_32091(19.0F, 24.0F, 5.0F, 0.0F, 0.0F, 0.3927F));
		class_5610 cube_r7 = headnhorns.method_32117("cube_r7", class_5606.method_32108().method_32101(30, 57).method_32098(0.0F, -16.0F, -1.0F, 1.0F, 16.0F, 14.0F, new class_5605(0.0F)),
				class_5603.method_32091(6.0F, 33.0F, 3.0F, 0.0F, 1.5708F, 0.0F));
		class_5610 cube_r8 = headnhorns.method_32117("cube_r8", class_5606.method_32108().method_32101(0, 47).method_32098(0.0F, -16.0F, -1.0F, 1.0F, 16.0F, 14.0F, new class_5605(0.0F)),
				class_5603.method_32091(6.0F, 33.0F, 15.0F, 0.0F, 1.5708F, 0.0F));
		class_5610 been1 = partdefinition.method_32117("been1", class_5606.method_32108().method_32101(84, 98).method_32098(-5.0F, -13.0F, -1.0F, 1.0F, 13.0F, 1.0F, new class_5605(0.0F)).method_32101(18, 106)
				.method_32098(-6.0F, -29.0F, -2.0F, 3.0F, 16.0F, 2.0F, new class_5605(0.0F)).method_32101(68, 98).method_32098(-7.0F, -48.0F, -4.0F, 5.0F, 19.0F, 3.0F, new class_5605(0.0F)), class_5603.method_32090(0.0F, 24.0F, 0.0F));
		class_5610 been2 = partdefinition.method_32117("been2", class_5606.method_32108().method_32101(106, 53).method_32098(4.0F, -13.0F, -1.0F, 1.0F, 13.0F, 1.0F, new class_5605(0.0F)).method_32101(112, 15)
				.method_32098(3.0F, -29.0F, -2.0F, 3.0F, 16.0F, 2.0F, new class_5605(0.0F)).method_32101(104, 103).method_32098(2.0F, -48.0F, -4.0F, 5.0F, 19.0F, 3.0F, new class_5605(0.0F)), class_5603.method_32090(0.0F, 24.0F, 0.0F));
		class_5610 arm2 = partdefinition.method_32117("arm2", class_5606.method_32108().method_32101(46, 15).method_32098(18.0F, -55.0F, -41.0F, 2.0F, 2.0F, 19.0F, new class_5605(0.0F)), class_5603.method_32090(0.0F, 24.0F, 0.0F));
		class_5610 cube_r9 = arm2.method_32117("cube_r9", class_5606.method_32108().method_32101(88, 87).method_32098(-3.0F, -24.0F, -1.0F, 4.0F, 24.0F, 4.0F, new class_5605(0.0F)),
				class_5603.method_32091(20.0F, -55.0F, -25.0F, -1.1345F, 0.0F, -0.0436F));
		class_5610 cube_r10 = arm2.method_32117("cube_r10", class_5606.method_32108().method_32101(28, 87).method_32098(-5.0F, -24.0F, -1.0F, 6.0F, 24.0F, 6.0F, new class_5605(0.0F)),
				class_5603.method_32091(19.0F, -65.0F, -6.0F, 0.0F, 0.0F, -0.5236F));
		class_5610 arm1 = partdefinition.method_32117("arm1", class_5606.method_32108().method_32101(88, 15).method_32098(-14.0F, -87.0F, -7.0F, 6.0F, 24.0F, 6.0F, new class_5605(0.0F)), class_5603.method_32090(0.0F, 24.0F, 0.0F));
		class_5610 cube_r11 = arm1.method_32117("cube_r11", class_5606.method_32108().method_32101(46, 36).method_32098(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 19.0F, new class_5605(0.0F)),
				class_5603.method_32091(-11.0F, -25.0F, -18.0F, 1.309F, 0.0F, 0.0F));
		class_5610 cube_r12 = arm1.method_32117("cube_r12", class_5606.method_32108().method_32101(52, 98).method_32098(-3.0F, -24.0F, -1.0F, 4.0F, 24.0F, 4.0F, new class_5605(0.0F)),
				class_5603.method_32091(-10.0F, -42.0F, -15.0F, -0.3927F, 0.0F, -0.0436F));
		return class_5607.method_32110(meshdefinition, 256, 256);
	}

	@Override
	public void method_2819(class_1297 entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void method_2828(class_4587 poseStack, class_4588 vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		nek.method_22699(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.method_22699(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		headnhorns.method_22699(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		been1.method_22699(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		been2.method_22699(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arm2.method_22699(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arm1.method_22699(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}

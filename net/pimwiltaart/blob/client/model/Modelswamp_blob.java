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
public class Modelswamp_blob<T extends class_1297> extends class_583<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final class_5601 LAYER_LOCATION = new class_5601(new class_2960("blob", "modelswamp_blob"), "main");
	public final class_630 bone;
	public final class_630 bb_main;

	public Modelswamp_blob(class_630 root) {
		this.bone = root.method_32086("bone");
		this.bb_main = root.method_32086("bb_main");
	}

	public static class_5607 createBodyLayer() {
		class_5609 meshdefinition = new class_5609();
		class_5610 partdefinition = meshdefinition.method_32111();
		class_5610 bone = partdefinition.method_32117("bone", class_5606.method_32108(), class_5603.method_32090(0.0F, 24.0F, 0.0F));
		class_5610 bb_main = partdefinition.method_32117("bb_main",
				class_5606.method_32108().method_32101(95, 34).method_32098(-18.0F, -3.0F, -13.0F, 7.0F, 3.0F, 14.0F, new class_5605(0.0F)).method_32101(27, 110).method_32098(15.0F, -3.0F, -15.0F, 5.0F, 3.0F, 11.0F, new class_5605(0.0F)).method_32101(60, 110)
						.method_32098(5.0F, -24.0F, -7.0F, 2.0F, 7.0F, 11.0F, new class_5605(0.0F)).method_32101(115, 20).method_32098(-4.0F, -21.0F, -8.0F, 3.0F, 2.0F, 2.0F, new class_5605(0.0F)).method_32101(96, 121)
						.method_32098(-3.0F, -25.0F, -7.0F, 1.0F, 4.0F, 1.0F, new class_5605(0.0F)).method_32101(115, 25).method_32098(-1.0F, -25.0F, -8.0F, 3.0F, 2.0F, 2.0F, new class_5605(0.0F)).method_32101(115, 30)
						.method_32098(0.0F, -23.0F, -8.0F, 2.0F, 2.0F, 1.0F, new class_5605(0.0F)).method_32101(87, 110).method_32098(1.0F, -22.0F, -7.0F, 1.0F, 5.0F, 1.0F, new class_5605(0.0F)).method_32101(87, 121)
						.method_32098(3.0F, -19.0F, -7.0F, 2.0F, 2.0F, 2.0F, new class_5605(0.0F)).method_32101(101, 121).method_32098(3.0F, -22.0F, -6.0F, 1.0F, 3.0F, 1.0F, new class_5605(0.0F)).method_32101(106, 121)
						.method_32098(2.0F, -24.0F, -7.0F, 1.0F, 3.0F, 1.0F, new class_5605(0.0F)),
				class_5603.method_32090(0.0F, 24.0F, 0.0F));
		class_5610 cube_r1 = bb_main.method_32117("cube_r1", class_5606.method_32108().method_32101(57, 83).method_32098(-1.0F, -3.0F, -2.0F, 3.0F, 3.0F, 3.0F, new class_5605(0.0F)),
				class_5603.method_32091(-4.0F, -26.0F, -3.0F, 0.0F, 0.0F, -0.0873F));
		class_5610 cube_r2 = bb_main.method_32117("cube_r2", class_5606.method_32108().method_32101(115, 11).method_32098(-1.0F, -4.0F, -3.0F, 4.0F, 4.0F, 4.0F, new class_5605(0.0F)),
				class_5603.method_32091(3.0F, -25.0F, -2.0F, 0.0F, 0.0F, 0.2618F));
		class_5610 cube_r3 = bb_main.method_32117("cube_r3", class_5606.method_32108().method_32101(47, 98).method_32098(-1.0F, -2.0F, -8.0F, 14.0F, 2.0F, 9.0F, new class_5605(0.0F)),
				class_5603.method_32091(-6.0F, -25.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		class_5610 cube_r4 = bb_main.method_32117("cube_r4", class_5606.method_32108().method_32101(57, 90).method_32098(-1.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new class_5605(0.0F)),
				class_5603.method_32091(-4.0F, -17.0F, -7.0F, 0.0F, -0.1745F, 0.0F));
		class_5610 cube_r5 = bb_main.method_32117("cube_r5", class_5606.method_32108().method_32101(95, 57).method_32098(-1.0F, -2.0F, -1.0F, 15.0F, 2.0F, 2.0F, new class_5605(0.0F)),
				class_5603.method_32091(-7.0F, -23.0F, 3.0F, 0.6545F, 0.0F, 0.0F));
		class_5610 cube_r6 = bb_main.method_32117("cube_r6", class_5606.method_32108().method_32101(95, 52).method_32098(-1.0F, -2.0F, -1.0F, 15.0F, 2.0F, 2.0F, new class_5605(0.0F)),
				class_5603.method_32091(-7.0F, -24.0F, 2.0F, 0.6109F, 0.0F, 0.0F));
		class_5610 cube_r7 = bb_main.method_32117("cube_r7",
				class_5606.method_32108().method_32101(0, 110).method_32098(1.0F, -9.0F, -12.0F, 0.0F, 9.0F, 13.0F, new class_5605(0.0F)).method_32101(94, 98).method_32098(-1.0F, -9.0F, -12.0F, 2.0F, 9.0F, 13.0F, new class_5605(0.0F)),
				class_5603.method_32091(-7.0F, -15.0F, 3.0F, -0.1745F, -0.1309F, 0.0F));
		class_5610 cube_r8 = bb_main.method_32117("cube_r8", class_5606.method_32108().method_32101(115, 0).method_32098(-1.0F, -8.0F, -1.0F, 13.0F, 8.0F, 2.0F, new class_5605(0.0F)),
				class_5603.method_32091(-6.0F, -16.0F, 4.0F, 0.1745F, 0.0F, 0.0F));
		class_5610 cube_r9 = bb_main.method_32117("cube_r9", class_5606.method_32108().method_32101(71, 82).method_32098(-1.0F, -2.0F, -12.0F, 15.0F, 2.0F, 13.0F, new class_5605(0.0F)),
				class_5603.method_32091(-7.0F, -15.0F, 3.0F, 0.0F, -0.1309F, 0.0F));
		class_5610 cube_r10 = bb_main.method_32117("cube_r10", class_5606.method_32108().method_32101(0, 0).method_32098(8.0F, -2.0F, -2.0F, -10.0F, 2.0F, 3.0F, new class_5605(0.0F)),
				class_5603.method_32091(-5.0F, -6.0F, -13.0F, 0.0F, -0.1745F, 0.0F));
		class_5610 cube_r11 = bb_main.method_32117("cube_r11", class_5606.method_32108().method_32101(0, 83).method_32098(-1.0F, -3.0F, -11.0F, 16.0F, 3.0F, 12.0F, new class_5605(0.0F)),
				class_5603.method_32091(0.0F, 1.0F, -8.0F, -0.0873F, 0.0F, 0.0F));
		class_5610 cube_r12 = bb_main.method_32117("cube_r12", class_5606.method_32108().method_32101(0, 98).method_32098(-1.0F, -3.0F, -7.0F, 15.0F, 3.0F, 8.0F, new class_5605(0.0F)),
				class_5603.method_32091(14.0F, 0.0F, 5.0F, 0.0F, -2.3998F, 0.0F));
		class_5610 cube_r13 = bb_main.method_32117("cube_r13", class_5606.method_32108().method_32101(71, 62).method_32098(-1.0F, -2.0F, -16.0F, 13.0F, 2.0F, 17.0F, new class_5605(0.0F)),
				class_5603.method_32091(-18.0F, 0.0F, 11.0F, 0.0F, 0.0873F, 0.0F));
		class_5610 cube_r14 = bb_main.method_32117("cube_r14", class_5606.method_32108().method_32101(0, 62).method_32098(-1.0F, -4.0F, -15.0F, 19.0F, 4.0F, 16.0F, new class_5605(0.0F)),
				class_5603.method_32091(-10.0F, -11.0F, 2.0F, 0.0F, -0.3927F, 0.0F));
		class_5610 cube_r15 = bb_main.method_32117("cube_r15", class_5606.method_32108().method_32101(0, 34).method_32098(-1.0F, -5.0F, -21.0F, 25.0F, 5.0F, 22.0F, new class_5605(0.0F)),
				class_5603.method_32091(-12.0F, -6.0F, 8.0F, 0.0F, -0.0873F, 0.0F));
		class_5610 cube_r16 = bb_main.method_32117("cube_r16", class_5606.method_32108().method_32101(0, 0).method_32098(-1.0F, -6.0F, -26.0F, 30.0F, 6.0F, 27.0F, new class_5605(0.0F)),
				class_5603.method_32091(-17.0F, 0.0F, 6.0F, 0.0F, -0.3491F, 0.0F));
		return class_5607.method_32110(meshdefinition, 256, 256);
	}

	@Override
	public void method_2819(class_1297 entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void method_2828(class_4587 poseStack, class_4588 vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.method_22699(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.method_22699(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}

package net.pimwiltaart.blob.entity;

import net.pimwiltaart.blob.procedures.VoidBossWaterThingProcedure;
import net.pimwiltaart.blob.init.BlobModEntities;
import net.pimwiltaart.blob.BlobMod;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.minecraft.class_1282;
import net.minecraft.class_1295;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1308;
import net.minecraft.class_1309;
import net.minecraft.class_1310;
import net.minecraft.class_1311;
import net.minecraft.class_1366;
import net.minecraft.class_1376;
import net.minecraft.class_1379;
import net.minecraft.class_1399;
import net.minecraft.class_1400;
import net.minecraft.class_1588;
import net.minecraft.class_1657;
import net.minecraft.class_1686;
import net.minecraft.class_1937;
import net.minecraft.class_2960;
import net.minecraft.class_3213;
import net.minecraft.class_3222;
import net.minecraft.class_3414;
import net.minecraft.class_5132;
import net.minecraft.class_5134;
import net.minecraft.class_5321;
import net.minecraft.class_5483;
import net.minecraft.class_7923;
import net.minecraft.class_7924;
import net.minecraft.class_8111;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

public class VoidBossEntity extends class_1588 {
	private final class_3213 bossInfo = new class_3213(this.method_5476(), class_3213.BossBarColor.field_5782, class_3213.BossBarOverlay.field_5795);

	public VoidBossEntity(class_1299<VoidBossEntity> type, class_1937 world) {
		super(type, world);
		method_49477(5f);
		field_6194 = 20030;
		method_5977(false);
		method_5971();
	}

	@Override
	protected void method_5959() {
		super.method_5959();
		this.field_6201.method_6277(1, new class_1366(this, 1.2, true) {
			@Override
			protected double method_6289(class_1309 entity) {
				return this.field_6503.method_17681() * this.field_6503.method_17681() + entity.method_17681();
			}
		});
		this.field_6185.method_6277(2, new class_1399(this));
		this.field_6201.method_6277(3, new class_1379(this, 0.8));
		this.field_6201.method_6277(4, new class_1376(this));
		this.field_6185.method_6277(5, new class_1400(this, class_1657.class, true, false));
	}

	@Override
	public class_1310 method_6046() {
		return class_1310.field_6289;
	}

	@Override
	public boolean method_5974(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public class_3414 method_6011(class_1282 ds) {
		return class_7923.field_41172.method_10223(new class_2960("entity.generic.hurt"));
	}

	@Override
	public class_3414 method_6002() {
		return class_7923.field_41172.method_10223(new class_2960("entity.generic.death"));
	}

	@Override
	public boolean method_5643(class_1282 damagesource, float amount) {
		double x = this.method_23317();
		double y = this.method_23318();
		double z = this.method_23321();
		class_1937 world = this.method_37908();
		class_1297 entity = this;
		class_1297 sourceentity = damagesource.method_5529();
		class_1297 immediatesourceentity = damagesource.method_5526();
		if (damagesource.method_5526() instanceof class_1686 || damagesource.method_5526() instanceof class_1295)
			return false;
		if (damagesource.method_49708(class_8111.field_42345))
			return false;
		if (damagesource.method_49708(class_8111.field_42351))
			return false;
		return super.method_5643(damagesource, amount);
	}

	@Override
	public void method_5670() {
		super.method_5670();
		double x = this.method_23317();
		double y = this.method_23318();
		double z = this.method_23321();
		class_1297 entity = this;
		class_1937 world = this.method_37908();
		VoidBossWaterThingProcedure.execute(world, entity);
	}

	@Override
	public boolean method_5822() {
		return false;
	}

	@Override
	public void method_5837(class_3222 player) {
		super.method_5837(player);
		this.bossInfo.method_14088(player);
	}

	@Override
	public void method_5742(class_3222 player) {
		super.method_5742(player);
		this.bossInfo.method_14089(player);
	}

	@Override
	public void method_5958() {
		super.method_5958();
		this.bossInfo.method_5408(this.method_6032() / this.method_6063());
	}

	@Override
	public boolean method_30949(class_1297 entity) {
		return true;
	}

	@Override
	public boolean method_30948() {
		return true;
	}

	public static void init() {
		BiomeModifications.create(new class_2960(BlobMod.MODID, "voidboss_entity_spawn")).add(ModificationPhase.ADDITIONS, BiomeSelectors.includeByKey(class_5321.method_29179(class_7924.field_41236, new class_2960("blob:voidbiome"))),
				ctx -> ctx.getSpawnSettings().addSpawn(class_1311.field_6302, new class_5483.class_1964(BlobModEntities.VOID_BOSS, 4, 1, 1)));
	}

	public static class_5132.class_5133 createAttributes() {
		class_5132.class_5133 builder = class_1308.method_26828();
		builder = builder.method_26868(class_5134.field_23719, 0.6);
		builder = builder.method_26868(class_5134.field_23716, 300);
		builder = builder.method_26868(class_5134.field_23724, 0);
		builder = builder.method_26868(class_5134.field_23721, 6);
		builder = builder.method_26868(class_5134.field_23717, 16);
		builder = builder.method_26868(class_5134.field_23718, 3.7);
		return builder;
	}
}

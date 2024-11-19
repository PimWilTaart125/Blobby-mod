package net.pimwiltaart.blob.mixins;

import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.Mutable;
import net.minecraft.class_5284;
import net.minecraft.class_6686;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(class_5284.class)
public interface NoiseGeneratorSettingsAccess {
	@Accessor("surfaceRule")
	@Mutable
	void addSurfaceRules(class_6686.class_6708 ruleSource);
}

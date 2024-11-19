package net.pimwiltaart.blob.mixins;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Mixin;
import java.util.ArrayList;
import net.minecraft.class_1799;
import net.minecraft.class_4317;
import net.minecraft.class_5455;
import net.minecraft.class_8566;
import com.google.common.collect.Lists;

@Mixin(class_4317.class)
public abstract class BlobModRepairItemRecipeMixin {
	@Inject(method = "assemble", at = @At("HEAD"), cancellable = true)
	public void assemble(class_8566 craftingContainer, class_5455 registryAccess, CallbackInfoReturnable<class_1799> cir) {
		class_1799 itemStack3;
		class_1799 itemStack;
		ArrayList<class_1799> list = Lists.newArrayList();
		for (int i = 0; i < craftingContainer.method_5439(); ++i) {
			class_1799 itemStack2;
			itemStack = craftingContainer.method_5438(i);
			if (itemStack.method_7960())
				continue;
			list.add(itemStack);
		}
	}
}

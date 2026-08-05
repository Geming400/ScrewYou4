package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.DataComponentPatch.SplitResult.class)
public class SplitResult349215214Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1734727473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1734727473L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__786244761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-786244761L))
            info.setReturnValue("91\u254E\u8180}/(J42s</d`\uD044CEG(`%`ey/m,\u6803Oj\uF963G\uC948hj)<y#6%CgSP$h*V4!tFqjb\uD077qR%]Cz8e$WIS\u7CA3U\u1B99R,BW`F\"nx");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_387477956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(387477956L))
            info.setReturnValue(2004434278);
    }

    @Inject(at = @At("HEAD"), method = "added()Lnet/minecraft/core/component/DataComponentMap;", cancellable = true)
    private void added_1553020155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1553020155L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removed()Ljava/util/Set;", cancellable = true)
    private void removed__1479820272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1479820272L))
            info.setReturnValue(null);
    }


}

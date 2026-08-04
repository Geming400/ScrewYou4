package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.ModelFeatureRenderer.CrumblingOverlay.class)
public class CrumblingOverlay1344642205Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1564812832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1564812832L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_209182230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(209182230L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1382904947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1382904947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "progress()I", cancellable = true)
    private void progress_1382904451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1382904451L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cameraPose()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;", cancellable = true)
    private void cameraPose__744678195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-744678195L))
            info.setReturnValue(null);
    }


}

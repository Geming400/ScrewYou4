package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.ModelFeatureRenderer.CrumblingOverlay.class)
public class CrumblingOverlay1344642205Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_436015937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(436015937L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2115065730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2115065730L))
            info.setReturnValue("-\uC959I>$\u4DF7:a;/gP:;\uB910uPeHP<|?JO\u8ECCXU1&\u849C=\uA8FEw\u6762wy>p;rBUi\uAF1E\u9894# |zp2\u8874M0\uBE7C,JA;");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1901994296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1901994296L))
            info.setReturnValue(504330133);
    }

    @Inject(at = @At("HEAD"), method = "progress()I", cancellable = true)
    private void progress_2072773750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2072773750L))
            info.setReturnValue(308011340);
    }

    @Inject(at = @At("HEAD"), method = "cameraPose()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;", cancellable = true)
    private void cameraPose_1837165475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1837165475L))
            info.setReturnValue(new com.mojang.blaze3d.vertex.PoseStack.Pose());
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.LeashFeatureRenderer.Submit.class)
public class Submit_1244884598Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_336258329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(336258329L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2015308122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2015308122L))
            info.setReturnValue("'bF\u5648?\u3B13K0:vT+9XrN\u55F7-\"P4\"Nx1Nl\u1658po5;\u387F\u8AA9'");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1802236688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1802236688L))
            info.setReturnValue(746510634);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lorg/joml/Matrix4f;", cancellable = true)
    private void pose__1581724331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1581724331L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "featureType()Lnet/minecraft/client/renderer/feature/FeatureRendererType;", cancellable = true)
    private void featureType_1052460843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1052460843L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "leashState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState$LeashState;", cancellable = true)
    private void leashState_671441975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(671441975L))
            info.setReturnValue(null);
    }


}

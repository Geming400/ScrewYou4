package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.LeashFeatureRenderer.Submit.class)
public class Submit_1244884598Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1664570440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1664570440L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_109424622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(109424622L))
            info.setReturnValue("p");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1283147339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1283147339L))
            info.setReturnValue(-779932527);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lorg/joml/Matrix4f;", cancellable = true)
    private void pose__222922490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-222922490L))
            info.setReturnValue(new org.joml.Matrix4f());
    }

    @Inject(at = @At("HEAD"), method = "featureType()Lnet/minecraft/client/renderer/feature/FeatureRendererType;", cancellable = true)
    private void featureType__2018999173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2018999173L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "leashState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState$LeashState;", cancellable = true)
    private void leashState__335034389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-335034389L))
            info.setReturnValue(null);
    }


}

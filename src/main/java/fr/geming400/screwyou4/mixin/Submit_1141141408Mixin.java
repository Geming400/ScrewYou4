package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.FlameFeatureRenderer.Submit.class)
public class Submit_1141141408Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1768313630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1768313630L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_5681432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(5681432L))
            info.setReturnValue("\":|?`P쒄㚫ྦ}n- ?o");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1179404149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1179404149L))
            info.setReturnValue(1441241852);
    }

    @Inject(at = @At("HEAD"), method = "rotation()Lorg/joml/Quaternionf;", cancellable = true)
    private void rotation__172438523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-172438523L))
            info.setReturnValue(new org.joml.Quaternionf());
    }

    @Inject(at = @At("HEAD"), method = "pose()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;", cancellable = true)
    private void pose__948178993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-948178993L))
            info.setReturnValue(new com.mojang.blaze3d.vertex.PoseStack$Pose());
    }

    @Inject(at = @At("HEAD"), method = "entityRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void entityRenderState_552376003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(552376003L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "featureType()Lnet/minecraft/client/renderer/feature/FeatureRendererType;", cancellable = true)
    private void featureType__2122742363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2122742363L))
            info.setReturnValue(null);
    }


}

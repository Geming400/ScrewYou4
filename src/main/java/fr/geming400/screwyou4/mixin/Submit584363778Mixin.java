package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.CustomFeatureRenderer.Submit.class)
public class Submit584363778Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1969876037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1969876037L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__551096197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-551096197L))
            info.setReturnValue("@O%)갷-5-Cڏ䡜nퟐUw#n딄(.!=]-@F懌@'텦ks\"缵g淍z");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_622626520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(622626520L))
            info.setReturnValue(119414671);
    }

    @Inject(at = @At("HEAD"), method = "customGeometryRenderer()Lnet/minecraft/client/renderer/SubmitNodeCollector$CustomGeometryRenderer;", cancellable = true)
    private void customGeometryRenderer__624464131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-624464131L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "featureType()Lnet/minecraft/client/renderer/feature/FeatureRendererType;", cancellable = true)
    private void featureType_1615447304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1615447304L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;", cancellable = true)
    private void pose__1504956622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1504956622L))
            info.setReturnValue(new com.mojang.blaze3d.vertex.PoseStack$Pose());
    }

    @Inject(at = @At("HEAD"), method = "renderType()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private void renderType_1668943475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1668943475L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "batchKey()Ljava/lang/Object;", cancellable = true)
    private void batchKey__1851411299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1851411299L))
            info.setReturnValue(null);
    }


}

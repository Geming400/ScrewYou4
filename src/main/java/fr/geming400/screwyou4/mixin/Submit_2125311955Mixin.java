package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.BlockModelFeatureRenderer.Submit.class)
public class Submit_2125311955Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__784143083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-784143083L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_989851979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(989851979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2131392600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2131392600L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overlayCoords()I", cancellable = true)
    private void overlayCoords__2131393096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2131393096L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lightCoords()I", cancellable = true)
    private void lightCoords__2131393096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2131393096L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tintColor()I", cancellable = true)
    private void tintColor__2131393096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2131393096L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;", cancellable = true)
    private void pose_35991554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(35991554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modelParts()Ljava/util/List;", cancellable = true)
    private void modelParts__543318526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-543318526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "renderType()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private void renderType__1085075645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1085075645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tintLayers()[I", cancellable = true)
    private void tintLayers__983813985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-983813985L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distanceToCameraSq()F", cancellable = true)
    private void distanceToCameraSq__2131395979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2131395979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "featureType()Lnet/minecraft/client/renderer/feature/FeatureRendererType;", cancellable = true)
    private void featureType__1138571816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1138571816L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sheetedDecalPose()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;", cancellable = true)
    private void sheetedDecalPose_35991554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(35991554L))
            info.setReturnValue(null);
    }


}

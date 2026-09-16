package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.BlockModelFeatureRenderer.Submit.class)
public class Submit_2125311955Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1216685686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1216685686L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1399231817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1399231817L))
            info.setReturnValue("X@>b\u9D1AC\uCF9Dlo \u85E9e9V{Z3PI'\u70A9[]C_`s0#\u9B3E\u4D5Fg\u8465q_pubs,i\uC5C1f\u9671y%De*B");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1612303251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1612303251L))
            info.setReturnValue(1265818187);
    }

    @Inject(at = @At("HEAD"), method = "distanceToCameraSq()F", cancellable = true)
    private void distanceToCameraSq__1374188414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1374188414L))
            info.setReturnValue(9.01673E7F);
    }

    @Inject(at = @At("HEAD"), method = "overlayCoords()I", cancellable = true)
    private void overlayCoords_381933034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(381933034L))
            info.setReturnValue(-1249505572);
    }

    @Inject(at = @At("HEAD"), method = "modelParts()Ljava/util/List;", cancellable = true)
    private void modelParts__64184903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-64184903L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tintColor()I", cancellable = true)
    private void tintColor_828927376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(828927376L))
            info.setReturnValue(-660644748);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;", cancellable = true)
    private void pose__666930477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-666930477L))
            info.setReturnValue(new com.mojang.blaze3d.vertex.PoseStack.Pose());
    }

    @Inject(at = @At("HEAD"), method = "lightCoords()I", cancellable = true)
    private void lightCoords__1522217628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1522217628L))
            info.setReturnValue(-1180299372);
    }

    @Inject(at = @At("HEAD"), method = "featureType()Lnet/minecraft/client/renderer/feature/FeatureRendererType;", cancellable = true)
    private void featureType_1932888200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1932888200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sheetedDecalPose()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;", cancellable = true)
    private void sheetedDecalPose__589513406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-589513406L))
            info.setReturnValue(new com.mojang.blaze3d.vertex.PoseStack.Pose());
    }

    @Inject(at = @At("HEAD"), method = "tintLayers()[I", cancellable = true)
    private void tintLayers__1511222532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1511222532L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "renderType()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private void renderType_1363956563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1363956563L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.ModelFeatureRenderer.Submit.class)
public class Submit_367486378Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1752998636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1752998636L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__767973598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-767973598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_405749119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(405749119L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "state()Ljava/lang/Object;", cancellable = true)
    private void state__2068288700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2068288700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "model()Lnet/minecraft/client/model/Model;", cancellable = true)
    private void model_1629927492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1629927492L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "batchKey()Ljava/lang/Object;", cancellable = true)
    private void batchKey__2068288700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2068288700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tintedColor()I", cancellable = true)
    private void tintedColor_405748623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(405748623L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distanceToCameraSq()F", cancellable = true)
    private void distanceToCameraSq_405745740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(405745740L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sprite()Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;", cancellable = true)
    private void sprite__1623519438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1623519438L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overlayCoords()I", cancellable = true)
    private void overlayCoords_405748623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(405748623L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lightCoords()I", cancellable = true)
    private void lightCoords_405748623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(405748623L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "renderType()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private void renderType_1452066074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1452066074L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "featureType()Lnet/minecraft/client/renderer/feature/FeatureRendererType;", cancellable = true)
    private void featureType_1398569903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1398569903L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sheetedDecalPose()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;", cancellable = true)
    private void sheetedDecalPose__1721834023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1721834023L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;", cancellable = true)
    private void pose__1721834023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1721834023L))
            info.setReturnValue(null);
    }


}

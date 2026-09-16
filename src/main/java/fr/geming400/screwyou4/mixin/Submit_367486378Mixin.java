package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.ModelFeatureRenderer.Submit.class)
public class Submit_367486378Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__541139891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-541139891L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1137909902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1137909902L))
            info.setReturnValue("ztb\u2812E2c/\uA51DG*4}K\uBFA8=\u72C5**ag>\u6340RZf4rJr{{q1q&+Z\uAC4BPb=Xg*&,\u41ECk73;*4\u022C%'`0`qKia3\u6B7A\u4A01T-c2->");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_924838468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(924838468L))
            info.setReturnValue(610845245);
    }

    @Inject(at = @At("HEAD"), method = "state()Ljava/lang/Object;", cancellable = true)
    private void state__1490027243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1490027243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "model()Lnet/minecraft/client/model/Model;", cancellable = true)
    private void model_1286474925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1286474925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distanceToCameraSq()F", cancellable = true)
    private void distanceToCameraSq_1162953305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1162953305L))
            info.setReturnValue(6.089618E8F);
    }

    @Inject(at = @At("HEAD"), method = "sheetedDecalPose()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;", cancellable = true)
    private void sheetedDecalPose_1947628313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1947628313L))
            info.setReturnValue(new com.mojang.blaze3d.vertex.PoseStack.Pose());
    }

    @Inject(at = @At("HEAD"), method = "featureType()Lnet/minecraft/client/renderer/feature/FeatureRendererType;", cancellable = true)
    private void featureType_175062623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(175062623L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sprite()Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;", cancellable = true)
    private void sprite__1852745929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1852745929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tintedColor()I", cancellable = true)
    private void tintedColor_983421574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(983421574L))
            info.setReturnValue(1055101290);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;", cancellable = true)
    private void pose_1870211242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1870211242L))
            info.setReturnValue(new com.mojang.blaze3d.vertex.PoseStack.Pose());
    }

    @Inject(at = @At("HEAD"), method = "renderType()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private void renderType__393869014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-393869014L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "batchKey()Ljava/lang/Object;", cancellable = true)
    private void batchKey__1347967415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1347967415L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "lightCoords()I", cancellable = true)
    private void lightCoords_1014924091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1014924091L))
            info.setReturnValue(1038156720);
    }

    @Inject(at = @At("HEAD"), method = "overlayCoords()I", cancellable = true)
    private void overlayCoords__1375892543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1375892543L))
            info.setReturnValue(2061037196);
    }


}

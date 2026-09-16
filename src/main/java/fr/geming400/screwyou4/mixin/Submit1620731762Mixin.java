package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.ShapeOutlineFeatureRenderer.Submit.class)
public class Submit1620731762Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_712105494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(712105494L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1903812009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1903812009L))
            info.setReturnValue("\uA75F\u6225bB]T:\u8C19teO]zF`k[\u5D60\u7809w\u24FB2SCB,|W90\u463A\uCAF20\u18C9C(qF{\"1\u8994fs|\u186FVBaf");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2116883443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2116883443L))
            info.setReturnValue(-497177104);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color__1437584427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1437584427L))
            info.setReturnValue(-1280801602);
    }

    @Inject(at = @At("HEAD"), method = "width()F", cancellable = true)
    private void width__19419121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-19419121L))
            info.setReturnValue(6.228917E8F);
    }

    @Inject(at = @At("HEAD"), method = "shape()Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void shape_621252597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(621252597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "featureType()Lnet/minecraft/client/renderer/feature/FeatureRendererType;", cancellable = true)
    private void featureType_1428308008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1428308008L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;", cancellable = true)
    private void pose__1171510669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1171510669L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "renderType()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private void renderType_859376371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(859376371L))
            info.setReturnValue(null);
    }


}

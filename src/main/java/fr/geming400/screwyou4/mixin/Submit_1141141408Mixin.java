package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.FlameFeatureRenderer.Submit.class)
public class Submit_1141141408Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_232515139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(232515139L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1911564932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1911564932L))
            info.setReturnValue("\uC45401v;Ss:^\u1C63B1@w&DVQ2ij\uAA4Atf\uBF49d]g6\u8B74eRkKMoHt%\u55AAW`\uFD48/");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1698493498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1698493498L))
            info.setReturnValue(1154902457);
    }

    @Inject(at = @At("HEAD"), method = "featureType()Lnet/minecraft/client/renderer/feature/FeatureRendererType;", cancellable = true)
    private void featureType_948717653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(948717653L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotation()Lorg/joml/Quaternionf;", cancellable = true)
    private void rotation__1410115069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1410115069L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;", cancellable = true)
    private void pose__1651101024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1651101024L))
            info.setReturnValue(new com.mojang.blaze3d.vertex.PoseStack.Pose());
    }

    @Inject(at = @At("HEAD"), method = "entityRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void entityRenderState__232967813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-232967813L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.CustomFeatureRenderer.Submit.class)
public class Submit584363778Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__324262490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-324262490L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1354787303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1354787303L))
            info.setReturnValue("jV\"|9ZDEtb?;n?\uCA57YDa|y,|i%-\uA279YqM-=\uD53A\uFB5C+^ Veq6N\u2E02\u33BA.\uC8CF\u38F4R`6(zu[UWRu\u4EED#\u8311o3e]b;z_F\u52EA{LVox1+Fd");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1141715869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1141715869L))
            info.setReturnValue(294369237);
    }

    @Inject(at = @At("HEAD"), method = "featureType()Lnet/minecraft/client/renderer/feature/FeatureRendererType;", cancellable = true)
    private void featureType_391940024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(391940024L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customGeometryRenderer()Lnet/minecraft/client/renderer/SubmitNodeCollector$CustomGeometryRenderer;", cancellable = true)
    private void customGeometryRenderer_700554595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(700554595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;", cancellable = true)
    private void pose_2087088643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2087088643L))
            info.setReturnValue(new com.mojang.blaze3d.vertex.PoseStack.Pose());
    }

    @Inject(at = @At("HEAD"), method = "renderType()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private void renderType__176991613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-176991613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "batchKey()Ljava/lang/Object;", cancellable = true)
    private void batchKey__1131090014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1131090014L))
            info.setReturnValue(null);
    }


}

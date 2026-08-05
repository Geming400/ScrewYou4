package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.GizmoFeatureRenderer.Submit.class)
public class Submit_710540377Mixin {
        @Inject(at = @At("HEAD"), method = "group()Lnet/minecraft/client/renderer/gizmos/DrawableGizmoPrimitives$Group;", cancellable = true)
    private void group_451436157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(451436157L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2096052635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2096052635L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__424919599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-424919599L))
            info.setReturnValue("Pk-\"m翳:,a(ygD%QPtlt!9t'15%꽳Tmn;TO4f{?9wTFl[wD@帾C鴦1yh^m9-컝<LC[#|MB.?$p]NU<nKน");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_748803118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(748803118L))
            info.setReturnValue(-626527226);
    }

    @Inject(at = @At("HEAD"), method = "camera()Lnet/minecraft/client/renderer/state/level/CameraRenderState;", cancellable = true)
    private void camera_1830869227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1830869227L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "featureType()Lnet/minecraft/client/renderer/feature/FeatureRendererType;", cancellable = true)
    private void featureType_1741623902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1741623902L))
            info.setReturnValue(null);
    }


}

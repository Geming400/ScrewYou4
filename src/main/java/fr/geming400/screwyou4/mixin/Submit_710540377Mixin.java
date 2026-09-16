package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.GizmoFeatureRenderer.Submit.class)
public class Submit_710540377Mixin {
        @Inject(at = @At("HEAD"), method = "group()Lnet/minecraft/client/renderer/gizmos/DrawableGizmoPrimitives$Group;", cancellable = true)
    private void group_1873473020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1873473020L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__198085892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-198085892L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1480963901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1480963901L))
            info.setReturnValue("%4i\u818Bk3OL]2;\u99F6\"\u2E5Ac;)_%\u722E'5r.\u9637\u7245.ap\"Jn1SB.\uD699j}i\uC57Dd\uB191l.HSb{k_^S>#^8jvGR");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1267892467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1267892467L))
            info.setReturnValue(-1711626653);
    }

    @Inject(at = @At("HEAD"), method = "featureType()Lnet/minecraft/client/renderer/feature/FeatureRendererType;", cancellable = true)
    private void featureType_518116622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(518116622L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "camera()Lnet/minecraft/client/renderer/state/level/CameraRenderState;", cancellable = true)
    private void camera_1666589286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1666589286L))
            info.setReturnValue(new net.minecraft.client.renderer.state.level.CameraRenderState());
    }


}

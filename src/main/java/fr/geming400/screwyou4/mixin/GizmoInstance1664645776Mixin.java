package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gizmos.SimpleGizmoCollector.GizmoInstance.class)
public class GizmoInstance1664645776Mixin {
        @Inject(at = @At("HEAD"), method = "getAlphaMultiplier(J)F", cancellable = true)
    private void getAlphaMultiplier__1415496403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1415496403L))
            info.setReturnValue(1.902519E8F);
    }

    @Inject(at = @At("HEAD"), method = "isAlwaysOnTop()Z", cancellable = true)
    private void isAlwaysOnTop_1702924359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1702924359L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "fadeOut()Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private void fadeOut__2139707469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2139707469L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gizmo()Lnet/minecraft/gizmos/Gizmo;", cancellable = true)
    private void gizmo__1208314330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1208314330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAlwaysOnTop()Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private void setAlwaysOnTop__2139707469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2139707469L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExpireTimeMillis()J", cancellable = true)
    private void getExpireTimeMillis_1702908983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1702908983L))
            info.setReturnValue(-5803754002341568522L);
    }

    @Inject(at = @At("HEAD"), method = "persistForMillis(I)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private void persistForMillis_1186713306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1186713306L))
            info.setReturnValue(null);
    }


}

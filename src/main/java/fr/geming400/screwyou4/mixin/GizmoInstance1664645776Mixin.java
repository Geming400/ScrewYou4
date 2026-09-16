package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gizmos.SimpleGizmoCollector.GizmoInstance.class)
public class GizmoInstance1664645776Mixin {
        @Inject(at = @At("HEAD"), method = "fadeOut()Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private void fadeOut__163477403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-163477403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gizmo()Lnet/minecraft/gizmos/Gizmo;", cancellable = true)
    private void gizmo__389335648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-389335648L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAlwaysOnTop()Z", cancellable = true)
    private void isAlwaysOnTop_815244234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(815244234L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getAlphaMultiplier(J)F", cancellable = true)
    private void getAlphaMultiplier__1742671370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1742671370L))
            info.setReturnValue(3.584847E8F);
    }

    @Inject(at = @At("HEAD"), method = "getExpireTimeMillis()J", cancellable = true)
    private void getExpireTimeMillis_171738063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(171738063L))
            info.setReturnValue(2601116176942567739L);
    }

    @Inject(at = @At("HEAD"), method = "persistForMillis(I)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private void persistForMillis__295775489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-295775489L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAlwaysOnTop()Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private void setAlwaysOnTop__1764295208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1764295208L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gizmos.ArrowGizmo.class)
public class ArrowGizmo_739518439Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__169107830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-169107830L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1509941963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1509941963L))
            info.setReturnValue("#\u1547\uB755I78kv6azN\u5D7Ag8\uAEB8RZvMl'0TSRWe,ecgF\uD578GY:WOj)utI\uAFDBEnFssY+=_bzc`\u78DFQ.@R:\u735A\uB4A2C\u9791^k=?;4Z-p2n:cf7eUv\u1AA51*\u9CF2");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1296870529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1296870529L))
            info.setReturnValue(-1097240709);
    }

    @Inject(at = @At("HEAD"), method = "end()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void end__1377247452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1377247452L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "start()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void start__233537987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-233537987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color_1976169545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1976169545L))
            info.setReturnValue(-1962478175);
    }

    @Inject(at = @At("HEAD"), method = "width()F", cancellable = true)
    private void width__900632445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-900632445L))
            info.setReturnValue(7.086959E8F);
    }

    @Inject(at = @At("HEAD"), method = "emit(Lnet/minecraft/gizmos/GizmoPrimitives;F)V", cancellable = true)
    private void emit_1149615927(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1149615927L))
            info.cancel();
    }


}

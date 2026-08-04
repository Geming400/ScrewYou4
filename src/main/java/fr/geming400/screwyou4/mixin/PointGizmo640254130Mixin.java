package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gizmos.PointGizmo.class)
public class PointGizmo640254130Mixin {
        @Inject(at = @At("HEAD"), method = "size()F", cancellable = true)
    private void size_678513493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(678513493L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2025766389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2025766389L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__495205845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-495205845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_678516872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(678516872L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void pos_1737983659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1737983659L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color_678516376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(678516376L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emit(Lnet/minecraft/gizmos/GizmoPrimitives;F)V", cancellable = true)
    private void emit_1237694640(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1237694640L))
            info.cancel();
    }


}

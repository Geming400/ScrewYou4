package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gizmos.CircleGizmo.class)
public class CircleGizmo1441315596Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_532689328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(532689328L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2083228175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083228175L))
            info.setReturnValue("\u78F26U[ 41bC\u96F1/B{\u1477\u9A42G\u54E1)J\uAA0Avjiq\uC6DEeRz\uC31DFN41\"\uC03AwSM-Y\uC5ECauq[f");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1998667687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1998667687L))
            info.setReturnValue(-1658652499);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void pos__374976975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-374976975L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "style()Lnet/minecraft/gizmos/GizmoStyle;", cancellable = true)
    private void style__397957306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-397957306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emit(Lnet/minecraft/gizmos/GizmoPrimitives;F)V", cancellable = true)
    private void emit_1851413085(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1851413085L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "radius()F", cancellable = true)
    private void radius__1385618339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1385618339L))
            info.setReturnValue(9.158513E8F);
    }


}

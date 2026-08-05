package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gizmos.CuboidGizmo.class)
public class CuboidGizmo_1296817406Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1612637632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1612637632L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_161357430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(161357430L))
            info.setReturnValue("!,hwQ*mH.Z\uA6EE-u:eVmBzx|J.d&\"*Z(\"-6*\u12F4P!fL]`E\uD441i%\u3903[wX^\"x=7IU\u281DU1clV\u9174KDZN(4iZ9Q\u31F7s");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1335080147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1335080147L))
            info.setReturnValue(993001924);
    }

    @Inject(at = @At("HEAD"), method = "style()Lnet/minecraft/gizmos/GizmoStyle;", cancellable = true)
    private void style_1970895944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1970895944L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emit(Lnet/minecraft/gizmos/GizmoPrimitives;F)V", cancellable = true)
    private void emit_1894257915(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1894257915L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "aabb()Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void aabb__123839947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-123839947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "coloredCornerStroke()Z", cancellable = true)
    private void coloredCornerStroke_1335095988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1335095988L))
            info.setReturnValue(true);
    }


}

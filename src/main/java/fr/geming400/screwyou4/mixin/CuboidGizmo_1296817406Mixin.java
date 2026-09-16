package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gizmos.CuboidGizmo.class)
public class CuboidGizmo_1296817406Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_388191137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(388191137L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2067240930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2067240930L))
            info.setReturnValue("@\u5A092G\u4206\u9B1BHMdS08D-\uBD96ZZJ4\u788E#7FM`n\u4091Qi7t*6fH\uFEBF;>)9)<\u1174c|\u20A0");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1854169496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1854169496L))
            info.setReturnValue(555366340);
    }

    @Inject(at = @At("HEAD"), method = "style()Lnet/minecraft/gizmos/GizmoStyle;", cancellable = true)
    private void style__542455497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-542455497L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emit(Lnet/minecraft/gizmos/GizmoPrimitives;F)V", cancellable = true)
    private void emit_1706914894(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1706914894L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "coloredCornerStroke()Z", cancellable = true)
    private void coloredCornerStroke__1923876155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1923876155L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "aabb()Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void aabb_146533845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(146533845L))
            info.setReturnValue(null);
    }


}

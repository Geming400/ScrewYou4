package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gizmos.TextGizmo.class)
public class TextGizmo_1488970929Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1420484109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1420484109L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_353510953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(353510953L))
            info.setReturnValue("D?}\u567F\u0DECJ\u3547hY\u5A77r<^&");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1527233670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1527233670L))
            info.setReturnValue(1392671180);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void pos__1708266839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1708266839L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "text()Ljava/lang/String;", cancellable = true)
    private void text_353510457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(353510457L))
            info.setReturnValue("]&NfhtK!dQ$NJ1fy<\u130D>ETE{s");
    }

    @Inject(at = @At("HEAD"), method = "style()Lnet/minecraft/gizmos/TextGizmo$Style;", cancellable = true)
    private void style__499193210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-499193210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emit(Lnet/minecraft/gizmos/GizmoPrimitives;F)V", cancellable = true)
    private void emit_2086411438(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2086411438L))
            info.cancel();
    }


}

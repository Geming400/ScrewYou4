package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.gizmos.DrawableGizmoPrimitives.Point.class)
public class Point1696750750Mixin {
        @Inject(at = @At("HEAD"), method = "size()F", cancellable = true)
    private void size_1735010113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1735010113L))
            info.setReturnValue(1.249612E8F);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1212704287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1212704287L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_561290775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(561290775L))
            info.setReturnValue(":;8+pN#D02%{X_N\u8DB5S:dp$\u6DCBr*\u80B4cV>C\u92D3;>_E\uB096bFNRE||>]fn1CdY $\u791D4\uB39D\u1BCCLb");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1735013492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1735013492L))
            info.setReturnValue(998915557);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void pos__1500487017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1500487017L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color_1735012996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1735012996L))
            info.setReturnValue(1275934765);
    }


}

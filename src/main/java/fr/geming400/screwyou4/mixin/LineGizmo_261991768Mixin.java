package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gizmos.LineGizmo.class)
public class LineGizmo_261991768Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__646634501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-646634501L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1032415292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1032415292L))
            info.setReturnValue("\uAD83&\u46B3?,2\u78B5 vzr=*f%<\u3ABB\"\uA20FI,\u840A\u9766'C4,ltek:\u14F7g*OKgYF;w--\"}\u626A-C\u4017\uA56B%\u5998o&M/O\uA06Fmb1D\u092C0r >\uFC19\u6F8CB\uB3F5ne 0'%L\u60B1=\uC60CnTzzo");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_819343858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(819343858L))
            info.setReturnValue(1502121402);
    }

    @Inject(at = @At("HEAD"), method = "end()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void end__1854774123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1854774123L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "start()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void start__711064658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-711064658L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color_1498642874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1498642874L))
            info.setReturnValue(-1838458170);
    }

    @Inject(at = @At("HEAD"), method = "width()F", cancellable = true)
    private void width__1378159116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1378159116L))
            info.setReturnValue(6.650328E8F);
    }

    @Inject(at = @At("HEAD"), method = "emit(Lnet/minecraft/gizmos/GizmoPrimitives;F)V", cancellable = true)
    private void emit_672089256(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(672089256L))
            info.cancel();
    }


}

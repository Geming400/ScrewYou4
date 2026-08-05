package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gizmos.ArrowGizmo.class)
public class ArrowGizmo_739518439Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2125030697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2125030697L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__395941537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-395941537L))
            info.setReturnValue("m^%ǂ6>qzz.驖t`!':qpn5 嬥iGk7<1h!XC尼(:yUb3왔줩b}{QbOr/2{0t[q_KwQB/伈]⽝TUCW;*a;*h콲aeWlb fEo'ꎜ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_777781180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(777781180L))
            info.setReturnValue(-1704841081);
    }

    @Inject(at = @At("HEAD"), method = "end()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void end_1837247967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1837247967L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "start()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void start_1837247967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1837247967L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color_777780684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(777780684L))
            info.setReturnValue(-1526317591);
    }

    @Inject(at = @At("HEAD"), method = "width()F", cancellable = true)
    private void width_777777801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(777777801L))
            info.setReturnValue(2.570421E8F);
    }

    @Inject(at = @At("HEAD"), method = "emit(Lnet/minecraft/gizmos/GizmoPrimitives;F)V", cancellable = true)
    private void emit_1336958948(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1336958948L))
            info.cancel();
    }


}

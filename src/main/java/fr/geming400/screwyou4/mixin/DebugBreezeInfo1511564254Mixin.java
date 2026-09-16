package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugBreezeInfo.class)
public class DebugBreezeInfo1511564254Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_602937986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(602937986L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2012979517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2012979517L))
            info.setReturnValue("+RojS_;c* @D)?^{|^B*J7T\u2F7A\u1629CsM\u516EV8+TABY8\uB409u\u9152'L'np:<\u224FX{%s)j:W\u0D27M|8bCF[G*:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2068916345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2068916345L))
            info.setReturnValue(-2101820706);
    }

    @Inject(at = @At("HEAD"), method = "attackTarget()Ljava/util/Optional;", cancellable = true)
    private void attackTarget__1522634619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1522634619L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "jumpTarget()Ljava/util/Optional;", cancellable = true)
    private void jumpTarget_723427307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(723427307L))
            info.setReturnValue(null);
    }


}

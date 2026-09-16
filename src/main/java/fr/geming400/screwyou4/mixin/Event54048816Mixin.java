package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugSubscription.Event.class)
public class Event54048816Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value__949472132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-949472132L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__854577452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-854577452L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_824472341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(824472341L))
            info.setReturnValue("KU9}9%U`$\u10A8K=T9Ds}\"\u754E\u74CA/\u7C3EUR\u2489i\u3B1A\u1D8B5'[ulyAl`dGJsa<m5\"I$l:Rx.\u956BAZm8_j\u231B1ut\u8371x\u5FA6 a=tFQu%D(+R(DN+*TM\u3BE6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_611400907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(611400907L))
            info.setReturnValue(-1638855625);
    }

    @Inject(at = @At("HEAD"), method = "subscription()Lnet/minecraft/util/debug/DebugSubscription;", cancellable = true)
    private void subscription__908276512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-908276512L))
            info.setReturnValue(null);
    }


}

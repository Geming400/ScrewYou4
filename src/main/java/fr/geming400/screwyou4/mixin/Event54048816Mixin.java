package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugSubscription.Event.class)
public class Event54048816Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value_1913241035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1913241035L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1439561075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1439561075L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1081411159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1081411159L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_92311558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(92311558L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "subscription()Lnet/minecraft/util/debug/DebugSubscription;", cancellable = true)
    private void subscription_811991491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(811991491L))
            info.setReturnValue(null);
    }


}

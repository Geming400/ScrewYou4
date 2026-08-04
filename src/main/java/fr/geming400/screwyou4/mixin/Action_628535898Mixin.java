package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.HoverEvent.Action.class)
public class Action_628535898Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__506924574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-506924574L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/network/chat/HoverEvent$Action;", cancellable = true)
    private static void values_810854142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(810854142L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/network/chat/HoverEvent$Action;", cancellable = true)
    private static void valueOf__637553989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-637553989L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__506924574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-506924574L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAllowedFromServer()Z", cancellable = true)
    private void isAllowedFromServer_666814480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(666814480L))
            info.setReturnValue(null);
    }


}

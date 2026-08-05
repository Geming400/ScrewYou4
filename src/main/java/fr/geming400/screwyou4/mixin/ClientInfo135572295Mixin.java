package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.ClientInfo.class)
public class ClientInfo135572295Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__773053973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-773053973L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_905995820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(905995820L))
            info.setReturnValue(" 28RsHi#");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_692924386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(692924386L))
            info.setReturnValue(200755305);
    }

    @Inject(at = @At("HEAD"), method = "of(Ljava/lang/Integer;)Lnet/minecraft/server/jsonrpc/methods/ClientInfo;", cancellable = true)
    private static void of__29009433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-29009433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "connectionId()Ljava/lang/Integer;", cancellable = true)
    private void connectionId_1748368232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1748368232L))
            info.setReturnValue(null);
    }


}

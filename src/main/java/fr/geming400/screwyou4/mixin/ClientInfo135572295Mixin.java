package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.ClientInfo.class)
public class ClientInfo135572295Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1521084554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1521084554L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__999887680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-999887680L))
            info.setReturnValue("o(j_䣨l.JTﮘhf!*#yv7$o");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_173835037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(173835037L))
            info.setReturnValue(1878484913);
    }

    @Inject(at = @At("HEAD"), method = "of(Ljava/lang/Integer;)Lnet/minecraft/server/jsonrpc/methods/ClientInfo;", cancellable = true)
    private static void of_948652816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(948652816L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "connectionId()Ljava/lang/Integer;", cancellable = true)
    private void connectionId__1044848607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1044848607L))
            info.setReturnValue(null);
    }


}

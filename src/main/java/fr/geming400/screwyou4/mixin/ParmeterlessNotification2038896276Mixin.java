package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.OutgoingRpcMethod.ParmeterlessNotification.class)
public class ParmeterlessNotification2038896276Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__870558761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-870558761L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_903436301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(903436301L))
            info.setReturnValue("m]o\u2BD3x<?muY1Y\uA3DAkt5Q)qR0\u37AA[\u7666\u7403\u95E6J\u3BD0TB,n`2EQ\uC8DCt%*&Y}<x:b.\u6959?s\u837DA.Dn|_\u8560Rw\uA475#W\u3607-M*]i]'Sd{\uA607u'");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2077159018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2077159018L))
            info.setReturnValue(799430015);
    }

    @Inject(at = @At("HEAD"), method = "info()Lnet/minecraft/server/jsonrpc/api/MethodInfo;", cancellable = true)
    private void info_1364474954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1364474954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attributes()Lnet/minecraft/server/jsonrpc/OutgoingRpcMethod$Attributes;", cancellable = true)
    private void attributes__1261848979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1261848979L))
            info.setReturnValue(null);
    }


}

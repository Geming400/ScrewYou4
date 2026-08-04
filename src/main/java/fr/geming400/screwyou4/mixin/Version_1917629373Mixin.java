package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.status.ServerStatus.Version.class)
public class Version_1917629373Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_782168901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(782168901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__991825665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-991825665L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_782169397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(782169397L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1955892114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1955892114L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "current()Lnet/minecraft/network/protocol/status/ServerStatus$Version;", cancellable = true)
    private static void current__1033690050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1033690050L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "protocol()I", cancellable = true)
    private void protocol_1955891618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1955891618L))
            info.setReturnValue(null);
    }


}

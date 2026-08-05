package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.resolver.ServerAddress.class)
public class ServerAddress1498902707Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1410552826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1410552826L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_363442236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(363442236L))
            info.setReturnValue("t4)v\u105F@W");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1537164953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1537164953L))
            info.setReturnValue(-1661872238);
    }

    @Inject(at = @At("HEAD"), method = "getHost()Ljava/lang/String;", cancellable = true)
    private void getHost_363442236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(363442236L))
            info.setReturnValue("t4)v\u105F@W");
    }

    @Inject(at = @At("HEAD"), method = "getPort()I", cancellable = true)
    private void getPort_1537164953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1537164953L))
            info.setReturnValue(-1661872238);
    }

    @Inject(at = @At("HEAD"), method = "parsePort(Ljava/lang/String;)I", cancellable = true)
    private static void parsePort__1643715685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1643715685L))
            info.setReturnValue(-296164973);
    }

    @Inject(at = @At("HEAD"), method = "parseString(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/resolver/ServerAddress;", cancellable = true)
    private static void parseString_1032311212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1032311212L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidAddress(Ljava/lang/String;)Z", cancellable = true)
    private static void isValidAddress__1643699348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1643699348L))
            info.setReturnValue(true);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.resolver.ServerAddress.class)
public class ServerAddress1498902707Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_590275943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(590275943L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2025641560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2025641560L))
            info.setReturnValue("\uCE7F'P'6=>\uD5BBKf$&Z<h8\uB0D3F&Xe_z`A\uA214W:tVYmE\u6CFC<c");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2056254302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2056254302L))
            info.setReturnValue(659981975);
    }

    @Inject(at = @At("HEAD"), method = "getHost()Ljava/lang/String;", cancellable = true)
    private void getHost_1497334746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1497334746L))
            info.setReturnValue("C\u2A72!&cu]\uBE2AegT\u26A07L1tG{(_!=V{Q!x<R.x$\u9CDDaf,2Gd\u0AED/W");
    }

    @Inject(at = @At("HEAD"), method = "getPort()I", cancellable = true)
    private void getPort__1743239166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1743239166L))
            info.setReturnValue(198564241);
    }

    @Inject(at = @At("HEAD"), method = "parsePort(Ljava/lang/String;)I", cancellable = true)
    private static void parsePort__1034027193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1034027193L))
            info.setReturnValue(1773318419);
    }

    @Inject(at = @At("HEAD"), method = "parseString(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/resolver/ServerAddress;", cancellable = true)
    private static void parseString__1391443832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1391443832L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidAddress(Ljava/lang/String;)Z", cancellable = true)
    private static void isValidAddress__238458230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-238458230L))
            info.setReturnValue(true);
    }


}

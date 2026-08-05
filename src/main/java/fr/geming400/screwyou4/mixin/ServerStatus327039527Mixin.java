package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.status.ServerStatus.class)
public class ServerStatus327039527Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1712551786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1712551786L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__808420448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-808420448L))
            info.setReturnValue("\"J\u9484k9UO!(':DYc\u09B6.9p\uA70C]B]F!uUi{FKtqo\u361F!vG+0|\u935C!\uFCF2wYGO1");
    }

    @Inject(at = @At("HEAD"), method = "version()Ljava/util/Optional;", cancellable = true)
    private void version_572500949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(572500949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_365302269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(365302269L))
            info.setReturnValue(-1604795414);
    }

    @Inject(at = @At("HEAD"), method = "description()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void description__1849869638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1849869638L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "players()Ljava/util/Optional;", cancellable = true)
    private void players_572500949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(572500949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "favicon()Ljava/util/Optional;", cancellable = true)
    private void favicon_572500949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(572500949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enforcesSecureChat()Z", cancellable = true)
    private void enforcesSecureChat_365318110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(365318110L))
            info.setReturnValue(true);
    }


}

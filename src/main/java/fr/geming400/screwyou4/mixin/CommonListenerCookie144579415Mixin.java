package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.CommonListenerCookie.class)
public class CommonListenerCookie144579415Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1530091674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1530091674L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__990880560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-990880560L))
            info.setReturnValue("4 T2O5xkVTy\u38E1!T");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_182842157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(182842157L))
            info.setReturnValue(828497125);
    }

    @Inject(at = @At("HEAD"), method = "transferred()Z", cancellable = true)
    private void transferred_182857998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(182857998L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "latency()I", cancellable = true)
    private void latency_182841661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(182841661L))
            info.setReturnValue(1031644544);
    }

    @Inject(at = @At("HEAD"), method = "clientInformation()Lnet/minecraft/server/level/ClientInformation;", cancellable = true)
    private void clientInformation__787310265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-787310265L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gameProfile()Lcom/mojang/authlib/GameProfile;", cancellable = true)
    private void gameProfile_661747695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(661747695L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createInitial(Lcom/mojang/authlib/GameProfile;Z)Lnet/minecraft/server/network/CommonListenerCookie;", cancellable = true)
    private static void createInitial__876486360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-876486360L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.configuration.ServerboundSelectKnownPacks.class)
public class ServerboundSelectKnownPacks_30061968Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_185929557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(185929557L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__878564301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-878564301L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_800485492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(800485492L))
            info.setReturnValue("K?D\u04F0<M@k \u98CDwzwo");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_587414058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(587414058L))
            info.setReturnValue(-698988024);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__265649896(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-265649896L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/configuration/ServerConfigurationPacketListener;)V", cancellable = true)
    private void handle_1943779253(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1943779253L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "knownPacks()Ljava/util/List;", cancellable = true)
    private void knownPacks__1520041418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1520041418L))
            info.setReturnValue(null);
    }


}

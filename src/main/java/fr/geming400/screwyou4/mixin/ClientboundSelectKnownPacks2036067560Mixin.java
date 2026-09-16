package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.configuration.ClientboundSelectKnownPacks.class)
public class ClientboundSelectKnownPacks2036067560Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__2103032146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2103032146L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1127441292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1127441292L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1488476211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1488476211L))
            info.setReturnValue("\uFF9DC_O");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1701547645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1701547645L))
            info.setReturnValue(-1377999720);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1740355697(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1740355697L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/configuration/ClientConfigurationPacketListener;)V", cancellable = true)
    private void handle__1760980074(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1760980074L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "knownPacks()Ljava/util/List;", cancellable = true)
    private void knownPacks_485964175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(485964175L))
            info.setReturnValue(null);
    }


}

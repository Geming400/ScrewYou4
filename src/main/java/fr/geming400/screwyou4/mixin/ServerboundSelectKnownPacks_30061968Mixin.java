package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.configuration.ServerboundSelectKnownPacks.class)
public class ServerboundSelectKnownPacks_30061968Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1648963121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1648963121L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1415574226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1415574226L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1105398008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1105398008L))
            info.setReturnValue("\u43BDxCFl;u_$PvQ\u477Cy\uD7D6ou");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_68324709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(68324709L))
            info.setReturnValue(-36674620);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_708130880(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(708130880L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/configuration/ServerConfigurationPacketListener;)V", cancellable = true)
    private void handle_432733405(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(432733405L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "knownPacks()Ljava/util/List;", cancellable = true)
    private void knownPacks_1656398783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1656398783L))
            info.setReturnValue(null);
    }


}

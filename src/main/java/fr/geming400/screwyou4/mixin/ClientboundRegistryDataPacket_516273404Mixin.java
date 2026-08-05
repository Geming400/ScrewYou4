package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.configuration.ClientboundRegistryDataPacket.class)
public class ClientboundRegistryDataPacket_516273404Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1162751685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1162751685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1901785662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1901785662L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__619186572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-619186572L))
            info.setReturnValue("b=^e\u1BD8`V)dj%\u43EB!`Ni\u0C1D-{xW:\u04B3m\u8B32\u7F097P]35\uFFB8&xE\uA4B9:,H;XgC\u4FA7DTM(UG@_%U\uCC9E})|ATa,-T\uCF6DKRSo85$JM7\u8981");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_554536145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(554536145L))
            info.setReturnValue(-159442353);
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries_2142610219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2142610219L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1194342316(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1194342316L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/configuration/ClientConfigurationPacketListener;)V", cancellable = true)
    private void handle__496852783(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-496852783L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registry()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void registry_1324764716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1324764716L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.configuration.ClientboundUpdateEnabledFeaturesPacket.class)
public class ClientboundUpdateEnabledFeaturesPacket_1924852028Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_2080719617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2080719617L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1016225759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1016225759L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1599691744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1599691744L))
            info.setReturnValue("\u8038(\uAD9A7&1R8Tl>*Z\"[9`] mzk[j69$\u8A0E=].II,Mn\u24CF&h\u7B06<6b*;o8[\u3335\u10D8kCBS% <Xijg7'hnfNMMQ@w\uA8B3Md\u0F3F");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1812763178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1812763178L))
            info.setReturnValue(666065532);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/configuration/ClientConfigurationPacketListener;)V", cancellable = true)
    private void handle__1872195607(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1872195607L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1629140164(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1629140164L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "features()Ljava/util/Set;", cancellable = true)
    private void features__1274627072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1274627072L))
            info.setReturnValue(null);
    }


}

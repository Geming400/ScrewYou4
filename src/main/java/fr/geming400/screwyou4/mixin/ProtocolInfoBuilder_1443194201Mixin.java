package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.ProtocolInfoBuilder.class)
public class ProtocolInfoBuilder_1443194201Mixin {
        @Inject(at = @At("HEAD"), method = "withBundlePacket(Lnet/minecraft/network/protocol/PacketType;Ljava/util/function/Function;Lnet/minecraft/network/protocol/BundleDelimiterPacket;)Lnet/minecraft/network/protocol/ProtocolInfoBuilder;", cancellable = true)
    private void withBundlePacket__1983462230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1983462230L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clientboundProtocol(Lnet/minecraft/network/ConnectionProtocol;Ljava/util/function/Consumer;)Lnet/minecraft/network/protocol/SimpleUnboundProtocol;", cancellable = true)
    private static void clientboundProtocol_135798436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(135798436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contextClientboundProtocol(Lnet/minecraft/network/ConnectionProtocol;Ljava/util/function/Consumer;)Lnet/minecraft/network/protocol/UnboundProtocol;", cancellable = true)
    private static void contextClientboundProtocol_1839706465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1839706465L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contextServerboundProtocol(Lnet/minecraft/network/ConnectionProtocol;Ljava/util/function/Consumer;)Lnet/minecraft/network/protocol/UnboundProtocol;", cancellable = true)
    private static void contextServerboundProtocol__1450150695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1450150695L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buildUnbound()Lnet/minecraft/network/protocol/UnboundProtocol;", cancellable = true)
    private void buildUnbound__1751838494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1751838494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buildUnbound(Ljava/lang/Object;)Lnet/minecraft/network/protocol/SimpleUnboundProtocol;", cancellable = true)
    private void buildUnbound_588488664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(588488664L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serverboundProtocol(Lnet/minecraft/network/ConnectionProtocol;Ljava/util/function/Consumer;)Lnet/minecraft/network/protocol/SimpleUnboundProtocol;", cancellable = true)
    private static void serverboundProtocol__519149540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-519149540L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addPacket(Lnet/minecraft/network/protocol/PacketType;Lnet/minecraft/network/codec/StreamCodec;Lnet/minecraft/network/protocol/CodecModifier;)Lnet/minecraft/network/protocol/ProtocolInfoBuilder;", cancellable = true)
    private void addPacket__1696669828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1696669828L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addPacket(Lnet/minecraft/network/protocol/PacketType;Lnet/minecraft/network/codec/StreamCodec;)Lnet/minecraft/network/protocol/ProtocolInfoBuilder;", cancellable = true)
    private void addPacket_46880256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(46880256L))
            info.setReturnValue(null);
    }


}

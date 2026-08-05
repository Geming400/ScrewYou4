package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.ProtocolInfoBuilder.class)
public class ProtocolInfoBuilder_1443194201Mixin {
        @Inject(at = @At("HEAD"), method = "addPacket(Lnet/minecraft/network/protocol/PacketType;Lnet/minecraft/network/codec/StreamCodec;)Lnet/minecraft/network/protocol/ProtocolInfoBuilder;", cancellable = true)
    private void addPacket_1733850871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1733850871L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addPacket(Lnet/minecraft/network/protocol/PacketType;Lnet/minecraft/network/codec/StreamCodec;Lnet/minecraft/network/protocol/CodecModifier;)Lnet/minecraft/network/protocol/ProtocolInfoBuilder;", cancellable = true)
    private void addPacket__1370560461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1370560461L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clientboundProtocol(Lnet/minecraft/network/ConnectionProtocol;Ljava/util/function/Consumer;)Lnet/minecraft/network/protocol/SimpleUnboundProtocol;", cancellable = true)
    private static void clientboundProtocol_104694159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(104694159L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contextClientboundProtocol(Lnet/minecraft/network/ConnectionProtocol;Ljava/util/function/Consumer;)Lnet/minecraft/network/protocol/UnboundProtocol;", cancellable = true)
    private static void contextClientboundProtocol__1888654083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1888654083L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buildUnbound()Lnet/minecraft/network/protocol/UnboundProtocol;", cancellable = true)
    private void buildUnbound__882626005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-882626005L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buildUnbound(Ljava/lang/Object;)Lnet/minecraft/network/protocol/SimpleUnboundProtocol;", cancellable = true)
    private void buildUnbound__2053786079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2053786079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withBundlePacket(Lnet/minecraft/network/protocol/PacketType;Ljava/util/function/Function;Lnet/minecraft/network/protocol/BundleDelimiterPacket;)Lnet/minecraft/network/protocol/ProtocolInfoBuilder;", cancellable = true)
    private void withBundlePacket_1771406618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1771406618L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serverboundProtocol(Lnet/minecraft/network/ConnectionProtocol;Ljava/util/function/Consumer;)Lnet/minecraft/network/protocol/SimpleUnboundProtocol;", cancellable = true)
    private static void serverboundProtocol_104694159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(104694159L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contextServerboundProtocol(Lnet/minecraft/network/ConnectionProtocol;Ljava/util/function/Consumer;)Lnet/minecraft/network/protocol/UnboundProtocol;", cancellable = true)
    private static void contextServerboundProtocol__1888654083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1888654083L))
            info.setReturnValue(null);
    }


}

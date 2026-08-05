package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ClientboundCustomPayloadPacket.class)
public class ClientboundCustomPayloadPacket1861681746Mixin {
        @Inject(at = @At("HEAD"), method = "payload()Lnet/minecraft/network/protocol/common/custom/CustomPacketPayload;", cancellable = true)
    private void payload_1920781287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1920781287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_182656658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(182656658L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1047773291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1047773291L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_726221771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(726221771L))
            info.setReturnValue("c+UaV/;=}WGtC**\u237CN\u12FC\u158CV<\uD466A7kLm-L\u6A47yD|pg<u#\u7A0AG{\uC54Dz58&c1H40/g:<\"8T_@{EO`\u21B1gZ%P.%?XZ7\u5198&FXe^\u0E34i?1\u0AA6@\u6836N`bq_\u2312:}");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1899944488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1899944488L))
            info.setReturnValue(-1214599627);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ClientCommonPacketListener;)V", cancellable = true)
    private void handle_401432192(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(401432192L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1755216637(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1755216637L))
            info.cancel();
    }


}

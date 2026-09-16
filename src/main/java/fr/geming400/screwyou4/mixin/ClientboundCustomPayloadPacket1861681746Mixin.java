package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ClientboundCustomPayloadPacket.class)
public class ClientboundCustomPayloadPacket1861681746Mixin {
        @Inject(at = @At("HEAD"), method = "payload()Lnet/minecraft/network/protocol/common/custom/CustomPacketPayload;", cancellable = true)
    private void payload__702457099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-702457099L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_2017549336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2017549336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_953055478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(953055478L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1662862025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1662862025L))
            info.setReturnValue("XWc");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1875933459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1875933459L))
            info.setReturnValue(-669315145);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ClientCommonPacketListener;)V", cancellable = true)
    private void handle_1611625304(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1611625304L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1565969883(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1565969883L))
            info.cancel();
    }


}

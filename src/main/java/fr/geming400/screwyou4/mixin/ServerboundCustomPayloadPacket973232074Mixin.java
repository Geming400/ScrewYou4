package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ServerboundCustomPayloadPacket.class)
public class ServerboundCustomPayloadPacket973232074Mixin {
        @Inject(at = @At("HEAD"), method = "payload()Lnet/minecraft/network/protocol/common/custom/CustomPacketPayload;", cancellable = true)
    private void payload__1590906771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1590906771L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1129099664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1129099664L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_64605806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(64605806L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1743655599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1743655599L))
            info.setReturnValue("\u49E9bbR");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1530584165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1530584165L))
            info.setReturnValue(1495938037);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_677520211(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(677520211L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ServerCommonPacketListener;)V", cancellable = true)
    private void handle__552410024(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-552410024L))
            info.cancel();
    }


}

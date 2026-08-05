package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.status.ClientboundStatusResponsePacket.class)
public class ClientboundStatusResponsePacket_666022512Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1013002577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1013002577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2051534770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2051534770L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__469437464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-469437464L))
            info.setReturnValue("a\uAEBEo)\u09A8eFVk1X\u827D-afp5@[Dq?>[yq0-\uD183|1`S89539\u8C2F\uC36A87|M&*A>\uC3B9W\u415C#kf1*:p\uC613X");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_704285253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(704285253L))
            info.setReturnValue(-824253681);
    }

    @Inject(at = @At("HEAD"), method = "status()Lnet/minecraft/network/protocol/status/ServerStatus;", cancellable = true)
    private void status_1154581389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1154581389L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1344091424(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1344091424L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/status/ClientStatusPacketListener;)V", cancellable = true)
    private void handle__1121562819(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1121562819L))
            info.cancel();
    }


}

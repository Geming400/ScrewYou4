package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundDebugEventPacket.class)
public class ClientboundDebugEventPacket1921568964Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_2077436554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2077436554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1012942696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1012942696L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1602974807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1602974807L))
            info.setReturnValue("oWX2>EkZ+\u4E5E$!\u2AD3q!8=0");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1816046241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1816046241L))
            info.setReturnValue(1542254740);
    }

    @Inject(at = @At("HEAD"), method = "event()Lnet/minecraft/util/debug/DebugSubscription$Event;", cancellable = true)
    private void event_1462045019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1462045019L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1625857101(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1625857101L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_330091370(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(330091370L))
            info.cancel();
    }


}

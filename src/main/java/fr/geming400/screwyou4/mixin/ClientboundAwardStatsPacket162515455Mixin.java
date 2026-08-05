package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundAwardStatsPacket.class)
public class ClientboundAwardStatsPacket162515455Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1516509633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1516509633L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1548027714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1548027714L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__972944520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-972944520L))
            info.setReturnValue("qH}9 _fRlA,H=fT");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_200778197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(200778197L))
            info.setReturnValue(-990362988);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_840584368(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(840584368L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_360022989(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(360022989L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stats()Lit/unimi/dsi/fastutil/objects/Object2IntMap;", cancellable = true)
    private void stats__906206829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-906206829L))
            info.setReturnValue(null);
    }


}

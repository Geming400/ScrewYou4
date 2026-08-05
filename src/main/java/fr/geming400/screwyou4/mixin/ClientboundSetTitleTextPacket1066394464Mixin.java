package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetTitleTextPacket.class)
public class ClientboundSetTitleTextPacket1066394464Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__612630624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-612630624L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1843060573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1843060573L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__69065511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-69065511L))
            info.setReturnValue("原FYKdVcZⰨg乙a%*!茍|0蟨VL+,G}hx(6烢\",v");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1104657206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1104657206L))
            info.setReturnValue(776457426);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1744463377(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1744463377L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1263901998(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1263901998L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "text()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void text__1110514701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1110514701L))
            info.setReturnValue(null);
    }


}

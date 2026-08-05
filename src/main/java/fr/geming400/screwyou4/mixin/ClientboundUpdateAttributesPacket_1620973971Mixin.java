package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundUpdateAttributesPacket.class)
public class ClientboundUpdateAttributesPacket_1620973971Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1776841560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1776841560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_29496376(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(29496376L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1325262107(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1325262107L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getValues()Ljava/util/List;", cancellable = true)
    private void getValues_100781018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(100781018L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntityId()I", cancellable = true)
    private void getEntityId_986232356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(986232356L))
            info.setReturnValue(-875795529);
    }


}

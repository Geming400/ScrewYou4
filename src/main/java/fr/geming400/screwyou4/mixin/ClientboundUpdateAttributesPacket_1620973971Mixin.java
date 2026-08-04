package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundUpdateAttributesPacket.class)
public class ClientboundUpdateAttributesPacket_1620973971Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__58051118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-58051118L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1818481504(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1818481504L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1995924413(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1995924413L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getValues()Ljava/util/List;", cancellable = true)
    private void getValues__1047656510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1047656510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntityId()I", cancellable = true)
    private void getEntityId_1659236216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1659236216L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundGameEventPacket.class)
public class ClientboundGameEventPacket_1407497633Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1563365222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1563365222L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__183979962(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-183979962L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1111785769(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1111785769L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getParam()F", cancellable = true)
    private void getParam_1509912524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1509912524L))
            info.setReturnValue(5.132198E8F);
    }

    @Inject(at = @At("HEAD"), method = "getEvent()Lnet/minecraft/network/protocol/game/ClientboundGameEventPacket$Type;", cancellable = true)
    private void getEvent_649911034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(649911034L))
            info.setReturnValue(null);
    }


}

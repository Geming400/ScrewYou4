package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundGameEventPacket.class)
public class ClientboundGameEventPacket_1407497633Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__271527456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-271527456L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1605005166(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1605005166L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_2085566545(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2085566545L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEvent()Lnet/minecraft/network/protocol/game/ClientboundGameEventPacket$Type;", cancellable = true)
    private void getEvent__1498934434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1498934434L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getParam()F", cancellable = true)
    private void getParam_1445756995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1445756995L))
            info.setReturnValue(null);
    }


}

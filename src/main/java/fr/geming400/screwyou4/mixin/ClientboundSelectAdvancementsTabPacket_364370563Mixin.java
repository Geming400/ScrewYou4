package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSelectAdvancementsTabPacket.class)
public class ClientboundSelectAdvancementsTabPacket_364370563Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1314654526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1314654526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1042439475(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1042439475L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_561878096(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(561878096L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTab()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTab__2078695991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2078695991L))
            info.setReturnValue(null);
    }


}

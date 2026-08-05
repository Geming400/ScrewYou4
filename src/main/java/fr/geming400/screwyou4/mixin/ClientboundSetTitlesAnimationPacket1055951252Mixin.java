package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetTitlesAnimationPacket.class)
public class ClientboundSetTitlesAnimationPacket1055951252Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__623073836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-623073836L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1253458786(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1253458786L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1734020165(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1734020165L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFadeOut()I", cancellable = true)
    private void getFadeOut_1094213498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1094213498L))
            info.setReturnValue(-1988995599);
    }

    @Inject(at = @At("HEAD"), method = "getStay()I", cancellable = true)
    private void getStay_1094213498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1094213498L))
            info.setReturnValue(-1988995599);
    }

    @Inject(at = @At("HEAD"), method = "getFadeIn()I", cancellable = true)
    private void getFadeIn_1094213498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1094213498L))
            info.setReturnValue(-1988995599);
    }


}

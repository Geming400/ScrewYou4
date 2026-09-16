package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetTitlesAnimationPacket.class)
public class ClientboundSetTitlesAnimationPacket1055951252Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1211818842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211818842L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__535526342(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-535526342L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_760239389(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(760239389L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStay()I", cancellable = true)
    private void getStay__954017269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-954017269L))
            info.setReturnValue(-1356782713);
    }

    @Inject(at = @At("HEAD"), method = "getFadeOut()I", cancellable = true)
    private void getFadeOut_183673342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(183673342L))
            info.setReturnValue(-1595951838);
    }

    @Inject(at = @At("HEAD"), method = "getFadeIn()I", cancellable = true)
    private void getFadeIn__1242577373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1242577373L))
            info.setReturnValue(640058798);
    }


}

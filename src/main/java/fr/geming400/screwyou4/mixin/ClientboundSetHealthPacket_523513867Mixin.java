package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetHealthPacket.class)
public class ClientboundSetHealthPacket_523513867Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1155511222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1155511222L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_721021400(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(721021400L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1201582779(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1201582779L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSaturation()F", cancellable = true)
    private void getSaturation_561773229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(561773229L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFood()I", cancellable = true)
    private void getFood_561776112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(561776112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHealth()F", cancellable = true)
    private void getHealth_561773229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(561773229L))
            info.setReturnValue(null);
    }


}

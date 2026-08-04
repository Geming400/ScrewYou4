package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundMovePlayerPacket.StatusOnly.class)
public class StatusOnly_209711497Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1469313592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1469313592L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_887780409(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(887780409L))
            info.cancel();
    }


}

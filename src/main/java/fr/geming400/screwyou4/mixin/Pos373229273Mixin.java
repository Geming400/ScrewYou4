package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundMoveEntityPacket.Pos.class)
public class Pos373229273Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1305795815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1305795815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1051298186(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1051298186L))
            info.cancel();
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundMovePlayerPacket.PosRot.class)
public class PosRot_1541990180Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__137034909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-137034909L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__2074908204(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2074908204L))
            info.cancel();
    }


}

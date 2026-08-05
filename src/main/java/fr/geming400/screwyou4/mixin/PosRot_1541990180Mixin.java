package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundMovePlayerPacket.PosRot.class)
public class PosRot_1541990180Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1697857769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1697857769L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1246278316(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1246278316L))
            info.cancel();
    }


}

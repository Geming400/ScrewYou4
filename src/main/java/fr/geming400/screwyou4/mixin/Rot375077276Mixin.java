package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundMoveEntityPacket.Rot.class)
public class Rot375077276Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1303947812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1303947812L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1053146189(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1053146189L))
            info.cancel();
    }


}

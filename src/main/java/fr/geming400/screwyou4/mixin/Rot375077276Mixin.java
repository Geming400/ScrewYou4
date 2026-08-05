package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundMoveEntityPacket.Rot.class)
public class Rot375077276Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_530944866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530944866L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_79365413(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(79365413L))
            info.cancel();
    }


}

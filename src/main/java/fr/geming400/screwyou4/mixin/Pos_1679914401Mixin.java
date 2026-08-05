package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundMovePlayerPacket.Pos.class)
public class Pos_1679914401Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1835781990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1835781990L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1384202537(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1384202537L))
            info.cancel();
    }


}

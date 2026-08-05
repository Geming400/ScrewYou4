package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundMoveEntityPacket.Pos.class)
public class Pos373229273Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_529096863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(529096863L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_77517410(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(77517410L))
            info.cancel();
    }


}

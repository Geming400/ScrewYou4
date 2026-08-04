package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetBorderWarningDistancePacket.class)
public class ClientboundSetBorderWarningDistancePacket532176912Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1146848176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1146848176L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1210245825(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1210245825L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_729684446(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(729684446L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWarningBlocks()I", cancellable = true)
    private void getWarningBlocks_570439158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(570439158L))
            info.setReturnValue(null);
    }


}

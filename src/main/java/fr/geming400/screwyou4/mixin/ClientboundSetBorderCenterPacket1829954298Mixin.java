package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetBorderCenterPacket.class)
public class ClientboundSetBorderCenterPacket1829954298Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_150929210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(150929210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_2027461832(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2027461832L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1786944085(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1786944085L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNewCenterX()D", cancellable = true)
    private void getNewCenterX_1868211739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1868211739L))
            info.setReturnValue(7.331103002590052E8D);
    }

    @Inject(at = @At("HEAD"), method = "getNewCenterZ()D", cancellable = true)
    private void getNewCenterZ_1868211739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1868211739L))
            info.setReturnValue(7.331103002590052E8D);
    }


}

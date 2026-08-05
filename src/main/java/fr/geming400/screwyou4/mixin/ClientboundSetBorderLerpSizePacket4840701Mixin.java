package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetBorderLerpSizePacket.class)
public class ClientboundSetBorderLerpSizePacket4840701Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_160708291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(160708291L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1586636893(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1586636893L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__290871162(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-290871162L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLerpTime()J", cancellable = true)
    private void getLerpTime_175639690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(175639690L))
            info.setReturnValue(-938669127463610445L);
    }

    @Inject(at = @At("HEAD"), method = "getOldSize()D", cancellable = true)
    private void getOldSize__2041341748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2041341748L))
            info.setReturnValue(4.7099050026100445E8D);
    }

    @Inject(at = @At("HEAD"), method = "getNewSize()D", cancellable = true)
    private void getNewSize__1915456141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1915456141L))
            info.setReturnValue(4.709905005455918E8D);
    }


}

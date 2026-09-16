package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundAnimatePacket.class)
public class ClientboundAnimatePacket1582523320Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1738390910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1738390910L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId__75800275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-75800275L))
            info.setReturnValue(-1811010144);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1286811457(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1286811457L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__8954274(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-8954274L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAction()I", cancellable = true)
    private void getAction__1822002190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1822002190L))
            info.setReturnValue(-1704578918);
    }


}

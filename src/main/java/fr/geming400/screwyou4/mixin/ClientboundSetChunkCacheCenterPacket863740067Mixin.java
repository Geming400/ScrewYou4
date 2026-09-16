package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetChunkCacheCenterPacket.class)
public class ClientboundSetChunkCacheCenterPacket863740067Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1019607657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1019607657L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__727737527(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-727737527L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_568028204(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(568028204L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getX()I", cancellable = true)
    private void getX_1738548231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1738548231L))
            info.setReturnValue(1594011874);
    }

    @Inject(at = @At("HEAD"), method = "getZ()I", cancellable = true)
    private void getZ_1795806533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1795806533L))
            info.setReturnValue(-1644894660);
    }


}

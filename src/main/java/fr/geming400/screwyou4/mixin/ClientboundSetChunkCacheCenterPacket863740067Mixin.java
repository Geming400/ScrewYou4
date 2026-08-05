package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetChunkCacheCenterPacket.class)
public class ClientboundSetChunkCacheCenterPacket863740067Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__815285021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-815285021L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1061247601(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1061247601L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1541808980(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1541808980L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getX()I", cancellable = true)
    private void getX_902002313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902002313L))
            info.setReturnValue(1660866025);
    }

    @Inject(at = @At("HEAD"), method = "getZ()I", cancellable = true)
    private void getZ_902002313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902002313L))
            info.setReturnValue(1660866025);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetChunkCacheRadiusPacket.class)
public class ClientboundSetChunkCacheRadiusPacket_611994656Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_767862245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(767862245L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_316282792(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(316282792L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__979482939(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-979482939L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRadius()I", cancellable = true)
    private void getRadius_1439762301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1439762301L))
            info.setReturnValue(-1669329487);
    }


}

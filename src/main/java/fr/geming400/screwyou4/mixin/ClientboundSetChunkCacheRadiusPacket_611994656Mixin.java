package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetChunkCacheRadiusPacket.class)
public class ClientboundSetChunkCacheRadiusPacket_611994656Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1067030433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1067030433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1290063568(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1290063568L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_809502189(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(809502189L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRadius()I", cancellable = true)
    private void getRadius_650256901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(650256901L))
            info.setReturnValue(-1106228085);
    }


}

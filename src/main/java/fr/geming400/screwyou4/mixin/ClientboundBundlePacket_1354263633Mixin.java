package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundBundlePacket.class)
public class ClientboundBundlePacket_1354263633Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__324761456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-324761456L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_2032332545(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2032332545L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1551771166(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1551771166L))
            info.cancel();
    }


}

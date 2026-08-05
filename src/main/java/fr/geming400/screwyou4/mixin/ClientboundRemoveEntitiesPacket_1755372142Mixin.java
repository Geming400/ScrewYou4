package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundRemoveEntitiesPacket.class)
public class ClientboundRemoveEntitiesPacket_1755372142Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1911239731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1911239731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_163894547(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(163894547L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1459660278(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1459660278L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntityIds()Lit/unimi/dsi/fastutil/ints/IntList;", cancellable = true)
    private void getEntityIds__582731933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-582731933L))
            info.setReturnValue(null);
    }


}

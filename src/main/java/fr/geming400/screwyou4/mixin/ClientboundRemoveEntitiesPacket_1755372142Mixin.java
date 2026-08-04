package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundRemoveEntitiesPacket.class)
public class ClientboundRemoveEntitiesPacket_1755372142Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_76347053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(76347053L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1952879675(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1952879675L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1861526242(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1861526242L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntityIds()Lit/unimi/dsi/fastutil/ints/IntList;", cancellable = true)
    private void getEntityIds__1609104060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1609104060L))
            info.setReturnValue(null);
    }


}

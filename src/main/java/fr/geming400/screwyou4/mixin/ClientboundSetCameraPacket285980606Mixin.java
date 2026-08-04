package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetCameraPacket.class)
public class ClientboundSetCameraPacket285980606Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1393044482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1393044482L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_964049519(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(964049519L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_483488140(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(483488140L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntity(Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getEntity__72785549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-72785549L))
            info.setReturnValue(null);
    }


}

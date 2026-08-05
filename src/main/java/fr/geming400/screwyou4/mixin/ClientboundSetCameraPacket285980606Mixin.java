package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetCameraPacket.class)
public class ClientboundSetCameraPacket285980606Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_441848196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(441848196L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__9731257(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-9731257L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1305496988(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1305496988L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntity(Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getEntity_1725904716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1725904716L))
            info.setReturnValue(null);
    }


}

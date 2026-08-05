package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundTeleportToEntityPacket.class)
public class ServerboundTeleportToEntityPacket_413850498Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_569718087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(569718087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_118138634(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(118138634L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_1051210671(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1051210671L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntity(Lnet/minecraft/server/level/ServerLevel;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getEntity_511704223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511704223L))
            info.setReturnValue(null);
    }


}

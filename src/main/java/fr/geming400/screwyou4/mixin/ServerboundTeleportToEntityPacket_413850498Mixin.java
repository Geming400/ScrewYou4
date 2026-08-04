package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundTeleportToEntityPacket.class)
public class ServerboundTeleportToEntityPacket_413850498Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1265174591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1265174591L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1091919410(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1091919410L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1454771497(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1454771497L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntity(Lnet/minecraft/server/level/ServerLevel;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getEntity_924870808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(924870808L))
            info.setReturnValue(null);
    }


}

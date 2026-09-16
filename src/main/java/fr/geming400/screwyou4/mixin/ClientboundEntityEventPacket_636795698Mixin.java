package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundEntityEventPacket.class)
public class ClientboundEntityEventPacket_636795698Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_792663287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(792663287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__954681897(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-954681897L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_341083834(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(341083834L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntity(Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getEntity_2076719807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2076719807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEventId()B", cancellable = true)
    private void getEventId_476371217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(476371217L))
            info.setReturnValue(78);
    }


}

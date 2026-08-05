package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundEntityEventPacket.class)
public class ClientboundEntityEventPacket_636795698Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1042229391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1042229391L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_834303231(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(834303231L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1314864610(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1314864610L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntity(Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getEntity_278029542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(278029542L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEventId()B", cancellable = true)
    private void getEventId_675051216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(675051216L))
            info.setReturnValue(-105);
    }


}

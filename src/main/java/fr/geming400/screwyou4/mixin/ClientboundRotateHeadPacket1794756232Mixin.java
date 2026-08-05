package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundRotateHeadPacket.class)
public class ClientboundRotateHeadPacket1794756232Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_115731144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(115731144L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1992263766(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1992263766L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1822142151(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1822142151L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntity(Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getEntity_1435990077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1435990077L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getYHeadRot()F", cancellable = true)
    private void getYHeadRot_1833015595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1833015595L))
            info.setReturnValue(9.084371E8F);
    }


}

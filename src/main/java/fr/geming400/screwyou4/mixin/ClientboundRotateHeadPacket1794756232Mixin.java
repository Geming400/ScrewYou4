package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundRotateHeadPacket.class)
public class ClientboundRotateHeadPacket1794756232Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1950623822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1950623822L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_203278638(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(203278638L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1499044369(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1499044369L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getYHeadRot()F", cancellable = true)
    private void getYHeadRot_1161159447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1161159447L))
            info.setReturnValue(6.309209E8F);
    }

    @Inject(at = @At("HEAD"), method = "getEntity(Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getEntity__1060286954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1060286954L))
            info.setReturnValue(null);
    }


}

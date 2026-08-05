package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundDebugEventPacket.class)
public class ClientboundDebugEventPacket1921568964Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_242543876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(242543876L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__987886073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-987886073L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_786108989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(786108989L))
            info.setReturnValue("]GH$YJ: tm$848^vAJEF3\"'vz]AXZ-i{\uBD60{%26?j0");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1959831706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1959831706L))
            info.setReturnValue(1675819);
    }

    @Inject(at = @At("HEAD"), method = "event()Lnet/minecraft/util/debug/DebugSubscription$Event;", cancellable = true)
    private void event__1221800383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1221800383L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1695329419(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1695329419L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_2119076498(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2119076498L))
            info.cancel();
    }


}

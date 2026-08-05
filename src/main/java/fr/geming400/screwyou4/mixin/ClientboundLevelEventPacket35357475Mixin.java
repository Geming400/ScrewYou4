package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundLevelEventPacket.class)
public class ClientboundLevelEventPacket35357475Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1643667613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1643667613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()I", cancellable = true)
    private void getType_73619721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(73619721L))
            info.setReturnValue(1498902040);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_232865009(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(232865009L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_713426388(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(713426388L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getData()I", cancellable = true)
    private void getData_73619721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(73619721L))
            info.setReturnValue(1498902040);
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos__1858029404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1858029404L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isGlobalEvent()Z", cancellable = true)
    private void isGlobalEvent_73636058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(73636058L))
            info.setReturnValue(true);
    }


}

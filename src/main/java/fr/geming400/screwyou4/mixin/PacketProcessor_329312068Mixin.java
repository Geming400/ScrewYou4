package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.PacketProcessor.class)
public class PacketProcessor_329312068Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_367586806(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(367586806L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "processQueuedPackets()V", cancellable = true)
    private void processQueuedPackets_367586806(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(367586806L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSameThread()Z", cancellable = true)
    private void isSameThread_367590650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(367590650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scheduleIfPossible(Lnet/minecraft/network/PacketListener;Lnet/minecraft/network/protocol/Packet;)V", cancellable = true)
    private void scheduleIfPossible__600082139(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-600082139L))
            info.cancel();
    }


}

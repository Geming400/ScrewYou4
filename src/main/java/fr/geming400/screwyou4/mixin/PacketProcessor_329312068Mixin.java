package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.PacketProcessor.class)
public class PacketProcessor_329312068Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1785263362(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1785263362L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "processQueuedPackets()V", cancellable = true)
    private void processQueuedPackets_560761293(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(560761293L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSameThread()Z", cancellable = true)
    private void isSameThread__1623563680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1623563680L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "scheduleIfPossible(Lnet/minecraft/network/PacketListener;Lnet/minecraft/network/protocol/Packet;)V", cancellable = true)
    private void scheduleIfPossible_1038212490(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1038212490L))
            info.cancel();
    }


}

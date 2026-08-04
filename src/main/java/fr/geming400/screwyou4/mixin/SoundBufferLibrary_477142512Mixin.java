package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.sounds.SoundBufferLibrary.class)
public class SoundBufferLibrary_477142512Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_515417250(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(515417250L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "enumerate(Lnet/minecraft/client/sounds/SoundBufferLibrary$DebugOutput;)V", cancellable = true)
    private void enumerate_289252122(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(289252122L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "preload(Ljava/util/Collection;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void preload__1471286981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1471286981L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCompleteBuffer(Lnet/minecraft/resources/Identifier;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void getCompleteBuffer_874283140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(874283140L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStream(Lnet/minecraft/resources/Identifier;Z)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void getStream_1036718922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1036718922L))
            info.setReturnValue(null);
    }


}

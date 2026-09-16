package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.sounds.SoundBufferLibrary.class)
public class SoundBufferLibrary_477142512Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear__308685195(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-308685195L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "enumerate(Lnet/minecraft/client/sounds/SoundBufferLibrary$DebugOutput;)V", cancellable = true)
    private void enumerate__241264330(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-241264330L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "preload(Ljava/util/Collection;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void preload_558643460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(558643460L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getStream(Lnet/minecraft/resources/Identifier;Z)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void getStream_1248316308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1248316308L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getCompleteBuffer(Lnet/minecraft/resources/Identifier;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void getCompleteBuffer_175831635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(175831635L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}

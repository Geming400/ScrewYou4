package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ChunkTaskDispatcher.class)
public class ChunkTaskDispatcher1440453515Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__674121914(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-674121914L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "release(JLjava/lang/Runnable;Z)V", cancellable = true)
    private void release_1960933225(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1960933225L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Ljava/lang/Runnable;JLjava/util/function/IntSupplier;)V", cancellable = true)
    private void submit__1705495107(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1705495107L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasWork()Z", cancellable = true)
    private void hasWork_1391820631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1391820631L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onLevelChange(Lnet/minecraft/world/level/ChunkPos;Ljava/util/function/IntSupplier;ILjava/util/function/IntConsumer;)V", cancellable = true)
    private void onLevelChange__1252413834(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1252413834L))
            info.cancel();
    }


}

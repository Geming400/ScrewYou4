package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ChunkTaskDispatcher.class)
public class ChunkTaskDispatcher1440453515Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1478728254(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1478728254L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "release(JLjava/lang/Runnable;Z)V", cancellable = true)
    private void release_262433744(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(262433744L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Ljava/lang/Runnable;JLjava/util/function/IntSupplier;)V", cancellable = true)
    private void submit_1447084965(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1447084965L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasWork()Z", cancellable = true)
    private void hasWork_1478732098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1478732098L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onLevelChange(Lnet/minecraft/world/level/ChunkPos;Ljava/util/function/IntSupplier;ILjava/util/function/IntConsumer;)V", cancellable = true)
    private void onLevelChange__1089181759(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1089181759L))
            info.cancel();
    }


}

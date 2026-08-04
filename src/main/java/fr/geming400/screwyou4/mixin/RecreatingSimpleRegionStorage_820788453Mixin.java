package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.storage.RecreatingSimpleRegionStorage.class)
public class RecreatingSimpleRegionStorage_820788453Mixin {
        @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/world/level/ChunkPos;Ljava/util/function/Supplier;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void write__181094183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-181094183L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_859063191(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(859063191L))
            info.cancel();
    }


}

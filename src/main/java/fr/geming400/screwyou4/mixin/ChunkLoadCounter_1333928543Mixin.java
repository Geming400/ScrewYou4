package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ChunkLoadCounter.class)
public class ChunkLoadCounter_1333928543Mixin {
        @Inject(at = @At("HEAD"), method = "totalChunks()I", cancellable = true)
    private void totalChunks_1372190788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1372190788L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "track(Lnet/minecraft/server/level/ServerLevel;Ljava/lang/Runnable;)V", cancellable = true)
    private void track_906153696(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(906153696L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pendingChunks()I", cancellable = true)
    private void pendingChunks_1372190788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1372190788L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readyChunks()I", cancellable = true)
    private void readyChunks_1372190788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1372190788L))
            info.setReturnValue(null);
    }


}

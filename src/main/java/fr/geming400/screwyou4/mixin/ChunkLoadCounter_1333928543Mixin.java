package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ChunkLoadCounter.class)
public class ChunkLoadCounter_1333928543Mixin {
        @Inject(at = @At("HEAD"), method = "readyChunks()I", cancellable = true)
    private void readyChunks_397385403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(397385403L))
            info.setReturnValue(-803357458);
    }

    @Inject(at = @At("HEAD"), method = "pendingChunks()I", cancellable = true)
    private void pendingChunks__537711033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-537711033L))
            info.setReturnValue(1305570929);
    }

    @Inject(at = @At("HEAD"), method = "track(Lnet/minecraft/server/level/ServerLevel;Ljava/lang/Runnable;)V", cancellable = true)
    private void track_358473461(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(358473461L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "totalChunks()I", cancellable = true)
    private void totalChunks__246612358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-246612358L))
            info.setReturnValue(719763294);
    }


}

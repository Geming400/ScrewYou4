package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.CarvingMask.class)
public class CarvingMask_637883842Mixin {
        @Inject(at = @At("HEAD"), method = "get(III)Z", cancellable = true)
    private void get__142204719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-142204719L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toArray()[J", cancellable = true)
    private void toArray_1823726159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1823726159L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stream(Lnet/minecraft/world/level/ChunkPos;)Ljava/util/stream/Stream;", cancellable = true)
    private void stream__1218875358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1218875358L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(III)V", cancellable = true)
    private void set__142208563(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-142208563L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setAdditionalMask(Lnet/minecraft/world/level/chunk/CarvingMask$Mask;)V", cancellable = true)
    private void setAdditionalMask_503613153(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(503613153L))
            info.cancel();
    }


}

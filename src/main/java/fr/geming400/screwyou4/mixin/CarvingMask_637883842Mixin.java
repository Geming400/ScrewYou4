package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.CarvingMask.class)
public class CarvingMask_637883842Mixin {
        @Inject(at = @At("HEAD"), method = "get(III)Z", cancellable = true)
    private void get_1871051303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1871051303L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toArray()[J", cancellable = true)
    private void toArray__797133715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-797133715L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stream(Lnet/minecraft/world/level/ChunkPos;)Ljava/util/stream/Stream;", cancellable = true)
    private void stream_837423266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(837423266L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(III)V", cancellable = true)
    private void set_1782467631(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1782467631L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setAdditionalMask(Lnet/minecraft/world/level/chunk/CarvingMask$Mask;)V", cancellable = true)
    private void setAdditionalMask_800875148(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(800875148L))
            info.cancel();
    }


}

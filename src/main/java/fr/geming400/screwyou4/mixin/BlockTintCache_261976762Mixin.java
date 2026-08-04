package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.color.block.BlockTintCache.class)
public class BlockTintCache_261976762Mixin {
        @Inject(at = @At("HEAD"), method = "invalidateForChunk(II)V", cancellable = true)
    private void invalidateForChunk__733902708(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-733902708L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "invalidateAll()V", cancellable = true)
    private void invalidateAll_300251500(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(300251500L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getColor(Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private void getColor_430730867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(430730867L))
            info.setReturnValue(null);
    }


}

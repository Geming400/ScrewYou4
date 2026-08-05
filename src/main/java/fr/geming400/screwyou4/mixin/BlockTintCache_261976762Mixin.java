package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.color.block.BlockTintCache.class)
public class BlockTintCache_261976762Mixin {
        @Inject(at = @At("HEAD"), method = "invalidateForChunk(II)V", cancellable = true)
    private void invalidateForChunk_763807277(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(763807277L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "invalidateAll()V", cancellable = true)
    private void invalidateAll__2091710778(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2091710778L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getColor(Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private void getColor_1425381600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1425381600L))
            info.setReturnValue(276055069);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ChunkBatchSizeCalculator.class)
public class ChunkBatchSizeCalculator1574751788Mixin {
        @Inject(at = @At("HEAD"), method = "onBatchStart()V", cancellable = true)
    private void onBatchStart__1549057864(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1549057864L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onBatchFinished(I)V", cancellable = true)
    private void onBatchFinished_65185221(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(65185221L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDesiredChunksPerTick()F", cancellable = true)
    private void getDesiredChunksPerTick__346055425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-346055425L))
            info.setReturnValue(2.578792E8F);
    }


}

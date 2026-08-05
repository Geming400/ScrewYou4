package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ChunkBatchSizeCalculator.class)
public class ChunkBatchSizeCalculator1574751788Mixin {
        @Inject(at = @At("HEAD"), method = "onBatchFinished(I)V", cancellable = true)
    private void onBatchFinished__1506298536(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1506298536L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onBatchStart()V", cancellable = true)
    private void onBatchStart_1613026527(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1613026527L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDesiredChunksPerTick()F", cancellable = true)
    private void getDesiredChunksPerTick_1613011151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1613011151L))
            info.setReturnValue(2.154686E8F);
    }


}

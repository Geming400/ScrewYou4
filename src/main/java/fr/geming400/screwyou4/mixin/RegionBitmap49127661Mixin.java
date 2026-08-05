package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.storage.RegionBitmap.class)
public class RegionBitmap49127661Mixin {
        @Inject(at = @At("HEAD"), method = "allocate(I)I", cancellable = true)
    private void allocate__454671159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-454671159L))
            info.setReturnValue(-1225958826);
    }

    @Inject(at = @At("HEAD"), method = "force(II)V", cancellable = true)
    private void force__2105205387(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2105205387L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "free(II)V", cancellable = true)
    private void free_1580977876(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1580977876L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUsed()Lit/unimi/dsi/fastutil/ints/IntSet;", cancellable = true)
    private void getUsed__962658827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-962658827L))
            info.setReturnValue(null);
    }


}

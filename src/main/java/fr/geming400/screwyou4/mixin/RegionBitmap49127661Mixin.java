package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.storage.RegionBitmap.class)
public class RegionBitmap49127661Mixin {
        @Inject(at = @At("HEAD"), method = "allocate(I)I", cancellable = true)
    private void allocate_1263032140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263032140L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "force(II)V", cancellable = true)
    private void force__946751808(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-946751808L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "free(II)V", cancellable = true)
    private void free__946751808(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-946751808L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUsed()Lit/unimi/dsi/fastutil/ints/IntSet;", cancellable = true)
    private void getUsed__555428472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-555428472L))
            info.setReturnValue(null);
    }


}

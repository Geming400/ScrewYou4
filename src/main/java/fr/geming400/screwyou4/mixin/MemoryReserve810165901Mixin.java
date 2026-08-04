package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.MemoryReserve.class)
public class MemoryReserve810165901Mixin {
        @Inject(at = @At("HEAD"), method = "release()V", cancellable = true)
    private static void release_848440888(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(848440888L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "allocate()V", cancellable = true)
    private static void allocate_848440888(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(848440888L))
            info.cancel();
    }


}

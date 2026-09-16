package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.DryFoliageColor.class)
public class DryFoliageColor_1801289017Mixin {
        @Inject(at = @At("HEAD"), method = "get(DD)I", cancellable = true)
    private static void get_29841024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(29841024L))
            info.setReturnValue(1835398731);
    }

    @Inject(at = @At("HEAD"), method = "init([I)V", cancellable = true)
    private static void init_976132129(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(976132129L))
            info.cancel();
    }


}

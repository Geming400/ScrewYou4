package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.DryFoliageColor.class)
public class DryFoliageColor_1801289017Mixin {
        @Inject(at = @At("HEAD"), method = "get(DD)I", cancellable = true)
    private static void get_657633942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(657633942L))
            info.setReturnValue(1482265115);
    }

    @Inject(at = @At("HEAD"), method = "init([I)V", cancellable = true)
    private static void init_1320734513(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1320734513L))
            info.cancel();
    }


}

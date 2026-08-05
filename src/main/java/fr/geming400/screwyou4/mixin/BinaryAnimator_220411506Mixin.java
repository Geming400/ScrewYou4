package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.BinaryAnimator.class)
public class BinaryAnimator_220411506Mixin {
        @Inject(at = @At("HEAD"), method = "tick(Z)V", cancellable = true)
    private void tick_1450028334(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1450028334L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFactor(F)F", cancellable = true)
    private void getFactor_1431542538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1431542538L))
            info.setReturnValue(6.153998E8F);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.SmoothDouble.class)
public class SmoothDouble_1881497755Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset_1919772493(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1919772493L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNewDeltaValue(DD)D", cancellable = true)
    private void getNewDeltaValue_737837627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(737837627L))
            info.setReturnValue(1.2466900679939974E7D);
    }


}

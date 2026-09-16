package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.SmoothDouble.class)
public class SmoothDouble_1881497755Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset_152060766(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(152060766L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNewDeltaValue(DD)D", cancellable = true)
    private void getNewDeltaValue__1071078856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1071078856L))
            info.setReturnValue(7.774988006054251E8D);
    }


}

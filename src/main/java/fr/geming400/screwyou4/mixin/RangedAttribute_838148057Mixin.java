package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.attributes.RangedAttribute.class)
public class RangedAttribute_838148057Mixin {
        @Inject(at = @At("HEAD"), method = "sanitizeValue(D)D", cancellable = true)
    private void sanitizeValue_266082933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(266082933L))
            info.setReturnValue(9.207280048695816E7D);
    }

    @Inject(at = @At("HEAD"), method = "getMaxValue()D", cancellable = true)
    private void getMaxValue_538271990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(538271990L))
            info.setReturnValue(9.307130046648026E7D);
    }

    @Inject(at = @At("HEAD"), method = "getMinValue()D", cancellable = true)
    private void getMinValue__1934389148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1934389148L))
            info.setReturnValue(9.307130091455774E7D);
    }


}

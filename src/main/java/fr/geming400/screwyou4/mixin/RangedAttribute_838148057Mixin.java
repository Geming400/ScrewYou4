package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.attributes.RangedAttribute.class)
public class RangedAttribute_838148057Mixin {
        @Inject(at = @At("HEAD"), method = "sanitizeValue(D)D", cancellable = true)
    private void sanitizeValue_2047430125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2047430125L))
            info.setReturnValue(2.5598680061133814E8D);
    }

    @Inject(at = @At("HEAD"), method = "getMinValue()D", cancellable = true)
    private void getMinValue_876405497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(876405497L))
            info.setReturnValue(2.5598680027387136E8D);
    }

    @Inject(at = @At("HEAD"), method = "getMaxValue()D", cancellable = true)
    private void getMaxValue_876405497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(876405497L))
            info.setReturnValue(2.5898650027387136E8D);
    }


}

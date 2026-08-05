package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.SpecialDates.class)
public class SpecialDates_1106196910Mixin {
        @Inject(at = @At("HEAD"), method = "dayNow()Ljava/time/MonthDay;", cancellable = true)
    private static void dayNow__1182698622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1182698622L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isHalloween()Z", cancellable = true)
    private static void isHalloween_1144475740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1144475740L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isExtendedChristmas()Z", cancellable = true)
    private static void isExtendedChristmas_1144475740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1144475740L))
            info.setReturnValue(true);
    }


}

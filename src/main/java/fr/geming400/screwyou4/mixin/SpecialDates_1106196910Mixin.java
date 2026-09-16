package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.SpecialDates.class)
public class SpecialDates_1106196910Mixin {
        @Inject(at = @At("HEAD"), method = "dayNow()Ljava/time/MonthDay;", cancellable = true)
    private static void dayNow_761823004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(761823004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isHalloween()Z", cancellable = true)
    private static void isHalloween__1978125319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978125319L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isExtendedChristmas()Z", cancellable = true)
    private static void isExtendedChristmas__1052500611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1052500611L))
            info.setReturnValue(false);
    }


}

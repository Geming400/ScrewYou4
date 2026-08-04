package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.EasingType.CubicBezier.class)
public class CubicBezier1059068072Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1850387461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1850387461L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__76392399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-76392399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1097330318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1097330318L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "apply(F)F", cancellable = true)
    private void apply__2024768191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2024768191L))
            info.setReturnValue(null);
    }


}

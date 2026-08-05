package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.Direction8.class)
public class Direction8_1261866891Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/core/Direction8;", cancellable = true)
    private static void values_1250334616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1250334616L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/core/Direction8;", cancellable = true)
    private static void valueOf__924898949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-924898949L))
            info.setReturnValue(net.minecraft.core.Direction8.NORTH);
    }

    @Inject(at = @At("HEAD"), method = "getStepZ()I", cancellable = true)
    private void getStepZ_1300129136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1300129136L))
            info.setReturnValue(-1082678743);
    }

    @Inject(at = @At("HEAD"), method = "getStepX()I", cancellable = true)
    private void getStepX_1300129136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1300129136L))
            info.setReturnValue(-1082678743);
    }

    @Inject(at = @At("HEAD"), method = "getDirections()Ljava/util/Set;", cancellable = true)
    private void getDirections__567168596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-567168596L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.input.NumberRangeInput.RangeInfo.class)
public class RangeInfo587227657Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1972739916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1972739916L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__548232318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-548232318L))
            info.setReturnValue("#8pn3\uA704n\u73A34u?,Sr|7\uD5FA(-\uD261rq;{mg\uB673j}nzcMyyjm3|j\u7889\u36C2vdyo\"SnAA\u1F88mY\uFA6Dr`)+no%qkvS#cJJ.\uADF6,Z}'n\uC5CE7Ih ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_625490399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(625490399L))
            info.setReturnValue(-316308299);
    }

    @Inject(at = @At("HEAD"), method = "end()F", cancellable = true)
    private void end_625487020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(625487020L))
            info.setReturnValue(9.069308E8F);
    }

    @Inject(at = @At("HEAD"), method = "start()F", cancellable = true)
    private void start_625487020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(625487020L))
            info.setReturnValue(9.069308E8F);
    }

    @Inject(at = @At("HEAD"), method = "step()Ljava/util/Optional;", cancellable = true)
    private void step_832689079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(832689079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "initial()Ljava/util/Optional;", cancellable = true)
    private void initial_832689079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(832689079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "computeScaledValue(F)F", cancellable = true)
    private void computeScaledValue_1798358690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1798358690L))
            info.setReturnValue(9.069308E8F);
    }

    @Inject(at = @At("HEAD"), method = "initialSliderValue()F", cancellable = true)
    private void initialSliderValue_625487020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(625487020L))
            info.setReturnValue(9.069308E8F);
    }


}

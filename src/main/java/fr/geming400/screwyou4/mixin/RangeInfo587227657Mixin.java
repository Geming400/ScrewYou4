package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.input.NumberRangeInput.RangeInfo.class)
public class RangeInfo587227657Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__321398611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-321398611L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1357651182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1357651182L))
            info.setReturnValue("V@,*UiD\"");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1144579748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1144579748L))
            info.setReturnValue(-1142099840);
    }

    @Inject(at = @At("HEAD"), method = "end()F", cancellable = true)
    private void end__2035223375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2035223375L))
            info.setReturnValue(4.091751E8F);
    }

    @Inject(at = @At("HEAD"), method = "start()F", cancellable = true)
    private void start__1038953078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1038953078L))
            info.setReturnValue(4.091751E8F);
    }

    @Inject(at = @At("HEAD"), method = "step()Ljava/util/Optional;", cancellable = true)
    private void step__400345469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-400345469L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "initial()Ljava/util/Optional;", cancellable = true)
    private void initial_432185083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(432185083L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "initialSliderValue()F", cancellable = true)
    private void initialSliderValue_2065030400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2065030400L))
            info.setReturnValue(4.091751E8F);
    }

    @Inject(at = @At("HEAD"), method = "computeScaledValue(F)F", cancellable = true)
    private void computeScaledValue__1100105950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1100105950L))
            info.setReturnValue(4.091751E8F);
    }


}

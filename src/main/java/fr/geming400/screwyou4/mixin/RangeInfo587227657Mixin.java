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
            info.setReturnValue("#8pn3꜄n玣4u?,Sr|7헺(-퉡rq;{mg뙳j}nzcMyyjm3|j碉㛂vdyo\"SnAAᾈmY舘r`)+no%qkvS#cJJ.귶,Z}'n엎7Ih ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_625490399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(625490399L))
            info.setReturnValue(-1047294699);
    }

    @Inject(at = @At("HEAD"), method = "end()F", cancellable = true)
    private void end_625487020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(625487020L))
            info.setReturnValue(1.759444E8F);
    }

    @Inject(at = @At("HEAD"), method = "start()F", cancellable = true)
    private void start_625487020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(625487020L))
            info.setReturnValue(1.759444E8F);
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

    @Inject(at = @At("HEAD"), method = "initialSliderValue()F", cancellable = true)
    private void initialSliderValue_625487020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(625487020L))
            info.setReturnValue(1.759444E8F);
    }

    @Inject(at = @At("HEAD"), method = "computeScaledValue(F)F", cancellable = true)
    private void computeScaledValue_1798358690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1798358690L))
            info.setReturnValue(1.759444E8F);
    }


}

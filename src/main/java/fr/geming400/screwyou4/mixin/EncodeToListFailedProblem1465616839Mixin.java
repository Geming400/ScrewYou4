package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.TagValueOutput.EncodeToListFailedProblem.class)
public class EncodeToListFailedProblem1465616839Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__2020083301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2020083301L))
            info.setReturnValue(",");
    }

    @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value_462095891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(462095891L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_556990571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(556990571L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2058926932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2058926932L))
            info.setReturnValue("Kh$;");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2022968930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2022968930L))
            info.setReturnValue(-251022200);
    }

    @Inject(at = @At("HEAD"), method = "error()Lcom/mojang/serialization/DataResult$Error;", cancellable = true)
    private void error__1020642454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1020642454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description_291629132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(291629132L))
            info.setReturnValue("X\u8086");
    }


}

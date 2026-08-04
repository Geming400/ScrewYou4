package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.TagValueOutput.EncodeToFieldFailedProblem.class)
public class EncodeToFieldFailedProblem194927183Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__940533288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-940533288L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value_2054119402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2054119402L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1580439442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580439442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__940532792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-940532792L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_233189925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(233189925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "error()Lcom/mojang/serialization/DataResult$Error;", cancellable = true)
    private void error_647171834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(647171834L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description__940533288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-940533288L))
            info.setReturnValue(null);
    }


}

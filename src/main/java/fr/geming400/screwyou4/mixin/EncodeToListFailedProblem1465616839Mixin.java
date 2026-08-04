package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.TagValueOutput.EncodeToListFailedProblem.class)
public class EncodeToListFailedProblem1465616839Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_330156368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(330156368L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value__970158238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-970158238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1443838198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1443838198L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_330156864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(330156864L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1503879581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1503879581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "error()Lcom/mojang/serialization/DataResult$Error;", cancellable = true)
    private void error_1917861490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1917861490L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description_330156368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(330156368L))
            info.setReturnValue(null);
    }


}

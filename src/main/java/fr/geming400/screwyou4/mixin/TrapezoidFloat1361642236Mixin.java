package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.valueproviders.TrapezoidFloat.class)
public class TrapezoidFloat1361642236Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1547812801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1547812801L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_226181765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(226181765L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1399904978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1399904978L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "min()F", cancellable = true)
    private void min_1399901599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1399901599L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "max()F", cancellable = true)
    private void max_1399901599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1399901599L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(FFF)Lnet/minecraft/util/valueproviders/TrapezoidFloat;", cancellable = true)
    private static void of__1974249709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1974249709L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1197471336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1197471336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;)F", cancellable = true)
    private void sample__345388225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-345388225L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "plateau()F", cancellable = true)
    private void plateau_1399901599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1399901599L))
            info.setReturnValue(null);
    }


}

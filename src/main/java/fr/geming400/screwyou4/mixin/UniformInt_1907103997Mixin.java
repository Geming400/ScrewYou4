package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.valueproviders.UniformInt.class)
public class UniformInt_1907103997Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_998477728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(998477728L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1617440271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1617440271L))
            info.setReturnValue("\u9A0EgokMvW)${");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1830511209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1830511209L))
            info.setReturnValue(-579485377);
    }

    @Inject(at = @At("HEAD"), method = "of(II)Lnet/minecraft/util/valueproviders/UniformInt;", cancellable = true)
    private static void of_1675303193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1675303193L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1321418046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1321418046L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxInclusive()I", cancellable = true)
    private void maxInclusive__62735622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-62735622L))
            info.setReturnValue(-721329047);
    }

    @Inject(at = @At("HEAD"), method = "minInclusive()I", cancellable = true)
    private void minInclusive__2042657944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2042657944L))
            info.setReturnValue(928440616);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;)I", cancellable = true)
    private void sample_874042028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(874042028L))
            info.setReturnValue(-627172077);
    }


}

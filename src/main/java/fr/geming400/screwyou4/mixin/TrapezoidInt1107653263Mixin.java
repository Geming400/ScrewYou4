package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.valueproviders.TrapezoidInt.class)
public class TrapezoidInt1107653263Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_199026995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(199026995L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1878076292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1878076292L))
            info.setReturnValue("(3S2\uB405\uA4ADWr5&!.c\u9663^SiB%yGxn/Gz\u8476l?&.V<y");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1665005354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1665005354L))
            info.setReturnValue(-574171774);
    }

    @Inject(at = @At("HEAD"), method = "of(III)Lnet/minecraft/util/valueproviders/TrapezoidInt;", cancellable = true)
    private static void of__1555650439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1555650439L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2120868779(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2120868779L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxInclusive()I", cancellable = true)
    private void maxInclusive__862186355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-862186355L))
            info.setReturnValue(1843013968);
    }

    @Inject(at = @At("HEAD"), method = "minInclusive()I", cancellable = true)
    private void minInclusive_1452858619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1452858619L))
            info.setReturnValue(-930723093);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;)I", cancellable = true)
    private void sample_74591295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(74591295L))
            info.setReturnValue(-1995895427);
    }

    @Inject(at = @At("HEAD"), method = "triangle(I)Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private static void triangle__1532850223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1532850223L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "plateau()I", cancellable = true)
    private void plateau_1137899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1137899L))
            info.setReturnValue(-1714504280);
    }


}

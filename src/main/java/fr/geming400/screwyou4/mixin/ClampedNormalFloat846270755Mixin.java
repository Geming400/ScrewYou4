package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.valueproviders.ClampedNormalFloat.class)
public class ClampedNormalFloat846270755Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__62355513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-62355513L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1616693784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1616693784L))
            info.setReturnValue("");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1403622846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1403622846L))
            info.setReturnValue(-949659539);
    }

    @Inject(at = @At("HEAD"), method = "min()F", cancellable = true)
    private void min__574859084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-574859084L))
            info.setReturnValue(2.436002E8F);
    }

    @Inject(at = @At("HEAD"), method = "max()F", cancellable = true)
    private void max_1201337570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1201337570L))
            info.setReturnValue(2.436002E8F);
    }

    @Inject(at = @At("HEAD"), method = "of(FFFF)Lnet/minecraft/util/valueproviders/ClampedNormalFloat;", cancellable = true)
    private static void of__477494016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-477494016L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mean()F", cancellable = true)
    private void mean_413424417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(413424417L))
            info.setReturnValue(2.436002E8F);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1912716009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1912716009L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deviation()F", cancellable = true)
    private void deviation_746000357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(746000357L))
            info.setReturnValue(2.436002E8F);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;FFFF)F", cancellable = true)
    private static void sample_1327798536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1327798536L))
            info.setReturnValue(2.436002E8F);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;)F", cancellable = true)
    private void sample__186794096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-186794096L))
            info.setReturnValue(2.436002E8F);
    }


}

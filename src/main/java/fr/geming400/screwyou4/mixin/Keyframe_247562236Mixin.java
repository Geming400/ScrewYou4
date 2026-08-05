package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.Keyframe.class)
public class Keyframe_247562236Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value_2106754454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2106754454L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1633074494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1633074494L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__887897740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-887897740L))
            info.setReturnValue("=L\u037FS\uBD198\u9E26\u3352/||wfH\u67B8hT\uD436.n8[<>Vm\\");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_285824977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(285824977L))
            info.setReturnValue(-1586280033);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_731240210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(731240210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ticks()I", cancellable = true)
    private void ticks_285824481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(285824481L))
            info.setReturnValue(-1407756543);
    }


}

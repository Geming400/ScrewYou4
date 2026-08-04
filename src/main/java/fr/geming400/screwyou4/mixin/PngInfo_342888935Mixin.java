package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.PngInfo.class)
public class PngInfo_342888935Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1728401193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1728401193L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__792571041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-792571041L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_381151676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(381151676L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width_381151180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(381151180L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromStream(Ljava/io/InputStream;)Lnet/minecraft/util/PngInfo;", cancellable = true)
    private static void fromStream_1323820869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1323820869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_381151180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(381151180L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromBytes([B)Lnet/minecraft/util/PngInfo;", cancellable = true)
    private static void fromBytes_1862474567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1862474567L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateHeader(Ljava/nio/ByteBuffer;)V", cancellable = true)
    private static void validateHeader__268063400(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-268063400L))
            info.cancel();
    }


}

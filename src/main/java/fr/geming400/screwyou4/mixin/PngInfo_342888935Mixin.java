package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.PngInfo.class)
public class PngInfo_342888935Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__565737334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-565737334L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1113312459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1113312459L))
            info.setReturnValue("k\uB019As=SRm8 \uA35ANz|d\u0767yGO c(%q\u303BO=W.Tld\u0C8F<}nHx");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_900241025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(900241025L))
            info.setReturnValue(-478365124);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width__1297259066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1297259066L))
            info.setReturnValue(1204088552);
    }

    @Inject(at = @At("HEAD"), method = "fromStream(Ljava/io/InputStream;)Lnet/minecraft/util/PngInfo;", cancellable = true)
    private static void fromStream_166086075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(166086075L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height__742459643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-742459643L))
            info.setReturnValue(-1926303096);
    }

    @Inject(at = @At("HEAD"), method = "fromBytes([B)Lnet/minecraft/util/PngInfo;", cancellable = true)
    private static void fromBytes__301984280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-301984280L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateHeader(Ljava/nio/ByteBuffer;)V", cancellable = true)
    private static void validateHeader__1814982949(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1814982949L))
            info.cancel();
    }


}

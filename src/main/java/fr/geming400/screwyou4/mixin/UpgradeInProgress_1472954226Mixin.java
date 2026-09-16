package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.FileFixerUpper.UpgradeInProgress.class)
public class UpgradeInProgress_1472954226Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_564327957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(564327957L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2051589546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2051589546L))
            info.setReturnValue("4)zG\uCBE3*l\u798FC:n\uF9AFe_|}\u6FF1\u2D70dZ0ucp\uCD8Dc&\u5C0F{O\uFB32}/<M#Xa\uCC50e4Gu.W\u21DB");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2030306316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2030306316L))
            info.setReturnValue(1999293595);
    }

    @Inject(at = @At("HEAD"), method = "moves()Ljava/util/List;", cancellable = true)
    private void moves_877573987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(877573987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Ljava/nio/file/Path;Ljava/nio/file/Path;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec__1286385977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1286385977L))
            info.setReturnValue(null);
    }


}

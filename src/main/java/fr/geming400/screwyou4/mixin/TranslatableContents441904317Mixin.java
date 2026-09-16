package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.contents.TranslatableContents.class)
public class TranslatableContents441904317Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__466722447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-466722447L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1212327346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1212327346L))
            info.setReturnValue("v F\u7E95NcCcof\uB5BC\"yFX\"\uACE82KMXM,%r\u3370\u01BA<vR+\u12CEW`");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_999255912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(999255912L))
            info.setReturnValue(-696423485);
    }

    @Inject(at = @At("HEAD"), method = "getKey()Ljava/lang/String;", cancellable = true)
    private void getKey_1718470319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1718470319L))
            info.setReturnValue("Y\uD6D9lx$\u5F3Eiw1vTBh,U16w\uC3A8(ckx\uB656AZ$)");
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/network/chat/ResolutionContext;I)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void resolve__1096642177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1096642177L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visit(Lnet/minecraft/network/chat/FormattedText$ContentConsumer;)Ljava/util/Optional;", cancellable = true)
    private void visit__1346515143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1346515143L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visit(Lnet/minecraft/network/chat/FormattedText$StyledContentConsumer;Lnet/minecraft/network/chat/Style;)Ljava/util/Optional;", cancellable = true)
    private void visit__1316976954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1316976954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1508349571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1508349571L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAllowedPrimitiveArgument(Ljava/lang/Object;)Z", cancellable = true)
    private static void isAllowedPrimitiveArgument__163656958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-163656958L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getFallback()Ljava/lang/String;", cancellable = true)
    private void getFallback__1934836066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1934836066L))
            info.setReturnValue("R-UGBC:)w3*C,TuW(r0{5pzfD!n\u483AYYq+Mg1:v`\uD0C8%ehX\"n:0L\uCFFEzSdBCq9|m5(1<5+vu&,f9+\u1847\uC75C\u9010WH\u781BHe.\u3382lD6");
    }

    @Inject(at = @At("HEAD"), method = "getArgument(I)Lnet/minecraft/network/chat/FormattedText;", cancellable = true)
    private void getArgument_545235016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(545235016L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getArgs()[Ljava/lang/Object;", cancellable = true)
    private void getArgs__1837003874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1837003874L))
            info.setReturnValue(null);
    }


}

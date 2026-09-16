package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.api.MethodInfo.Named.class)
public class Named_281476726Mixin {
        @Inject(at = @At("HEAD"), method = "name()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void name__1076783801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1076783801L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__627149543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-627149543L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1051900250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1051900250L))
            info.setReturnValue("5\u3795Wjy&J\"0Z5\"\uCF38RX=9R\"\uD337\u3A7Fo:K8|pRN-h\u9B5EO`n2mCl]=A\u99F94nK(\u44E05Cg%wOsgi(\u2C4F\uAC82($kl%@\uD3BDP+ZX3g");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_838828816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(838828816L))
            info.setReturnValue(-1642940084);
    }

    @Inject(at = @At("HEAD"), method = "contents()Lnet/minecraft/server/jsonrpc/api/MethodInfo;", cancellable = true)
    private void contents_596445265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(596445265L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "typedCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void typedCodec__820013185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-820013185L))
            info.setReturnValue(null);
    }


}

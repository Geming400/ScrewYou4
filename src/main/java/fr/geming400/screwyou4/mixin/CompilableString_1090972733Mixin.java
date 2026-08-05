package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.CompilableString.class)
public class CompilableString_1090972733Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1818482801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1818482801L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__44487739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-44487739L))
            info.setReturnValue("Dp:)w77,BA");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1129234978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1129234978L))
            info.setReturnValue(-883363772);
    }

    @Inject(at = @At("HEAD"), method = "source()Ljava/lang/String;", cancellable = true)
    private void source__44487739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-44487739L))
            info.setReturnValue("Dp:)w77,BA");
    }

    @Inject(at = @At("HEAD"), method = "compiled()Ljava/lang/Object;", cancellable = true)
    private void compiled__1344802345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1344802345L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Ljava/util/function/Function;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_1484422514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1484422514L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.OptionInstance.Enum.class)
public class Enum643981157Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2029493416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2029493416L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__491478818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-491478818L))
            info.setReturnValue("OoxMLCoMdFD9WSVnjI0rqkB O\uC132P'oIr+R\uCB97s@9 9ITt_");
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/List;", cancellable = true)
    private void values__2024649323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2024649323L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_682243899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(682243899L))
            info.setReturnValue(447133118);
    }

    @Inject(at = @At("HEAD"), method = "validateValue(Ljava/lang/Object;)Ljava/util/Optional;", cancellable = true)
    private void validateValue__365875721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-365875721L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_252015531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(252015531L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueListSupplier()Lnet/minecraft/client/gui/components/CycleButton$ValueListSupplier;", cancellable = true)
    private void valueListSupplier__1372254705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1372254705L))
            info.setReturnValue(null);
    }


}

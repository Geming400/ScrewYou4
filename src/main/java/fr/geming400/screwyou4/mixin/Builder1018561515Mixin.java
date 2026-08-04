package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.FileFixerUpper.Builder.class)
public class Builder1018561515Mixin {
        @Inject(at = @At("HEAD"), method = "build(Lcom/mojang/datafixers/DataFixerBuilder$Result;)Lnet/minecraft/util/filefix/FileFixerUpper;", cancellable = true)
    private void build__964095550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964095550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addFixer(Lnet/minecraft/util/filefix/FileFix;)V", cancellable = true)
    private void addFixer__1768588765(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1768588765L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSchema(Lcom/mojang/datafixers/DataFixerBuilder;ILjava/util/function/BiFunction;)Lcom/mojang/datafixers/schemas/Schema;", cancellable = true)
    private void addSchema__1657005721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1657005721L))
            info.setReturnValue(null);
    }


}

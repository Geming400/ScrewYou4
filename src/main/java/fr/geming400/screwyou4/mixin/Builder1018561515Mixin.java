package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.FileFixerUpper.Builder.class)
public class Builder1018561515Mixin {
        @Inject(at = @At("HEAD"), method = "build(Lcom/mojang/datafixers/DataFixerBuilder$Result;)Lnet/minecraft/util/filefix/FileFixerUpper;", cancellable = true)
    private void build__1765411920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1765411920L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addFixer(Lnet/minecraft/util/filefix/FileFix;)V", cancellable = true)
    private void addFixer_535511010(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(535511010L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSchema(Lcom/mojang/datafixers/DataFixerBuilder;ILjava/util/function/BiFunction;)Lcom/mojang/datafixers/schemas/Schema;", cancellable = true)
    private void addSchema__730695031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-730695031L))
            info.setReturnValue(null);
    }


}

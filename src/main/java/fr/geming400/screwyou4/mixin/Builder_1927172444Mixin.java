package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.ShaderDefines.Builder.class)
public class Builder_1927172444Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/renderer/ShaderDefines;", cancellable = true)
    private void build__1006223878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1006223878L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "define(Ljava/lang/String;)Lnet/minecraft/client/renderer/ShaderDefines$Builder;", cancellable = true)
    private void define_224766688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(224766688L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "define(Ljava/lang/String;F)Lnet/minecraft/client/renderer/ShaderDefines$Builder;", cancellable = true)
    private void define__1367951656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1367951656L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "define(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/client/renderer/ShaderDefines$Builder;", cancellable = true)
    private void define__1694427094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1694427094L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "define(Ljava/lang/String;I)Lnet/minecraft/client/renderer/ShaderDefines$Builder;", cancellable = true)
    private void define_523424219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(523424219L))
            info.setReturnValue(null);
    }


}

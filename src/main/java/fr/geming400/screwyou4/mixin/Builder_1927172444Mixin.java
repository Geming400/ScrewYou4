package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.ShaderDefines.Builder.class)
public class Builder_1927172444Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/renderer/ShaderDefines;", cancellable = true)
    private void build__2032147800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2032147800L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "define(Ljava/lang/String;)Lnet/minecraft/client/renderer/ShaderDefines$Builder;", cancellable = true)
    private void define_1162149755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1162149755L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "define(Ljava/lang/String;F)Lnet/minecraft/client/renderer/ShaderDefines$Builder;", cancellable = true)
    private void define_1921119645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1921119645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "define(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/client/renderer/ShaderDefines$Builder;", cancellable = true)
    private void define__1487102971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1487102971L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "define(Ljava/lang/String;I)Lnet/minecraft/client/renderer/ShaderDefines$Builder;", cancellable = true)
    private void define__482471776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-482471776L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.valueproviders.IntProviders.class)
public class IntProviders_1433849845Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void bootstrap_2028439014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2028439014L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(II)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_168030738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(168030738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateCodec(IILcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void validateCodec_1338618859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1338618859L))
            info.setReturnValue(null);
    }


}

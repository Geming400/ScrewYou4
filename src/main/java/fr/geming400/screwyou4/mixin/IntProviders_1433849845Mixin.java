package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.valueproviders.IntProviders.class)
public class IntProviders_1433849845Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void bootstrap__1844314796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1844314796L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(II)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec__269205080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-269205080L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateCodec(IILcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void validateCodec__1511784309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1511784309L))
            info.setReturnValue(null);
    }


}

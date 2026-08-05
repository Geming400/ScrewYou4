package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.valueproviders.FloatProviders.class)
public class FloatProviders402365118Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void bootstrap_1419167774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1419167774L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(FF)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_449046738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(449046738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(F)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_2145172720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2145172720L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.valueproviders.FloatProviders.class)
public class FloatProviders402365118Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void bootstrap_996954288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(996954288L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(FF)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_886282556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(886282556L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(F)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec__1304406202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1304406202L))
            info.setReturnValue(null);
    }


}

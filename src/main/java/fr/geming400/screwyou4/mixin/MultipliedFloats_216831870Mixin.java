package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.valueproviders.MultipliedFloats.class)
public class MultipliedFloats_216831870Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__918628602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-918628602L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;)F", cancellable = true)
    private void sample__1490198592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1490198592L))
            info.setReturnValue(null);
    }


}

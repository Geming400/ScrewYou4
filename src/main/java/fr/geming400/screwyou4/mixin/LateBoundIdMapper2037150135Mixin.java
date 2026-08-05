package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ExtraCodecs.LateBoundIdMapper.class)
public class LateBoundIdMapper2037150135Mixin {
        @Inject(at = @At("HEAD"), method = "put(Ljava/lang/Object;Ljava/lang/Object;)Lnet/minecraft/util/ExtraCodecs$LateBoundIdMapper;", cancellable = true)
    private void put_1082118441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1082118441L))
            info.setReturnValue(new net.minecraft.util.ExtraCodecs$LateBoundIdMapper());
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/Set;", cancellable = true)
    private void values_208114649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(208114649L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__1774139434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1774139434L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ExtraCodecs.LateBoundIdMapper.class)
public class LateBoundIdMapper2037150135Mixin {
        @Inject(at = @At("HEAD"), method = "put(Ljava/lang/Object;Ljava/lang/Object;)Lnet/minecraft/util/ExtraCodecs$LateBoundIdMapper;", cancellable = true)
    private void put_593348472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(593348472L))
            info.setReturnValue(new net.minecraft.util.ExtraCodecs.LateBoundIdMapper());
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/Set;", cancellable = true)
    private void values_1163480951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1163480951L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__1906168596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1906168596L))
            info.setReturnValue(null);
    }


}

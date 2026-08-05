package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gameevent.EntityPositionSource.Type.class)
public class Type1078482961Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2144928215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2144928215L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec()Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private void streamCodec__60263145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-60263145L))
            info.setReturnValue(null);
    }


}

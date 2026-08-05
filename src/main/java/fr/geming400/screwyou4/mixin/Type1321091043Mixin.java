package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gameevent.BlockPositionSource.Type.class)
public class Type1321091043Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1907430999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1907430999L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec()Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private void streamCodec_182344937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(182344937L))
            info.setReturnValue(null);
    }


}

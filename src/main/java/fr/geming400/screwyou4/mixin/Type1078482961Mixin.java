package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gameevent.EntityPositionSource.Type.class)
public class Type1078482961Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1480630611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1480630611L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec()Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private void streamCodec__1955484211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1955484211L))
            info.setReturnValue(null);
    }


}

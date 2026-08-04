package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.timers.TimerCallbacks.class)
public class TimerCallbacks45625643Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/resources/Identifier;Lcom/mojang/serialization/MapCodec;)Lnet/minecraft/world/level/timers/TimerCallbacks;", cancellable = true)
    private void register__2031583736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2031583736L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__346339983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-346339983L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.timers.TimerCallbacks.class)
public class TimerCallbacks45625643Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/resources/Identifier;Lcom/mojang/serialization/MapCodec;)Lnet/minecraft/world/level/timers/TimerCallbacks;", cancellable = true)
    private void register__709999061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-709999061L))
            info.setReturnValue(new net.minecraft.world.level.timers.TimerCallbacks());
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__1759083897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1759083897L))
            info.setReturnValue(null);
    }


}

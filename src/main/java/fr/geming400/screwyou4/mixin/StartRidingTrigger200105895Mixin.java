package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.StartRidingTrigger.class)
public class StartRidingTrigger200105895Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void trigger__569455958(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-569455958L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__191859731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-191859731L))
            info.setReturnValue(null);
    }


}

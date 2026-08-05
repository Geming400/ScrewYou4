package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.BrewedPotionTrigger.class)
public class BrewedPotionTrigger_525020586Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/core/Holder;)V", cancellable = true)
    private void trigger__1934997725(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1934997725L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__1279688955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1279688955L))
            info.setReturnValue(null);
    }


}

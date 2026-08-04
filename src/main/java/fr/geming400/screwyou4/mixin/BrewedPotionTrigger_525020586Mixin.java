package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.BrewedPotionTrigger.class)
public class BrewedPotionTrigger_525020586Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/core/Holder;)V", cancellable = true)
    private void trigger_1949494747(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1949494747L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_133054959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(133054959L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.EffectsChangedTrigger.class)
public class EffectsChangedTrigger1591464280Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void trigger__482556524(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-482556524L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_1199498654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1199498654L))
            info.setReturnValue(null);
    }


}

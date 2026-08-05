package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.EffectsChangedTrigger.class)
public class EffectsChangedTrigger1591464280Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void trigger_311056092(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(311056092L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__213245260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-213245260L))
            info.setReturnValue(null);
    }


}

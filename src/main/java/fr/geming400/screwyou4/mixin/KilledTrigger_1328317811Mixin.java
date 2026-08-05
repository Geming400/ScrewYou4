package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.KilledTrigger.class)
public class KilledTrigger_1328317811Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private void trigger__748978419(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-748978419L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__476391730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-476391730L))
            info.setReturnValue(null);
    }


}

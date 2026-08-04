package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.PlayerHurtEntityTrigger.class)
public class PlayerHurtEntityTrigger1857462711Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;FFZ)V", cancellable = true)
    private void trigger_1259554436(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1259554436L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_1465497085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1465497085L))
            info.setReturnValue(null);
    }


}

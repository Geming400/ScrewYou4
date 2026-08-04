package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.EntityHurtPlayerTrigger.class)
public class EntityHurtPlayerTrigger1560718391Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/damagesource/DamageSource;FFZ)V", cancellable = true)
    private void trigger_939419659(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(939419659L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_1168752765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1168752765L))
            info.setReturnValue(null);
    }


}

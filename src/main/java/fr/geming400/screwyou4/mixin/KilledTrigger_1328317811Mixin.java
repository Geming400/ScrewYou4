package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.KilledTrigger.class)
public class KilledTrigger_1328317811Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private void trigger_731621717(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(731621717L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_936352184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(936352184L))
            info.setReturnValue(null);
    }


}

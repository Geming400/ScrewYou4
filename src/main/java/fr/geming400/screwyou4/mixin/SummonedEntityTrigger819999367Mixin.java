package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.SummonedEntityTrigger.class)
public class SummonedEntityTrigger819999367Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void trigger__1254021437(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1254021437L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_428033741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(428033741L))
            info.setReturnValue(null);
    }


}

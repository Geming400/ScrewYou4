package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.FallAfterExplosionTrigger.class)
public class FallAfterExplosionTrigger1240126198Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void trigger__288613890(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-288613890L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__564583342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-564583342L))
            info.setReturnValue(null);
    }


}

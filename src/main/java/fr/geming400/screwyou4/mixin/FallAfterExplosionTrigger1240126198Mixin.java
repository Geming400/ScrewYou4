package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.FallAfterExplosionTrigger.class)
public class FallAfterExplosionTrigger1240126198Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void trigger_637129798(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(637129798L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_848160572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(848160572L))
            info.setReturnValue(null);
    }


}

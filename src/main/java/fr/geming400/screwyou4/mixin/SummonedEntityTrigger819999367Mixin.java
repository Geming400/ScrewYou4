package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.SummonedEntityTrigger.class)
public class SummonedEntityTrigger819999367Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void trigger__460408821(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-460408821L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__984710173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-984710173L))
            info.setReturnValue(null);
    }


}

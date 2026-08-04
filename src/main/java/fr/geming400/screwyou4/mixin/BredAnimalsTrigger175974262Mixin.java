package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.BredAnimalsTrigger.class)
public class BredAnimalsTrigger175974262Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/entity/animal/Animal;Lnet/minecraft/world/entity/animal/Animal;Lnet/minecraft/world/entity/AgeableMob;)V", cancellable = true)
    private void trigger_1443072888(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1443072888L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__215991364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-215991364L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.BredAnimalsTrigger.class)
public class BredAnimalsTrigger175974262Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/entity/animal/Animal;Lnet/minecraft/world/entity/animal/Animal;Lnet/minecraft/world/entity/AgeableMob;)V", cancellable = true)
    private void trigger__1223326528(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1223326528L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__1628735278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1628735278L))
            info.setReturnValue(null);
    }


}

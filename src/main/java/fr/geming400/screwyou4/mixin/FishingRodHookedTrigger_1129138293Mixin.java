package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.FishingRodHookedTrigger.class)
public class FishingRodHookedTrigger_1129138293Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/projectile/FishingHook;Ljava/util/Collection;)V", cancellable = true)
    private void trigger_1389458200(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1389458200L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_737172666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(737172666L))
            info.setReturnValue(null);
    }


}

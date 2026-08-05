package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.EnchantedItemTrigger.class)
public class EnchantedItemTrigger1127183475Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/item/ItemStack;I)V", cancellable = true)
    private void trigger_1589525266(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1589525266L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__677526065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-677526065L))
            info.setReturnValue(null);
    }


}

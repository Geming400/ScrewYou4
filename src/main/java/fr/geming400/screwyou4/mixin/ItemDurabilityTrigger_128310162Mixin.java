package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.ItemDurabilityTrigger.class)
public class ItemDurabilityTrigger_128310162Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/item/ItemStack;I)V", cancellable = true)
    private void trigger__1861860632(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1861860632L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__263655465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-263655465L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.ItemDurabilityTrigger.class)
public class ItemDurabilityTrigger_128310162Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/item/ItemStack;I)V", cancellable = true)
    private void trigger_590651952(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(590651952L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__1676399379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1676399379L))
            info.setReturnValue(null);
    }


}

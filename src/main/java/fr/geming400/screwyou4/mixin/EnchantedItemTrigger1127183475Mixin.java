package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.EnchantedItemTrigger.class)
public class EnchantedItemTrigger1127183475Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/item/ItemStack;I)V", cancellable = true)
    private void trigger__862987318(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-862987318L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_735217849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(735217849L))
            info.setReturnValue(null);
    }


}

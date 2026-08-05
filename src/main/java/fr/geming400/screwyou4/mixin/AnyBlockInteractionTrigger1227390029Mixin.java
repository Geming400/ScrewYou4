package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.AnyBlockInteractionTrigger.class)
public class AnyBlockInteractionTrigger1227390029Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/item/ItemInstance;)V", cancellable = true)
    private void trigger_1397201528(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1397201528L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__577319511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-577319511L))
            info.setReturnValue(null);
    }


}

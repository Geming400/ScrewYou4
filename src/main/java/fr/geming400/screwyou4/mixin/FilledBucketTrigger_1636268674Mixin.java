package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.FilledBucketTrigger.class)
public class FilledBucketTrigger_1636268674Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void trigger__843552927(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-843552927L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__168440867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-168440867L))
            info.setReturnValue(null);
    }


}

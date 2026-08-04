package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.FilledBucketTrigger.class)
public class FilledBucketTrigger_1636268674Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void trigger_324259753(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(324259753L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_1244303047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1244303047L))
            info.setReturnValue(null);
    }


}

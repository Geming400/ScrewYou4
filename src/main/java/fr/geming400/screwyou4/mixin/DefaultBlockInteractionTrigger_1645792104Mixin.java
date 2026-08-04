package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.DefaultBlockInteractionTrigger.class)
public class DefaultBlockInteractionTrigger_1645792104Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void trigger_535737758(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(535737758L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_1253826477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1253826477L))
            info.setReturnValue(null);
    }


}

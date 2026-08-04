package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.UsedEnderEyeTrigger.class)
public class UsedEnderEyeTrigger1445405572Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void trigger_335351227(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(335351227L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_1053439946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1053439946L))
            info.setReturnValue(null);
    }


}

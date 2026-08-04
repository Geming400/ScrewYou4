package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.RecipeCraftedTrigger.class)
public class RecipeCraftedTrigger1320776653Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/resources/ResourceKey;Ljava/util/List;)V", cancellable = true)
    private void trigger_317865829(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(317865829L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_928811027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(928811027L))
            info.setReturnValue(null);
    }


}

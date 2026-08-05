package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.RecipeCraftedTrigger.class)
public class RecipeCraftedTrigger1320776653Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/resources/ResourceKey;Ljava/util/List;)V", cancellable = true)
    private void trigger_1112084141(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1112084141L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__483932887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-483932887L))
            info.setReturnValue(null);
    }


}

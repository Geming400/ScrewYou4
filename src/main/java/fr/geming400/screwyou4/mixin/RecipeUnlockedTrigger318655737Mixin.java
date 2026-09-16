package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.RecipeUnlockedTrigger.class)
public class RecipeUnlockedTrigger318655737Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/item/crafting/RecipeHolder;)V", cancellable = true)
    private void trigger__1699281529(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1699281529L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__1486053803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1486053803L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlocked(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void unlocked__649241657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-649241657L))
            info.setReturnValue(null);
    }


}

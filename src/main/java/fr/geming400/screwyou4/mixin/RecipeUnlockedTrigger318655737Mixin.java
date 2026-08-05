package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.RecipeUnlockedTrigger.class)
public class RecipeUnlockedTrigger318655737Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/item/crafting/RecipeHolder;)V", cancellable = true)
    private void trigger__1622130225(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1622130225L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unlocked(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void unlocked_480936420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(480936420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__73309889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-73309889L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.recipes.RecipeUnlockAdvancementBuilder.class)
public class RecipeUnlockAdvancementBuilder_82081291Mixin {
        @Inject(at = @At("HEAD"), method = "build(Lnet/minecraft/data/recipes/RecipeOutput;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/data/recipes/RecipeCategory;)Lnet/minecraft/advancements/AdvancementHolder;", cancellable = true)
    private void build_750348283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(750348283L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlockedBy(Ljava/lang/String;Lnet/minecraft/advancements/triggers/Criterion;)V", cancellable = true)
    private void unlockedBy_538077813(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(538077813L))
            info.cancel();
    }


}

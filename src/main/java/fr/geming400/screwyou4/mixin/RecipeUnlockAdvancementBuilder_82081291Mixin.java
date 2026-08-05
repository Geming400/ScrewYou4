package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.recipes.RecipeUnlockAdvancementBuilder.class)
public class RecipeUnlockAdvancementBuilder_82081291Mixin {
        @Inject(at = @At("HEAD"), method = "build(Lnet/minecraft/data/recipes/RecipeOutput;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/data/recipes/RecipeCategory;)Lnet/minecraft/advancements/AdvancementHolder;", cancellable = true)
    private void build__436991795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-436991795L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlockedBy(Ljava/lang/String;Lnet/minecraft/advancements/triggers/Criterion;)V", cancellable = true)
    private void unlockedBy__656554609(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-656554609L))
            info.cancel();
    }


}

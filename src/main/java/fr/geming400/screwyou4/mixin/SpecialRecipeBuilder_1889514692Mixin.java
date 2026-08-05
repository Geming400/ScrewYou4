package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.recipes.SpecialRecipeBuilder.class)
public class SpecialRecipeBuilder_1889514692Mixin {
        @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/data/recipes/RecipeOutput;Ljava/lang/String;)V", cancellable = true)
    private void save__1122473398(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1122473398L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/data/recipes/RecipeOutput;Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void save__1943264016(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1943264016L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "special(Ljava/util/function/Supplier;)Lnet/minecraft/data/recipes/SpecialRecipeBuilder;", cancellable = true)
    private static void special_899007965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(899007965L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlockedBy(Ljava/lang/String;Lnet/minecraft/advancements/triggers/Criterion;)Lnet/minecraft/data/recipes/SpecialRecipeBuilder;", cancellable = true)
    private void unlockedBy_73697194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(73697194L))
            info.setReturnValue(null);
    }


}

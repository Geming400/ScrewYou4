package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.recipes.SmithingTrimRecipeBuilder.class)
public class SmithingTrimRecipeBuilder_1181135330Mixin {
        @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/data/recipes/RecipeOutput;Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void save_712076971(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(712076971L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "smithingTrim(Lnet/minecraft/world/item/crafting/Ingredient;Lnet/minecraft/world/item/crafting/Ingredient;Lnet/minecraft/world/item/crafting/Ingredient;Lnet/minecraft/core/Holder;Lnet/minecraft/data/recipes/RecipeCategory;)Lnet/minecraft/data/recipes/SmithingTrimRecipeBuilder;", cancellable = true)
    private static void smithingTrim_873721857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(873721857L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlocks(Ljava/lang/String;Lnet/minecraft/advancements/triggers/Criterion;)Lnet/minecraft/data/recipes/SmithingTrimRecipeBuilder;", cancellable = true)
    private void unlocks_302158630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(302158630L))
            info.setReturnValue(null);
    }


}

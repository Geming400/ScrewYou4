package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.recipes.SmithingTransformRecipeBuilder.class)
public class SmithingTransformRecipeBuilder_568713592Mixin {
        @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/data/recipes/RecipeOutput;Ljava/lang/String;)V", cancellable = true)
    private void save_1177763201(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1177763201L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/data/recipes/RecipeOutput;Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void save_99655233(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(99655233L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "smithing(Lnet/minecraft/world/item/crafting/Ingredient;Lnet/minecraft/world/item/crafting/Ingredient;Lnet/minecraft/world/item/crafting/Ingredient;Lnet/minecraft/data/recipes/RecipeCategory;Lnet/minecraft/world/item/Item;)Lnet/minecraft/data/recipes/SmithingTransformRecipeBuilder;", cancellable = true)
    private static void smithing_190093653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(190093653L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlocks(Ljava/lang/String;Lnet/minecraft/advancements/triggers/Criterion;)Lnet/minecraft/data/recipes/SmithingTransformRecipeBuilder;", cancellable = true)
    private void unlocks__1248408648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1248408648L))
            info.setReturnValue(null);
    }


}

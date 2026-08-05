package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.recipes.SmithingTransformRecipeBuilder.class)
public class SmithingTransformRecipeBuilder_568713592Mixin {
        @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/data/recipes/RecipeOutput;Ljava/lang/String;)V", cancellable = true)
    private void save_1851692798(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1851692798L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/data/recipes/RecipeOutput;Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void save_1030902180(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1030902180L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "smithing(Lnet/minecraft/world/item/crafting/Ingredient;Lnet/minecraft/world/item/crafting/Ingredient;Lnet/minecraft/world/item/crafting/Ingredient;Lnet/minecraft/data/recipes/RecipeCategory;Lnet/minecraft/world/item/Item;)Lnet/minecraft/data/recipes/SmithingTransformRecipeBuilder;", cancellable = true)
    private static void smithing__674479626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-674479626L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlocks(Ljava/lang/String;Lnet/minecraft/advancements/triggers/Criterion;)Lnet/minecraft/data/recipes/SmithingTransformRecipeBuilder;", cancellable = true)
    private void unlocks__895425177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-895425177L))
            info.setReturnValue(null);
    }


}

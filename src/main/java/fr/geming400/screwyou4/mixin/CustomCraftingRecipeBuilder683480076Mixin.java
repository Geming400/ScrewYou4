package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.recipes.CustomCraftingRecipeBuilder.class)
public class CustomCraftingRecipeBuilder683480076Mixin {
        @Inject(at = @At("HEAD"), method = "group(Ljava/lang/String;)Lnet/minecraft/data/recipes/CustomCraftingRecipeBuilder;", cancellable = true)
    private void group_1834251152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1834251152L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/data/recipes/RecipeOutput;Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void save_1145668665(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1145668665L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/data/recipes/RecipeOutput;Ljava/lang/String;)V", cancellable = true)
    private void save_1966459283(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1966459283L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unlockedBy(Ljava/lang/String;Lnet/minecraft/advancements/triggers/Criterion;)Lnet/minecraft/data/recipes/CustomCraftingRecipeBuilder;", cancellable = true)
    private void unlockedBy__42511991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-42511991L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customCrafting(Lnet/minecraft/data/recipes/RecipeCategory;Lnet/minecraft/data/recipes/CustomCraftingRecipeBuilder$Factory;)Lnet/minecraft/data/recipes/CustomCraftingRecipeBuilder;", cancellable = true)
    private static void customCrafting__1872103962(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1872103962L))
            info.setReturnValue(null);
    }


}

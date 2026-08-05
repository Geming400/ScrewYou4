package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.recipes.SimpleCookingRecipeBuilder.class)
public class SimpleCookingRecipeBuilder715361869Mixin {
        @Inject(at = @At("HEAD"), method = "group(Ljava/lang/String;)Lnet/minecraft/data/recipes/RecipeBuilder;", cancellable = true)
    private void group__1991303841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1991303841L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "group(Ljava/lang/String;)Lnet/minecraft/data/recipes/SimpleCookingRecipeBuilder;", cancellable = true)
    private void group__1520203845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1520203845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/data/recipes/RecipeOutput;Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void save_246303511(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(246303511L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generic(Lnet/minecraft/world/item/crafting/Ingredient;Lnet/minecraft/data/recipes/RecipeCategory;Lnet/minecraft/world/item/crafting/CookingBookCategory;Lnet/minecraft/world/level/ItemLike;FILnet/minecraft/world/item/crafting/AbstractCookingRecipe$Factory;)Lnet/minecraft/data/recipes/SimpleCookingRecipeBuilder;", cancellable = true)
    private static void generic__2137385850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2137385850L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultId()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void defaultId_1523853182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1523853182L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blasting(Lnet/minecraft/world/item/crafting/Ingredient;Lnet/minecraft/data/recipes/RecipeCategory;Lnet/minecraft/world/item/crafting/CookingBookCategory;Lnet/minecraft/world/level/ItemLike;FI)Lnet/minecraft/data/recipes/SimpleCookingRecipeBuilder;", cancellable = true)
    private static void blasting__960076679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-960076679L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "smoking(Lnet/minecraft/world/item/crafting/Ingredient;Lnet/minecraft/data/recipes/RecipeCategory;Lnet/minecraft/world/level/ItemLike;FI)Lnet/minecraft/data/recipes/SimpleCookingRecipeBuilder;", cancellable = true)
    private static void smoking__1541123575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1541123575L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "smelting(Lnet/minecraft/world/item/crafting/Ingredient;Lnet/minecraft/data/recipes/RecipeCategory;Lnet/minecraft/world/item/crafting/CookingBookCategory;Lnet/minecraft/world/level/ItemLike;FI)Lnet/minecraft/data/recipes/SimpleCookingRecipeBuilder;", cancellable = true)
    private static void smelting__960076679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-960076679L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlockedBy(Ljava/lang/String;Lnet/minecraft/advancements/triggers/Criterion;)Lnet/minecraft/data/recipes/RecipeBuilder;", cancellable = true)
    private void unlockedBy__1523972239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1523972239L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlockedBy(Ljava/lang/String;Lnet/minecraft/advancements/triggers/Criterion;)Lnet/minecraft/data/recipes/SimpleCookingRecipeBuilder;", cancellable = true)
    private void unlockedBy__1213396247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1213396247L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "campfireCooking(Lnet/minecraft/world/item/crafting/Ingredient;Lnet/minecraft/data/recipes/RecipeCategory;Lnet/minecraft/world/level/ItemLike;FI)Lnet/minecraft/data/recipes/SimpleCookingRecipeBuilder;", cancellable = true)
    private static void campfireCooking__1541123575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1541123575L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.recipes.SimpleCookingRecipeBuilder.class)
public class SimpleCookingRecipeBuilder715361869Mixin {
        @Inject(at = @At("HEAD"), method = "group(Ljava/lang/String;)Lnet/minecraft/data/recipes/RecipeBuilder;", cancellable = true)
    private void group_511482846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511482846L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "group(Ljava/lang/String;)Lnet/minecraft/data/recipes/SimpleCookingRecipeBuilder;", cancellable = true)
    private void group__677785700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-677785700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/data/recipes/RecipeOutput;Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void save_1177550458(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1177550458L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generic(Lnet/minecraft/world/item/crafting/Ingredient;Lnet/minecraft/data/recipes/RecipeCategory;Lnet/minecraft/world/item/crafting/CookingBookCategory;Lnet/minecraft/world/level/ItemLike;FILnet/minecraft/world/item/crafting/AbstractCookingRecipe$Factory;)Lnet/minecraft/data/recipes/SimpleCookingRecipeBuilder;", cancellable = true)
    private static void generic__133956963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-133956963L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultId()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void defaultId__1305565246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1305565246L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blasting(Lnet/minecraft/world/item/crafting/Ingredient;Lnet/minecraft/data/recipes/RecipeCategory;Lnet/minecraft/world/item/crafting/CookingBookCategory;Lnet/minecraft/world/level/ItemLike;FI)Lnet/minecraft/data/recipes/SimpleCookingRecipeBuilder;", cancellable = true)
    private static void blasting_545934031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(545934031L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "smelting(Lnet/minecraft/world/item/crafting/Ingredient;Lnet/minecraft/data/recipes/RecipeCategory;Lnet/minecraft/world/item/crafting/CookingBookCategory;Lnet/minecraft/world/level/ItemLike;FI)Lnet/minecraft/data/recipes/SimpleCookingRecipeBuilder;", cancellable = true)
    private static void smelting__1170272918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1170272918L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "smoking(Lnet/minecraft/world/item/crafting/Ingredient;Lnet/minecraft/data/recipes/RecipeCategory;Lnet/minecraft/world/level/ItemLike;FI)Lnet/minecraft/data/recipes/SimpleCookingRecipeBuilder;", cancellable = true)
    private static void smoking_1173076341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1173076341L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "campfireCooking(Lnet/minecraft/world/item/crafting/Ingredient;Lnet/minecraft/data/recipes/RecipeCategory;Lnet/minecraft/world/level/ItemLike;FI)Lnet/minecraft/data/recipes/SimpleCookingRecipeBuilder;", cancellable = true)
    private static void campfireCooking__1423915092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1423915092L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlockedBy(Ljava/lang/String;Lnet/minecraft/advancements/triggers/Criterion;)Lnet/minecraft/data/recipes/RecipeBuilder;", cancellable = true)
    private void unlockedBy__957845097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-957845097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlockedBy(Ljava/lang/String;Lnet/minecraft/advancements/triggers/Criterion;)Lnet/minecraft/data/recipes/SimpleCookingRecipeBuilder;", cancellable = true)
    private void unlockedBy_924241539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(924241539L))
            info.setReturnValue(null);
    }


}

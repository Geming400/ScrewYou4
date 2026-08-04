package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.recipes.TransmuteRecipeBuilder.class)
public class TransmuteRecipeBuilder_902776972Mixin {
        @Inject(at = @At("HEAD"), method = "group(Ljava/lang/String;)Lnet/minecraft/data/recipes/TransmuteRecipeBuilder;", cancellable = true)
    private void group__2077278158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2077278158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "group(Ljava/lang/String;)Lnet/minecraft/data/recipes/RecipeBuilder;", cancellable = true)
    private void group__1803888739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1803888739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/data/recipes/RecipeOutput;Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void save_433718613(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(433718613L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "transmute(Lnet/minecraft/data/recipes/RecipeCategory;Lnet/minecraft/world/item/crafting/Ingredient;Lnet/minecraft/world/item/crafting/Ingredient;Lnet/minecraft/world/item/ItemStackTemplate;)Lnet/minecraft/data/recipes/TransmuteRecipeBuilder;", cancellable = true)
    private static void transmute__1973620461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1973620461L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transmute(Lnet/minecraft/data/recipes/RecipeCategory;Lnet/minecraft/world/item/crafting/Ingredient;Lnet/minecraft/world/item/crafting/Ingredient;Lnet/minecraft/world/item/Item;)Lnet/minecraft/data/recipes/TransmuteRecipeBuilder;", cancellable = true)
    private static void transmute__459845295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-459845295L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultId()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void defaultId_1711268284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1711268284L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addMaterialCountToOutput()Lnet/minecraft/data/recipes/TransmuteRecipeBuilder;", cancellable = true)
    private void addMaterialCountToOutput_1610054312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1610054312L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMaterialCount(Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;)Lnet/minecraft/data/recipes/TransmuteRecipeBuilder;", cancellable = true)
    private void setMaterialCount__665556983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-665556983L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlockedBy(Ljava/lang/String;Lnet/minecraft/advancements/triggers/Criterion;)Lnet/minecraft/data/recipes/RecipeBuilder;", cancellable = true)
    private void unlockedBy__1336557137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1336557137L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlockedBy(Ljava/lang/String;Lnet/minecraft/advancements/triggers/Criterion;)Lnet/minecraft/data/recipes/TransmuteRecipeBuilder;", cancellable = true)
    private void unlockedBy_1814399584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1814399584L))
            info.setReturnValue(null);
    }


}

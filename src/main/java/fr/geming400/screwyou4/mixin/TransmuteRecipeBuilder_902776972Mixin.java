package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.recipes.TransmuteRecipeBuilder.class)
public class TransmuteRecipeBuilder_902776972Mixin {
        @Inject(at = @At("HEAD"), method = "group(Ljava/lang/String;)Lnet/minecraft/data/recipes/TransmuteRecipeBuilder;", cancellable = true)
    private void group__943808365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-943808365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "group(Ljava/lang/String;)Lnet/minecraft/data/recipes/RecipeBuilder;", cancellable = true)
    private void group_698897948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(698897948L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/data/recipes/RecipeOutput;Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void save_1364965560(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1364965560L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "defaultId()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void defaultId__1118150144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1118150144L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMaterialCount(Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;)Lnet/minecraft/data/recipes/TransmuteRecipeBuilder;", cancellable = true)
    private void setMaterialCount_2040648431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2040648431L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addMaterialCountToOutput()Lnet/minecraft/data/recipes/TransmuteRecipeBuilder;", cancellable = true)
    private void addMaterialCountToOutput__1890604603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1890604603L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlockedBy(Ljava/lang/String;Lnet/minecraft/advancements/triggers/Criterion;)Lnet/minecraft/data/recipes/RecipeBuilder;", cancellable = true)
    private void unlockedBy__770429995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-770429995L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlockedBy(Ljava/lang/String;Lnet/minecraft/advancements/triggers/Criterion;)Lnet/minecraft/data/recipes/TransmuteRecipeBuilder;", cancellable = true)
    private void unlockedBy_199568122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(199568122L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transmute(Lnet/minecraft/data/recipes/RecipeCategory;Lnet/minecraft/world/item/crafting/Ingredient;Lnet/minecraft/world/item/crafting/Ingredient;Lnet/minecraft/world/item/Item;)Lnet/minecraft/data/recipes/TransmuteRecipeBuilder;", cancellable = true)
    private static void transmute__1970430928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1970430928L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transmute(Lnet/minecraft/data/recipes/RecipeCategory;Lnet/minecraft/world/item/crafting/Ingredient;Lnet/minecraft/world/item/crafting/Ingredient;Lnet/minecraft/world/item/ItemStackTemplate;)Lnet/minecraft/data/recipes/TransmuteRecipeBuilder;", cancellable = true)
    private static void transmute__1600026476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1600026476L))
            info.setReturnValue(null);
    }


}

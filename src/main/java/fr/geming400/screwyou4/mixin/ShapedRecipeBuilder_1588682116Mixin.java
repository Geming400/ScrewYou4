package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.recipes.ShapedRecipeBuilder.class)
public class ShapedRecipeBuilder_1588682116Mixin {
        @Inject(at = @At("HEAD"), method = "group(Ljava/lang/String;)Lnet/minecraft/data/recipes/ShapedRecipeBuilder;", cancellable = true)
    private void group__1635146920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1635146920L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "group(Ljava/lang/String;)Lnet/minecraft/data/recipes/RecipeBuilder;", cancellable = true)
    private void group__1117983595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1117983595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pattern(Ljava/lang/String;)Lnet/minecraft/data/recipes/ShapedRecipeBuilder;", cancellable = true)
    private void pattern__1635146920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1635146920L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/data/recipes/RecipeOutput;Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void save_1119623757(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1119623757L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "defaultId()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void defaultId__1897793868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1897793868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "define(Ljava/lang/Character;Lnet/minecraft/world/level/ItemLike;)Lnet/minecraft/data/recipes/ShapedRecipeBuilder;", cancellable = true)
    private void define_554253815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(554253815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "define(Ljava/lang/Character;Lnet/minecraft/world/item/crafting/Ingredient;)Lnet/minecraft/data/recipes/ShapedRecipeBuilder;", cancellable = true)
    private void define_248668548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(248668548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "define(Ljava/lang/Character;Lnet/minecraft/tags/TagKey;)Lnet/minecraft/data/recipes/ShapedRecipeBuilder;", cancellable = true)
    private void define_269936404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(269936404L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shaped(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/data/recipes/RecipeCategory;Lnet/minecraft/world/level/ItemLike;I)Lnet/minecraft/data/recipes/ShapedRecipeBuilder;", cancellable = true)
    private static void shaped_1776328214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1776328214L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shaped(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/data/recipes/RecipeCategory;Lnet/minecraft/world/level/ItemLike;)Lnet/minecraft/data/recipes/ShapedRecipeBuilder;", cancellable = true)
    private static void shaped__648591131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-648591131L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlockedBy(Ljava/lang/String;Lnet/minecraft/advancements/triggers/Criterion;)Lnet/minecraft/data/recipes/RecipeBuilder;", cancellable = true)
    private void unlockedBy__650651993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-650651993L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlockedBy(Ljava/lang/String;Lnet/minecraft/advancements/triggers/Criterion;)Lnet/minecraft/data/recipes/ShapedRecipeBuilder;", cancellable = true)
    private void unlockedBy_423442410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(423442410L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "showNotification(Z)Lnet/minecraft/data/recipes/ShapedRecipeBuilder;", cancellable = true)
    private void showNotification_1220300632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1220300632L))
            info.setReturnValue(null);
    }


}

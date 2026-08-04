package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.recipes.ShapelessRecipeBuilder.class)
public class ShapelessRecipeBuilder1159667291Mixin {
        @Inject(at = @At("HEAD"), method = "group(Ljava/lang/String;)Lnet/minecraft/data/recipes/ShapelessRecipeBuilder;", cancellable = true)
    private void group_1985842171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1985842171L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "group(Ljava/lang/String;)Lnet/minecraft/data/recipes/RecipeBuilder;", cancellable = true)
    private void group__1546998419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1546998419L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/data/recipes/RecipeOutput;Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void save_690608933(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(690608933L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "requires(Lnet/minecraft/world/item/crafting/Ingredient;)Lnet/minecraft/data/recipes/ShapelessRecipeBuilder;", cancellable = true)
    private void requires_585839917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(585839917L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requires(Lnet/minecraft/world/level/ItemLike;I)Lnet/minecraft/data/recipes/ShapelessRecipeBuilder;", cancellable = true)
    private void requires_909630689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(909630689L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requires(Lnet/minecraft/world/item/crafting/Ingredient;I)Lnet/minecraft/data/recipes/ShapelessRecipeBuilder;", cancellable = true)
    private void requires_510271342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(510271342L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requires(Lnet/minecraft/world/level/ItemLike;)Lnet/minecraft/data/recipes/ShapelessRecipeBuilder;", cancellable = true)
    private void requires_2122743130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2122743130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requires(Lnet/minecraft/tags/TagKey;)Lnet/minecraft/data/recipes/ShapelessRecipeBuilder;", cancellable = true)
    private void requires__1612031839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1612031839L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultId()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void defaultId_1968158604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1968158604L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shapeless(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/data/recipes/RecipeCategory;Lnet/minecraft/world/item/ItemStackTemplate;)Lnet/minecraft/data/recipes/ShapelessRecipeBuilder;", cancellable = true)
    private static void shapeless__1753819040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1753819040L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shapeless(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/data/recipes/RecipeCategory;Lnet/minecraft/world/level/ItemLike;)Lnet/minecraft/data/recipes/ShapelessRecipeBuilder;", cancellable = true)
    private static void shapeless_2000757822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2000757822L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shapeless(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/data/recipes/RecipeCategory;Lnet/minecraft/world/level/ItemLike;I)Lnet/minecraft/data/recipes/ShapelessRecipeBuilder;", cancellable = true)
    private static void shapeless_1423045997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1423045997L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlockedBy(Ljava/lang/String;Lnet/minecraft/advancements/triggers/Criterion;)Lnet/minecraft/data/recipes/ShapelessRecipeBuilder;", cancellable = true)
    private void unlockedBy_1582552617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1582552617L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlockedBy(Ljava/lang/String;Lnet/minecraft/advancements/triggers/Criterion;)Lnet/minecraft/data/recipes/RecipeBuilder;", cancellable = true)
    private void unlockedBy__1079666817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1079666817L))
            info.setReturnValue(null);
    }


}

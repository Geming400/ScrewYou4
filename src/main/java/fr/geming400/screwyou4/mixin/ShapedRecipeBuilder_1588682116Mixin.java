package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.recipes.ShapedRecipeBuilder.class)
public class ShapedRecipeBuilder_1588682116Mixin {
        @Inject(at = @At("HEAD"), method = "group(Ljava/lang/String;)Lnet/minecraft/data/recipes/ShapedRecipeBuilder;", cancellable = true)
    private void group_1834485399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1834485399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "group(Ljava/lang/String;)Lnet/minecraft/data/recipes/RecipeBuilder;", cancellable = true)
    private void group_1384803092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1384803092L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pattern(Ljava/lang/String;)Lnet/minecraft/data/recipes/ShapedRecipeBuilder;", cancellable = true)
    private void pattern__1820122392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820122392L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/data/recipes/RecipeOutput;Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void save_2050870704(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2050870704L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "define(Ljava/lang/Character;Lnet/minecraft/world/level/ItemLike;)Lnet/minecraft/data/recipes/ShapedRecipeBuilder;", cancellable = true)
    private void define_1019400220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1019400220L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "define(Ljava/lang/Character;Lnet/minecraft/tags/TagKey;)Lnet/minecraft/data/recipes/ShapedRecipeBuilder;", cancellable = true)
    private void define__1858443441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1858443441L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "define(Ljava/lang/Character;Lnet/minecraft/world/item/crafting/Ingredient;)Lnet/minecraft/data/recipes/ShapedRecipeBuilder;", cancellable = true)
    private void define__1974777495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1974777495L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultId()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void defaultId__432245000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-432245000L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlockedBy(Ljava/lang/String;Lnet/minecraft/advancements/triggers/Criterion;)Lnet/minecraft/data/recipes/RecipeBuilder;", cancellable = true)
    private void unlockedBy__84524851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-84524851L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlockedBy(Ljava/lang/String;Lnet/minecraft/advancements/triggers/Criterion;)Lnet/minecraft/data/recipes/ShapedRecipeBuilder;", cancellable = true)
    private void unlockedBy__1557074544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1557074544L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shaped(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/data/recipes/RecipeCategory;Lnet/minecraft/world/level/ItemLike;)Lnet/minecraft/data/recipes/ShapedRecipeBuilder;", cancellable = true)
    private static void shaped_1135691848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1135691848L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shaped(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/data/recipes/RecipeCategory;Lnet/minecraft/world/level/ItemLike;I)Lnet/minecraft/data/recipes/ShapedRecipeBuilder;", cancellable = true)
    private static void shaped_1254525715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1254525715L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "showNotification(Z)Lnet/minecraft/data/recipes/ShapedRecipeBuilder;", cancellable = true)
    private void showNotification__781979696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-781979696L))
            info.setReturnValue(null);
    }


}

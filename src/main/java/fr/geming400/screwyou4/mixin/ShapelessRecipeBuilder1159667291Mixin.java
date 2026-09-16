package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.recipes.ShapelessRecipeBuilder.class)
public class ShapelessRecipeBuilder1159667291Mixin {
        @Inject(at = @At("HEAD"), method = "group(Ljava/lang/String;)Lnet/minecraft/data/recipes/ShapelessRecipeBuilder;", cancellable = true)
    private void group__1175655332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1175655332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "group(Ljava/lang/String;)Lnet/minecraft/data/recipes/RecipeBuilder;", cancellable = true)
    private void group_955788268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(955788268L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/data/recipes/RecipeOutput;Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void save_1621855880(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1621855880L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "requires(Lnet/minecraft/world/item/crafting/Ingredient;)Lnet/minecraft/data/recipes/ShapelessRecipeBuilder;", cancellable = true)
    private void requires__115487169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-115487169L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requires(Lnet/minecraft/world/level/ItemLike;I)Lnet/minecraft/data/recipes/ShapelessRecipeBuilder;", cancellable = true)
    private void requires_1716217743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1716217743L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requires(Lnet/minecraft/world/item/crafting/Ingredient;I)Lnet/minecraft/data/recipes/ShapelessRecipeBuilder;", cancellable = true)
    private void requires_243968156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(243968156L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requires(Lnet/minecraft/world/level/ItemLike;)Lnet/minecraft/data/recipes/ShapelessRecipeBuilder;", cancellable = true)
    private void requires__1314921236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1314921236L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requires(Lnet/minecraft/tags/TagKey;)Lnet/minecraft/data/recipes/ShapelessRecipeBuilder;", cancellable = true)
    private void requires__2114140977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2114140977L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultId()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void defaultId__861259824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-861259824L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shapeless(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/data/recipes/RecipeCategory;Lnet/minecraft/world/item/ItemStackTemplate;)Lnet/minecraft/data/recipes/ShapelessRecipeBuilder;", cancellable = true)
    private static void shapeless_1700650086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1700650086L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shapeless(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/data/recipes/RecipeCategory;Lnet/minecraft/world/level/ItemLike;)Lnet/minecraft/data/recipes/ShapelessRecipeBuilder;", cancellable = true)
    private static void shapeless_731352644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(731352644L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shapeless(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/data/recipes/RecipeCategory;Lnet/minecraft/world/level/ItemLike;I)Lnet/minecraft/data/recipes/ShapelessRecipeBuilder;", cancellable = true)
    private static void shapeless_726191143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(726191143L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlockedBy(Ljava/lang/String;Lnet/minecraft/advancements/triggers/Criterion;)Lnet/minecraft/data/recipes/ShapelessRecipeBuilder;", cancellable = true)
    private void unlockedBy__32278845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-32278845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlockedBy(Ljava/lang/String;Lnet/minecraft/advancements/triggers/Criterion;)Lnet/minecraft/data/recipes/RecipeBuilder;", cancellable = true)
    private void unlockedBy__513539675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-513539675L))
            info.setReturnValue(null);
    }


}

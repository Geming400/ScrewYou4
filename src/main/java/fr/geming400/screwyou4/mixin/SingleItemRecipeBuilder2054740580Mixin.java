package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.recipes.SingleItemRecipeBuilder.class)
public class SingleItemRecipeBuilder2054740580Mixin {
        @Inject(at = @At("HEAD"), method = "group(Ljava/lang/String;)Lnet/minecraft/data/recipes/SingleItemRecipeBuilder;", cancellable = true)
    private void group_1846510480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1846510480L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "group(Ljava/lang/String;)Lnet/minecraft/data/recipes/RecipeBuilder;", cancellable = true)
    private void group_1850861557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1850861557L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/data/recipes/RecipeOutput;Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void save__1778038127(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1778038127L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stonecutting(Lnet/minecraft/world/item/crafting/Ingredient;Lnet/minecraft/data/recipes/RecipeCategory;Lnet/minecraft/world/level/ItemLike;I)Lnet/minecraft/data/recipes/SingleItemRecipeBuilder;", cancellable = true)
    private static void stonecutting__2143428286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2143428286L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlockedBy(Ljava/lang/String;Lnet/minecraft/advancements/triggers/Criterion;)Lnet/minecraft/data/recipes/RecipeBuilder;", cancellable = true)
    private void unlockedBy_381533614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(381533614L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlockedBy(Ljava/lang/String;Lnet/minecraft/advancements/triggers/Criterion;)Lnet/minecraft/data/recipes/SingleItemRecipeBuilder;", cancellable = true)
    private void unlockedBy__1363524087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1363524087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultId()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void defaultId_33813465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(33813465L))
            info.setReturnValue(null);
    }


}

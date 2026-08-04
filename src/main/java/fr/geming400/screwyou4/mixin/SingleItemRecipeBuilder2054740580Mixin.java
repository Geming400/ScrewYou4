package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.recipes.SingleItemRecipeBuilder.class)
public class SingleItemRecipeBuilder2054740580Mixin {
        @Inject(at = @At("HEAD"), method = "group(Ljava/lang/String;)Lnet/minecraft/data/recipes/SingleItemRecipeBuilder;", cancellable = true)
    private void group_1068685265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1068685265L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "group(Ljava/lang/String;)Lnet/minecraft/data/recipes/RecipeBuilder;", cancellable = true)
    private void group__651925130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-651925130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/data/recipes/RecipeOutput;Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void save_1585682222(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1585682222L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "defaultId()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void defaultId__1431735403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1431735403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlockedBy(Ljava/lang/String;Lnet/minecraft/advancements/triggers/Criterion;)Lnet/minecraft/data/recipes/RecipeBuilder;", cancellable = true)
    private void unlockedBy__184593528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-184593528L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlockedBy(Ljava/lang/String;Lnet/minecraft/advancements/triggers/Criterion;)Lnet/minecraft/data/recipes/SingleItemRecipeBuilder;", cancellable = true)
    private void unlockedBy_1451610979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1451610979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stonecutting(Lnet/minecraft/world/item/crafting/Ingredient;Lnet/minecraft/data/recipes/RecipeCategory;Lnet/minecraft/world/level/ItemLike;I)Lnet/minecraft/data/recipes/SingleItemRecipeBuilder;", cancellable = true)
    private static void stonecutting__393765033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-393765033L))
            info.setReturnValue(null);
    }


}

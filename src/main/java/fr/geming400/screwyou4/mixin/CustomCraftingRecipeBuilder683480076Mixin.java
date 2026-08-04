package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.recipes.CustomCraftingRecipeBuilder.class)
public class CustomCraftingRecipeBuilder683480076Mixin {
        @Inject(at = @At("HEAD"), method = "group(Ljava/lang/String;)Lnet/minecraft/data/recipes/CustomCraftingRecipeBuilder;", cancellable = true)
    private void group_1489092433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1489092433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/data/recipes/RecipeOutput;Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void save_214421718(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(214421718L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/data/recipes/RecipeOutput;Ljava/lang/String;)V", cancellable = true)
    private void save_1292529686(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1292529686L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unlockedBy(Ljava/lang/String;Lnet/minecraft/advancements/triggers/Criterion;)Lnet/minecraft/data/recipes/CustomCraftingRecipeBuilder;", cancellable = true)
    private void unlockedBy__1884773917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1884773917L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customCrafting(Lnet/minecraft/data/recipes/RecipeCategory;Lnet/minecraft/data/recipes/CustomCraftingRecipeBuilder$Factory;)Lnet/minecraft/data/recipes/CustomCraftingRecipeBuilder;", cancellable = true)
    private static void customCrafting_1696865689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1696865689L))
            info.setReturnValue(null);
    }


}

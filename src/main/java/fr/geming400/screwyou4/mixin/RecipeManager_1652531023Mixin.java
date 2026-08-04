package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.RecipeManager.class)
public class RecipeManager_1652531023Mixin {
        @Inject(at = @At("HEAD"), method = "byKey(Lnet/minecraft/resources/ResourceKey;)Ljava/util/Optional;", cancellable = true)
    private void byKey__667187720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-667187720L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "propertySet(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/item/crafting/RecipePropertySet;", cancellable = true)
    private void propertySet_839096441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(839096441L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stonecutterRecipes()Lnet/minecraft/world/item/crafting/SelectableRecipe$SingleInputSet;", cancellable = true)
    private void stonecutterRecipes_1112369044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1112369044L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRecipes()Ljava/util/Collection;", cancellable = true)
    private void getRecipes__161117250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-161117250L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRecipeFromDisplay(Lnet/minecraft/world/item/crafting/display/RecipeDisplayId;)Lnet/minecraft/world/item/crafting/RecipeManager$ServerDisplayInfo;", cancellable = true)
    private void getRecipeFromDisplay__1228910045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1228910045L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSynchronizedStonecutterRecipes()Lnet/minecraft/world/item/crafting/SelectableRecipe$SingleInputSet;", cancellable = true)
    private void getSynchronizedStonecutterRecipes_1112369044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1112369044L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSynchronizedItemProperties()Ljava/util/Map;", cancellable = true)
    private void getSynchronizedItemProperties__352092618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-352092618L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCheck(Lnet/minecraft/world/item/crafting/RecipeType;)Lnet/minecraft/world/item/crafting/RecipeManager$CachedCheck;", cancellable = true)
    private static void createCheck__2088940784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2088940784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listDisplaysForRecipe(Lnet/minecraft/resources/ResourceKey;Ljava/util/function/Consumer;)V", cancellable = true)
    private void listDisplaysForRecipe__1949268569(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1949268569L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finalizeRecipeLoading(Lnet/minecraft/world/flag/FeatureFlagSet;)V", cancellable = true)
    private void finalizeRecipeLoading_222757798(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(222757798L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRecipeFor(Lnet/minecraft/world/item/crafting/RecipeType;Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Ljava/util/Optional;", cancellable = true)
    private void getRecipeFor_1239603749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1239603749L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRecipeFor(Lnet/minecraft/world/item/crafting/RecipeType;Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/crafting/RecipeHolder;)Ljava/util/Optional;", cancellable = true)
    private void getRecipeFor__1541461134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1541461134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRecipeFor(Lnet/minecraft/world/item/crafting/RecipeType;Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;Lnet/minecraft/resources/ResourceKey;)Ljava/util/Optional;", cancellable = true)
    private void getRecipeFor__2024902033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2024902033L))
            info.setReturnValue(null);
    }


}

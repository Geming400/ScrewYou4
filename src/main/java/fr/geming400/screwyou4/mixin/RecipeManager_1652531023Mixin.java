package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.RecipeManager.class)
public class RecipeManager_1652531023Mixin {
        @Inject(at = @At("HEAD"), method = "byKey(Lnet/minecraft/resources/ResourceKey;)Ljava/util/Optional;", cancellable = true)
    private void byKey_1836805232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1836805232L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listDisplaysForRecipe(Lnet/minecraft/resources/ResourceKey;Ljava/util/function/Consumer;)V", cancellable = true)
    private void listDisplaysForRecipe__1220230433(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1220230433L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSynchronizedItemProperties()Ljava/util/Map;", cancellable = true)
    private void getSynchronizedItemProperties_576592230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(576592230L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSynchronizedStonecutterRecipes()Lnet/minecraft/world/item/crafting/SelectableRecipe$SingleInputSet;", cancellable = true)
    private void getSynchronizedStonecutterRecipes__836213943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-836213943L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stonecutterRecipes()Lnet/minecraft/world/item/crafting/SelectableRecipe$SingleInputSet;", cancellable = true)
    private void stonecutterRecipes__1541203021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1541203021L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "propertySet(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/item/crafting/RecipePropertySet;", cancellable = true)
    private void propertySet__1118403066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1118403066L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCheck(Lnet/minecraft/world/item/crafting/RecipeType;)Lnet/minecraft/world/item/crafting/RecipeManager$CachedCheck;", cancellable = true)
    private static void createCheck__86883292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-86883292L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRecipeFor(Lnet/minecraft/world/item/crafting/RecipeType;Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/crafting/RecipeHolder;)Ljava/util/Optional;", cancellable = true)
    private void getRecipeFor_33636695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(33636695L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRecipeFor(Lnet/minecraft/world/item/crafting/RecipeType;Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;Lnet/minecraft/resources/ResourceKey;)Ljava/util/Optional;", cancellable = true)
    private void getRecipeFor_1547639210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1547639210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRecipeFor(Lnet/minecraft/world/item/crafting/RecipeType;Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Ljava/util/Optional;", cancellable = true)
    private void getRecipeFor__2101334518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2101334518L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "finalizeRecipeLoading(Lnet/minecraft/world/flag/FeatureFlagSet;)V", cancellable = true)
    private void finalizeRecipeLoading_1352651766(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1352651766L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRecipes()Ljava/util/Collection;", cancellable = true)
    private void getRecipes_1032808301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1032808301L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRecipeFromDisplay(Lnet/minecraft/world/item/crafting/display/RecipeDisplayId;)Lnet/minecraft/world/item/crafting/RecipeManager$ServerDisplayInfo;", cancellable = true)
    private void getRecipeFromDisplay__1643726921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1643726921L))
            info.setReturnValue(null);
    }


}

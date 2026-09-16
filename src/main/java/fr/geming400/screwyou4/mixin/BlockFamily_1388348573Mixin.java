package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.BlockFamily.class)
public class BlockFamily_1388348573Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/data/BlockFamily$Variant;)Lnet/minecraft/world/level/block/Block;", cancellable = true)
    private void get__1455349527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1455349527L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRecipeGroupPrefix()Ljava/util/Optional;", cancellable = true)
    private void getRecipeGroupPrefix_28413463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(28413463L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRecipeUnlockedBy()Ljava/util/Optional;", cancellable = true)
    private void getRecipeUnlockedBy_1591091848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1591091848L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldGenerateSmeltingRecipe()Z", cancellable = true)
    private void shouldGenerateSmeltingRecipe_645343662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(645343662L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "shouldGenerateCraftingRecipe()Z", cancellable = true)
    private void shouldGenerateCraftingRecipe__1768436485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1768436485L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldGenerateStonecutterRecipe()Z", cancellable = true)
    private void shouldGenerateStonecutterRecipe_1334074889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1334074889L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldGenerateModel()Z", cancellable = true)
    private void shouldGenerateModel__1471185102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1471185102L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getVariants()Ljava/util/Map;", cancellable = true)
    private void getVariants_1744289536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1744289536L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBaseBlock()Lnet/minecraft/world/level/block/Block;", cancellable = true)
    private void getBaseBlock_27410571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(27410571L))
            info.setReturnValue(null);
    }


}

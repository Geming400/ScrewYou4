package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.BlockFamily.class)
public class BlockFamily_1388348573Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/data/BlockFamily$Variant;)Lnet/minecraft/world/level/block/Block;", cancellable = true)
    private void get_1969314815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1969314815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldGenerateModel()Z", cancellable = true)
    private void shouldGenerateModel_1426627155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1426627155L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getVariants()Ljava/util/Map;", cancellable = true)
    private void getVariants__616275068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-616275068L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBaseBlock()Lnet/minecraft/world/level/block/Block;", cancellable = true)
    private void getBaseBlock_631083473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(631083473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRecipeGroupPrefix()Ljava/util/Optional;", cancellable = true)
    private void getRecipeGroupPrefix_1633809994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1633809994L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRecipeUnlockedBy()Ljava/util/Optional;", cancellable = true)
    private void getRecipeUnlockedBy_1633809994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1633809994L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldGenerateSmeltingRecipe()Z", cancellable = true)
    private void shouldGenerateSmeltingRecipe_1426627155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1426627155L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "shouldGenerateStonecutterRecipe()Z", cancellable = true)
    private void shouldGenerateStonecutterRecipe_1426627155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1426627155L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "shouldGenerateCraftingRecipe()Z", cancellable = true)
    private void shouldGenerateCraftingRecipe_1426627155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1426627155L))
            info.setReturnValue(true);
    }


}

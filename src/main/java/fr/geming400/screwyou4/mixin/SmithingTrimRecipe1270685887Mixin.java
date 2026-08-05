package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.SmithingTrimRecipe.class)
public class SmithingTrimRecipe1270685887Mixin {
        @Inject(at = @At("HEAD"), method = "display()Ljava/util/List;", cancellable = true)
    private void display__1397944593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1397944593L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "additionIngredient()Ljava/util/Optional;", cancellable = true)
    private void additionIngredient_1516147309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1516147309L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "baseIngredient()Lnet/minecraft/world/item/crafting/Ingredient;", cancellable = true)
    private void baseIngredient_773246714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(773246714L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "templateIngredient()Ljava/util/Optional;", cancellable = true)
    private void templateIngredient_1516147309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1516147309L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_714253931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(714253931L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_1374448998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1374448998L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/SmithingRecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble__1393047513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1393047513L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyTrim(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/Holder;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void applyTrim_1669633014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1669633014L))
            info.setReturnValue(null);
    }


}

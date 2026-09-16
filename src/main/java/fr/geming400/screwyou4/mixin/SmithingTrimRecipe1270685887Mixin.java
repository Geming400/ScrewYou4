package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.SmithingTrimRecipe.class)
public class SmithingTrimRecipe1270685887Mixin {
        @Inject(at = @At("HEAD"), method = "display()Ljava/util/List;", cancellable = true)
    private void display__1363135823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1363135823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "templateIngredient()Ljava/util/Optional;", cancellable = true)
    private void templateIngredient_274172760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(274172760L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "additionIngredient()Ljava/util/Optional;", cancellable = true)
    private void additionIngredient_1750489434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1750489434L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "baseIngredient()Lnet/minecraft/world/item/crafting/Ingredient;", cancellable = true)
    private void baseIngredient__1333924356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1333924356L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/SmithingRecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_311418901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(311418901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble__1516612780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1516612780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyTrim(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/Holder;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void applyTrim__1093746362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1093746362L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_1835572211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1835572211L))
            info.setReturnValue(null);
    }


}

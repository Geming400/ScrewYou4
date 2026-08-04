package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.BookCloningRecipe.class)
public class BookCloningRecipe_338456943Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__1886932393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1886932393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches_2006640483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2006640483L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer__217975014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-217975014L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_1373040673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1373040673L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_442220053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(442220053L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRemainingItems(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/core/NonNullList;", cancellable = true)
    private void getRemainingItems__1584229963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1584229963L))
            info.setReturnValue(null);
    }


}

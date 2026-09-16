package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.BookCloningRecipe.class)
public class BookCloningRecipe_338456943Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__1745809660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1745809660L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches_186633424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(186633424L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_903343266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(903343266L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_1906512527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1906512527L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_1846125571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1846125571L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRemainingItems(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/core/NonNullList;", cancellable = true)
    private void getRemainingItems__626971307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-626971307L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.FireworkStarFadeRecipe.class)
public class FireworkStarFadeRecipe_1199125805Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__1026263531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1026263531L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__1427657951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1427657951L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble__2061257761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2061257761L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_1302888915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1302888915L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_642693848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(642693848L))
            info.setReturnValue(null);
    }


}

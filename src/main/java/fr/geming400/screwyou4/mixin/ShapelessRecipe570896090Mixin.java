package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.ShapelessRecipe.class)
public class ShapelessRecipe570896090Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches_419072572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(419072572L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__1513370512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1513370512L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "display()Ljava/util/List;", cancellable = true)
    private void display__2062925620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2062925620L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_1135782414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1135782414L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_2138951675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2138951675L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_2078564719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2078564719L))
            info.setReturnValue(null);
    }


}

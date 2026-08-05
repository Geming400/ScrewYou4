package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.ShapedRecipe.class)
public class ShapedRecipe_523356895Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__1702032441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1702032441L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__2103426861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2103426861L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "display()Ljava/util/List;", cancellable = true)
    private void display__2145273586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2145273586L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIngredients()Ljava/util/List;", cancellable = true)
    private void getIngredients__2145273586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2145273586L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight_561619140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(561619140L))
            info.setReturnValue(-161154726);
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth_561619140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(561619140L))
            info.setReturnValue(-161154726);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_1557940625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1557940625L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_627120005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(627120005L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer__33075062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-33075062L))
            info.setReturnValue(null);
    }


}

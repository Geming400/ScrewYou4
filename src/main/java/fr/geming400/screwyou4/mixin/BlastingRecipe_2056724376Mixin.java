package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.BlastingRecipe.class)
public class BlastingRecipe_2056724376Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/item/crafting/RecipeType;", cancellable = true)
    private void getType_575328859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(575328859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_1500292419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1500292419L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipeBookCategory()Lnet/minecraft/world/item/crafting/RecipeBookCategory;", cancellable = true)
    private void recipeBookCategory_1724856942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1724856942L))
            info.setReturnValue(null);
    }


}

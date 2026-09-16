package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.CampfireCookingRecipe.class)
public class CampfireCookingRecipe_502923325Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/item/crafting/RecipeType;", cancellable = true)
    private void getType_525098672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(525098672L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_1067809648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1067809648L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipeBookCategory()Lnet/minecraft/world/item/crafting/RecipeBookCategory;", cancellable = true)
    private void recipeBookCategory_30361224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(30361224L))
            info.setReturnValue(null);
    }


}

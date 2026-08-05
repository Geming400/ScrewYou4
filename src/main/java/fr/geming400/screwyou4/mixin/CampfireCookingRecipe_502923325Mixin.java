package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.CampfireCookingRecipe.class)
public class CampfireCookingRecipe_502923325Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/item/crafting/RecipeType;", cancellable = true)
    private void getType__978472192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-978472192L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipeBookCategory()Lnet/minecraft/world/item/crafting/RecipeBookCategory;", cancellable = true)
    private void recipeBookCategory_171055891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(171055891L))
            info.setReturnValue(new net.minecraft.world.item.crafting.RecipeBookCategory());
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer__53508632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-53508632L))
            info.setReturnValue(null);
    }


}

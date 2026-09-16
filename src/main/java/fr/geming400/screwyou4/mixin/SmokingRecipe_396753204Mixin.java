package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.SmokingRecipe.class)
public class SmokingRecipe_396753204Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/item/crafting/RecipeType;", cancellable = true)
    private void getType_418928551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(418928551L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_961639527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(961639527L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipeBookCategory()Lnet/minecraft/world/item/crafting/RecipeBookCategory;", cancellable = true)
    private void recipeBookCategory__75808897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-75808897L))
            info.setReturnValue(new net.minecraft.world.item.crafting.RecipeBookCategory());
    }


}

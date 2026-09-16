package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.SmeltingRecipe.class)
public class SmeltingRecipe_606732435Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/item/crafting/RecipeType;", cancellable = true)
    private void getType_628907782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(628907782L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_1171618758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1171618758L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipeBookCategory()Lnet/minecraft/world/item/crafting/RecipeBookCategory;", cancellable = true)
    private void recipeBookCategory_134170334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(134170334L))
            info.setReturnValue(new net.minecraft.world.item.crafting.RecipeBookCategory());
    }


}

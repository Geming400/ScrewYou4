package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.SmeltingRecipe.class)
public class SmeltingRecipe_606732435Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/item/crafting/RecipeType;", cancellable = true)
    private void getType__874663082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-874663082L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipeBookCategory()Lnet/minecraft/world/item/crafting/RecipeBookCategory;", cancellable = true)
    private void recipeBookCategory_274865001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(274865001L))
            info.setReturnValue(new net.minecraft.world.item.crafting.RecipeBookCategory());
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_50300478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(50300478L))
            info.setReturnValue(null);
    }


}

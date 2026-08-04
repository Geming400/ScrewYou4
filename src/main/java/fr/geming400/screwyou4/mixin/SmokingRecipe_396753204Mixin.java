package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.SmokingRecipe.class)
public class SmokingRecipe_396753204Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/item/crafting/RecipeType;", cancellable = true)
    private void getType__1084642313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1084642313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer__159678753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-159678753L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipeBookCategory()Lnet/minecraft/world/item/crafting/RecipeBookCategory;", cancellable = true)
    private void recipeBookCategory_64885770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(64885770L))
            info.setReturnValue(null);
    }


}

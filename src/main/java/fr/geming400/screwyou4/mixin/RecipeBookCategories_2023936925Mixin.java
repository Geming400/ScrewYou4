package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.RecipeBookCategories.class)
public class RecipeBookCategories_2023936925Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lnet/minecraft/world/item/crafting/RecipeBookCategory;", cancellable = true)
    private static void bootstrap__1909883361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1909883361L))
            info.setReturnValue(new net.minecraft.world.item.crafting.RecipeBookCategory());
    }


}

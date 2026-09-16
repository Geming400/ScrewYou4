package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ClientRecipeContainer.class)
public class ClientRecipeContainer_91287622Mixin {
        @Inject(at = @At("HEAD"), method = "stonecutterRecipes()Lnet/minecraft/world/item/crafting/SelectableRecipe$SingleInputSet;", cancellable = true)
    private void stonecutterRecipes_1192520874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1192520874L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "propertySet(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/item/crafting/RecipePropertySet;", cancellable = true)
    private void propertySet_1615320829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1615320829L))
            info.setReturnValue(null);
    }


}

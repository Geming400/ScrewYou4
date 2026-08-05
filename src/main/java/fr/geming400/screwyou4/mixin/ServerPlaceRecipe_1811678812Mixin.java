package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.recipebook.ServerPlaceRecipe.class)
public class ServerPlaceRecipe_1811678812Mixin {
        @Inject(at = @At("HEAD"), method = "placeRecipe(Lnet/minecraft/recipebook/ServerPlaceRecipe$CraftingMenuAccess;IILjava/util/List;Ljava/util/List;Lnet/minecraft/world/entity/player/Inventory;Lnet/minecraft/world/item/crafting/RecipeHolder;ZZ)Lnet/minecraft/world/inventory/RecipeBookMenu$PostPlaceAction;", cancellable = true)
    private static void placeRecipe_1403512395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1403512395L))
            info.setReturnValue(net.minecraft.world.inventory.RecipeBookMenu.PostPlaceAction.NOTHING);
    }


}

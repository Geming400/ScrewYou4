package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.recipebook.RecipeCollection.class)
public class RecipeCollection_913475850Mixin {
        @Inject(at = @At("HEAD"), method = "selectRecipes(Lnet/minecraft/world/entity/player/StackedItemContents;Ljava/util/function/Predicate;)V", cancellable = true)
    private void selectRecipes_759652929(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(759652929L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasCraftable()Z", cancellable = true)
    private void hasCraftable_951754432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(951754432L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasAnySelected()Z", cancellable = true)
    private void hasAnySelected_951754432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(951754432L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isCraftable(Lnet/minecraft/world/item/crafting/display/RecipeDisplayId;)Z", cancellable = true)
    private void isCraftable__1019398601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1019398601L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSelectedRecipes(Lnet/minecraft/client/gui/screens/recipebook/RecipeCollection$CraftableStatus;)Ljava/util/List;", cancellable = true)
    private void getSelectedRecipes__1920732054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1920732054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRecipes()Ljava/util/List;", cancellable = true)
    private void getRecipes__1755154631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1755154631L))
            info.setReturnValue(null);
    }


}

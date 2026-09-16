package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.recipebook.RecipeCollection.class)
public class RecipeCollection_913475850Mixin {
        @Inject(at = @At("HEAD"), method = "isCraftable(Lnet/minecraft/world/item/crafting/display/RecipeDisplayId;)Z", cancellable = true)
    private void isCraftable__401678425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-401678425L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "selectRecipes(Lnet/minecraft/world/entity/player/StackedItemContents;Ljava/util/function/Predicate;)V", cancellable = true)
    private void selectRecipes__732259062(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-732259062L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSelectedRecipes(Lnet/minecraft/client/gui/screens/recipebook/RecipeCollection$CraftableStatus;)Ljava/util/List;", cancellable = true)
    private void getSelectedRecipes_1995521726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1995521726L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasCraftable()Z", cancellable = true)
    private void hasCraftable_88677568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(88677568L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasAnySelected()Z", cancellable = true)
    private void hasAnySelected__1565741773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1565741773L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getRecipes()Ljava/util/List;", cancellable = true)
    private void getRecipes_189432360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(189432360L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.recipebook.RecipeBookTabButton.class)
public class RecipeBookTabButton1590130402Mixin {
        @Inject(at = @At("HEAD"), method = "select()V", cancellable = true)
    private void select_1628405141(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1628405141L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unselect()V", cancellable = true)
    private void unselect_1628405141(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1628405141L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCategory()Lnet/minecraft/world/item/crafting/ExtendedRecipeBookCategory;", cancellable = true)
    private void getCategory__329793792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-329793792L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateVisibility(Lnet/minecraft/client/ClientRecipeBook;)Z", cancellable = true)
    private void updateVisibility__844363970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-844363970L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "startAnimation(Lnet/minecraft/client/ClientRecipeBook;Z)V", cancellable = true)
    private void startAnimation__821770342(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-821770342L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractContents(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractContents_630443030(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(630443030L))
            info.cancel();
    }


}

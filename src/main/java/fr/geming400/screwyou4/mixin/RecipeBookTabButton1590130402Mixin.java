package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.recipebook.RecipeBookTabButton.class)
public class RecipeBookTabButton1590130402Mixin {
        @Inject(at = @At("HEAD"), method = "select()V", cancellable = true)
    private void select_1752565273(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1752565273L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCategory()Lnet/minecraft/world/item/crafting/ExtendedRecipeBookCategory;", cancellable = true)
    private void getCategory__893760396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-893760396L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractContents(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractContents__1722643717(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1722643717L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unselect()V", cancellable = true)
    private void unselect__1196618272(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1196618272L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateVisibility(Lnet/minecraft/client/ClientRecipeBook;)Z", cancellable = true)
    private void updateVisibility_55896953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(55896953L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "startAnimation(Lnet/minecraft/client/ClientRecipeBook;Z)V", cancellable = true)
    private void startAnimation_1056384408(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1056384408L))
            info.cancel();
    }


}

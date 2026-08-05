package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.recipebook.RecipeBookPage.class)
public class RecipeBookPage_1614058128Mixin {
        @Inject(at = @At("HEAD"), method = "init(Lnet/minecraft/client/Minecraft;II)V", cancellable = true)
    private void init_506293460(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(506293460L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractTooltip(Lnet/minecraft/client/gui/GuiGraphicsExtractor;II)V", cancellable = true)
    private void extractTooltip__1465735337(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1465735337L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setInvisible()V", cancellable = true)
    private void setInvisible_1652332866(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1652332866L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIIIF)V", cancellable = true)
    private void extractRenderState_2014037475(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2014037475L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRecipeBook()Lnet/minecraft/client/ClientRecipeBook;", cancellable = true)
    private void getRecipeBook__399966111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-399966111L))
            info.setReturnValue(new net.minecraft.client.ClientRecipeBook());
    }

    @Inject(at = @At("HEAD"), method = "recipeShown(Lnet/minecraft/world/item/crafting/display/RecipeDisplayId;)V", cancellable = true)
    private void recipeShown__318820167(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-318820167L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateCollections(Ljava/util/List;ZZ)V", cancellable = true)
    private void updateCollections_1488502003(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1488502003L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLastClickedRecipe()Lnet/minecraft/world/item/crafting/display/RecipeDisplayId;", cancellable = true)
    private void getLastClickedRecipe__1522483149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1522483149L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;IIIIZ)Z", cancellable = true)
    private void mouseClicked__1274519919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1274519919L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getLastClickedRecipeCollection()Lnet/minecraft/client/gui/screens/recipebook/RecipeCollection;", cancellable = true)
    private void getLastClickedRecipeCollection_1119594757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1119594757L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.recipebook.RecipeBookPage.class)
public class RecipeBookPage_1614058128Mixin {
        @Inject(at = @At("HEAD"), method = "init(Lnet/minecraft/client/Minecraft;II)V", cancellable = true)
    private void init_2059630020(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2059630020L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setInvisible()V", cancellable = true)
    private void setInvisible_633066167(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(633066167L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRecipeBook()Lnet/minecraft/client/ClientRecipeBook;", cancellable = true)
    private void getRecipeBook__362765132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-362765132L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractTooltip(Lnet/minecraft/client/gui/GuiGraphicsExtractor;II)V", cancellable = true)
    private void extractTooltip_2003585561(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2003585561L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;IIIIZ)Z", cancellable = true)
    private void mouseClicked_1296561295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1296561295L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIIIF)V", cancellable = true)
    private void extractRenderState_59196873(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(59196873L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateCollections(Ljava/util/List;ZZ)V", cancellable = true)
    private void updateCollections_1424974439(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1424974439L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLastClickedRecipe()Lnet/minecraft/world/item/crafting/display/RecipeDisplayId;", cancellable = true)
    private void getLastClickedRecipe_74573354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(74573354L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipeShown(Lnet/minecraft/world/item/crafting/display/RecipeDisplayId;)V", cancellable = true)
    private void recipeShown_1952850140(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1952850140L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLastClickedRecipeCollection()Lnet/minecraft/client/gui/screens/recipebook/RecipeCollection;", cancellable = true)
    private void getLastClickedRecipeCollection__303886420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-303886420L))
            info.setReturnValue(null);
    }


}

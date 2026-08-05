package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.recipebook.OverlayRecipeComponent.class)
public class OverlayRecipeComponent1115414281Mixin {
        @Inject(at = @At("HEAD"), method = "init(Lnet/minecraft/client/gui/screens/recipebook/RecipeCollection;Lnet/minecraft/util/context/ContextMap;ZIIIIF)V", cancellable = true)
    private void init__731898110(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-731898110L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFocused()Z", cancellable = true)
    private void isFocused_1153692864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1153692864L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isVisible()Z", cancellable = true)
    private void isVisible_1153692864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1153692864L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_155726909(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(155726909L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setFocused(Z)V", cancellable = true)
    private void setFocused__1949936186(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1949936186L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setVisible(Z)V", cancellable = true)
    private void setVisible__1949936186(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1949936186L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked__499244597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-499244597L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isMouseOver(DD)Z", cancellable = true)
    private void isMouseOver__28224704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-28224704L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getRecipeCollection()Lnet/minecraft/client/gui/screens/recipebook/RecipeCollection;", cancellable = true)
    private void getRecipeCollection_620950911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(620950911L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLastRecipeClicked()Lnet/minecraft/world/item/crafting/display/RecipeDisplayId;", cancellable = true)
    private void getLastRecipeClicked__2021126995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2021126995L))
            info.setReturnValue(null);
    }


}

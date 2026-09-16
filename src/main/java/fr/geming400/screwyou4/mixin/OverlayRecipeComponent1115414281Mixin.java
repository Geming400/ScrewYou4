package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.recipebook.OverlayRecipeComponent.class)
public class OverlayRecipeComponent1115414281Mixin {
        @Inject(at = @At("HEAD"), method = "init(Lnet/minecraft/client/gui/screens/recipebook/RecipeCollection;Lnet/minecraft/util/context/ContextMap;ZIIIIF)V", cancellable = true)
    private void init_1111270418(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1111270418L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFocused()Z", cancellable = true)
    private void isFocused_648211955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(648211955L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setFocused(Z)V", cancellable = true)
    private void setFocused__1262661957(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1262661957L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isVisible()Z", cancellable = true)
    private void isVisible_63925720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(63925720L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isMouseOver(DD)Z", cancellable = true)
    private void isMouseOver_1601896273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1601896273L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked_574908105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(574908105L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_2102293923(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2102293923L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setVisible(Z)V", cancellable = true)
    private void setVisible_2099301238(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2099301238L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRecipeCollection()Lnet/minecraft/client/gui/screens/recipebook/RecipeCollection;", cancellable = true)
    private void getRecipeCollection_339512129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(339512129L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLastRecipeClicked()Lnet/minecraft/world/item/crafting/display/RecipeDisplayId;", cancellable = true)
    private void getLastRecipeClicked__1858027520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1858027520L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.recipebook.RecipeButton.class)
public class RecipeButton1948747658Mixin {
        @Inject(at = @At("HEAD"), method = "init(Lnet/minecraft/client/gui/screens/recipebook/RecipeCollection;ZLnet/minecraft/client/gui/screens/recipebook/RecipeBookPage;Lnet/minecraft/util/context/ContextMap;)V", cancellable = true)
    private void init__2038189458(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2038189458L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCollection()Lnet/minecraft/client/gui/screens/recipebook/RecipeCollection;", cancellable = true)
    private void getCollection__1966141548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1966141548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth_10851168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(10851168L))
            info.setReturnValue(1804323136);
    }

    @Inject(at = @At("HEAD"), method = "updateWidgetNarration(Lnet/minecraft/client/gui/narration/NarrationElementOutput;)V", cancellable = true)
    private void updateWidgetNarration_324883101(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(324883101L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractWidgetRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractWidgetRenderState__1258535224(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1258535224L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDisplayStack()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getDisplayStack_1092693258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1092693258L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTooltipText(Lnet/minecraft/world/item/ItemStack;)Ljava/util/List;", cancellable = true)
    private void getTooltipText_645068175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(645068175L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCurrentRecipe()Lnet/minecraft/world/item/crafting/display/RecipeDisplayId;", cancellable = true)
    private void getCurrentRecipe_1624303197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1624303197L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOnlyOption()Z", cancellable = true)
    private void isOnlyOption_863882262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(863882262L))
            info.setReturnValue(false);
    }


}
